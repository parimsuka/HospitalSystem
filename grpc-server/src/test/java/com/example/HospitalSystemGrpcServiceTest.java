package com.example;

import com.example.hospital.*;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(properties = {
        "grpc.server.inProcessName=test", // Enable inProcess server
        "grpc.server.port=-1", // Disable external server
        "grpc.client.inProcess.address=in-process:test" // Configure the client to connect to the inProcess server
})
@ActiveProfiles("testing")
@SpringJUnitConfig(classes = {HospitalSystemGrpcServiceTestConfiguration.class})
@DirtiesContext // Ensures that the grpc-server is properly shutdown after each test
@EnableAutoConfiguration
@TestMethodOrder(MethodOrderer.MethodName.class)
public class HospitalSystemGrpcServiceTest {
    Logger logger = LoggerFactory.getLogger(getClass());

    @GrpcClient("inProcess")
    private HospitalServiceGrpc.HospitalServiceBlockingStub grpcService;

    @Test
    @DirtiesContext
    public void test1CreateHospitals() {
        for (CreateHospitalRequest request : new CreateHospitalRequest[]{
                CreateHospitalRequest.newBuilder()
                        .setName("A Hospital").setAddress("43686 Lotheville Plaza")
                        .build(),
                CreateHospitalRequest.newBuilder()
                        .setName("B Hospital").setAddress("54 Cordelia Road")
                        .build(),
        }
        ) {
            // Create the hospital.
            CreateHospitalResponse response = grpcService.createHospital(request);
            assertNotNull(response);

            // Get the hospital and check.
            GetHospitalRequest getHospitalReq = GetHospitalRequest.newBuilder().setId(response.getHospital().getId()).build();
            GetHospitalResponse getHospitalResp = grpcService.getHospital(getHospitalReq);
            assertEquals(request.getName(), getHospitalResp.getHospital().getName());
            assertEquals(request.getAddress(), getHospitalResp.getHospital().getAddress());
        }
    }

    @Test
    @DirtiesContext
    public void test2CreatePatients() {
        for (CreatePatientRequest request : new CreatePatientRequest[]{
                CreatePatientRequest.newBuilder()
                        .setName("Patient 1").setSex("Female").setAge("21").setPhone("123456").setAddress("Address example 1")
                        .build(),
                CreatePatientRequest.newBuilder()
                        .setName("Patient 2").setSex("Male").setAge("23").setPhone("123456").setAddress("Address example 2")
                        .build(),
        }
        ) {
            // Create the patient.
            CreatePatientResponse response = grpcService.createPatient(request);
            assertNotNull(response);

            // Get the patient and check.
            GetPatientRequest getPatientReq = GetPatientRequest.newBuilder().setId(response.getPatient().getId()).build();
            GetPatientResponse getPatientResp = grpcService.getPatient(getPatientReq);
            assertEquals(request.getName(), getPatientResp.getPatient().getName());
            assertEquals(request.getSex(), getPatientResp.getPatient().getSex());
            assertEquals(request.getAge(), getPatientResp.getPatient().getAge());
            assertEquals(request.getPhone(), getPatientResp.getPatient().getPhone());
            assertEquals(request.getAddress(), getPatientResp.getPatient().getAddress());
        }
    }

    @Test
    @DirtiesContext
    public void test3UpdateHospital() {
        // ID 1 already exists
        HospitalProto request = HospitalProto.newBuilder().setId(1).setName("A Hospital")
                .setAddress("1111 Lotheville Plaza")
                .build();
        // Update the hospital.
        HospitalProto response = grpcService.updateHospital(request);
        assertNotNull(response);
        logger.warn(response.toString());

        // Get the hospital and check.
        GetHospitalRequest getHospitalReq = GetHospitalRequest.newBuilder().setId(response.getId()).build();
        GetHospitalResponse getHospitalResp = grpcService.getHospital(getHospitalReq);
        assertEquals(request.getName(), getHospitalResp.getHospital().getName());
        assertEquals(request.getAddress(), getHospitalResp.getHospital().getAddress());
    }

    @Test
    @DirtiesContext
    public void test4UpdateHospitalNotExists() {
        // ID 999 does not exist
        HospitalProto request = HospitalProto.newBuilder().setId(999).setName("A Hospital")
                .setAddress("1111 Lotheville Plaza")
                .build();

        assertThrows(StatusRuntimeException.class,
                () -> grpcService.updateHospital(request));

//        try {
//            grpcService.updateHospital(request);
//        } catch (StatusRuntimeException e) {
//            assertEquals(Status.NOT_FOUND.getCode(), e.getStatus().getCode());
//        }

//        StatusRuntimeException exception = assertThrows(StatusRuntimeException.class,
//                () -> grpcService.updateHospital(request));
//
//        assertEquals(Status.NOT_FOUND.getCode(), exception.getStatus().getCode());

//        assertThrows(EntityNotFoundException.class,
//                () -> grpcService.updateHospital(request));
    }

    @Test
    @DirtiesContext
    public void test5RegisterPatient() {
        // Register patient 1 in hospital 1 and 2.
        RegisterPatientResponse response = grpcService.registerPatientInHospital(
                RegisterPatientRequest.newBuilder().setPatientId(1).setHospitalId(1).build()
        );
        assertNotNull(response);

        response = grpcService.registerPatientInHospital(
                RegisterPatientRequest.newBuilder().setPatientId(1).setHospitalId(2).build()
        );
        assertNotNull(response);

        // Check patient
        GetPatientResponse getPatientResp = grpcService.getPatient(
                GetPatientRequest.newBuilder().setId(1).build()
        );
        assertNotNull(getPatientResp);
        assertEquals(2, getPatientResp.getHospitalsCount());

        // Check hospital 1
        GetHospitalResponse getHospitalResp = grpcService.getHospital(
                GetHospitalRequest.newBuilder().setId(1).build()
        );
        assertNotNull(getHospitalResp);
        assertEquals(1, getHospitalResp.getPatientsCount());
        assertEquals(1, getHospitalResp.getPatients(0).getId());

        // Check hospital 2
        getHospitalResp = grpcService.getHospital(
                GetHospitalRequest.newBuilder().setId(2).build()
        );
        assertNotNull(getHospitalResp);
        assertEquals(1, getHospitalResp.getPatientsCount());
        assertEquals(1, getHospitalResp.getPatients(0).getId());
    }

    @Test
    @DirtiesContext
    public void test6UnregisterPatient() {
        // Unregister patient 1 from hospital 1
        RegisterPatientResponse response = grpcService.unRegisterPatientInHospital(
                RegisterPatientRequest.newBuilder().setPatientId(1).setHospitalId(1).build()
        );
        assertNotNull(response);

        // Check patient
        GetPatientResponse getPatientResp = grpcService.getPatient(
                GetPatientRequest.newBuilder().setId(1).build()
        );
        assertNotNull(getPatientResp);
        assertEquals(1, getPatientResp.getHospitalsCount());
        assertEquals(2, getPatientResp.getHospitals(0).getId());

        // Check hospital
        GetHospitalResponse getHospitalResp = grpcService.getHospital(
                GetHospitalRequest.newBuilder().setId(1).build()
        );
        assertNotNull(getHospitalResp);
        assertEquals(0, getHospitalResp.getPatientsCount());
    }

    @Test
    @DirtiesContext
    public void test7DeletePatient() {
        // Delete the patient.
        DeletePatientResponse response = grpcService.deletePatient(
                DeletePatientRequest.newBuilder().setId(1).build()
        );
        assertNotNull(response);

        assertThrows(StatusRuntimeException.class,
                () -> grpcService.getPatient(GetPatientRequest.newBuilder().setId(1).build()));

        // Get the hospital where previously the patient registered.
        GetHospitalResponse getHospitalResp = grpcService.getHospital(
                GetHospitalRequest.newBuilder().setId(1).build()
        );
        assertNotNull(getHospitalResp);
        assertEquals(0, getHospitalResp.getPatientsCount());
    }
}
