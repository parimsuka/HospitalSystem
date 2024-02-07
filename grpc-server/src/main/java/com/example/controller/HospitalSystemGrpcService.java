package com.example.controller;

import com.example.entity.Hospital;
import com.example.entity.Patient;
import com.example.exception.RequestValidator;
import com.example.manager.HospitalSystemManager;
import com.example.hospital.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@GrpcService
public class HospitalSystemGrpcService extends HospitalServiceGrpc.HospitalServiceImplBase {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private HospitalSystemManager hospitalSystemManager;

    @Override
    @Transactional
    public void createHospital(CreateHospitalRequest request, StreamObserver<CreateHospitalResponse> responseObserver) {
        RequestValidator.validateCreateHospitalRequest(request);

        Hospital hospital = hospitalSystemManager.createHospital(Hospital.fromGrpcType(request));

        CreateHospitalResponse.Builder response = CreateHospitalResponse.newBuilder();
        response.setHospital(hospital.toGrpcType());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void updateHospital(HospitalProto request, StreamObserver<HospitalProto> responseObserver) {
        RequestValidator.validateHospitalProto(request);

        Optional<Hospital> hospital = hospitalSystemManager.updateHospital(request);

        HospitalProto.Builder response = HospitalProto.newBuilder();

        response.mergeFrom(hospital.get().toGrpcType());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    @Override
    @Transactional
    public void deleteHospital(DeleteHospitalRequest request, StreamObserver<DeleteHospitalResponse> responseObserver) {
        RequestValidator.validateDeleteHospitalRequest(request);

        hospitalSystemManager.deleteHospital(request.getId());

        DeleteHospitalResponse.Builder response = DeleteHospitalResponse.newBuilder();
        response.setStatusCode(Status.OK.getCode().value());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void getHospital(GetHospitalRequest request, StreamObserver<GetHospitalResponse> responseObserver) {
        RequestValidator.validateGetHospitalRequest(request);

        Optional<Hospital> optionalHospital = hospitalSystemManager.getHospital(request.getId());
        Hospital hospital = optionalHospital.get();

        GetHospitalResponse.Builder response = GetHospitalResponse.newBuilder();
        for (Patient patient : hospital.getPatients()) {
            response.addPatients(patient.toGrpcType());
        }

        response.setHospital(hospital.toGrpcType());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void createPatient(CreatePatientRequest request, StreamObserver<CreatePatientResponse> responseObserver) {
        RequestValidator.validateCreatePatientRequest(request);

        Patient patient = hospitalSystemManager.createPatient(Patient.fromGrpcType(request));

        CreatePatientResponse.Builder response = CreatePatientResponse.newBuilder();
        response.setPatient(patient.toGrpcType());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void updatePatient(PatientProto request, StreamObserver<PatientProto> responseObserver) {
        RequestValidator.validatePatientProto(request);

        Optional<Patient> patient = hospitalSystemManager.updatePatient(request);

        PatientProto.Builder response = PatientProto.newBuilder();

        response.mergeFrom(patient.get().toGrpcType());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void deletePatient(DeletePatientRequest request, StreamObserver<DeletePatientResponse> responseObserver) {
        RequestValidator.validateDeletePatientRequest(request);

        hospitalSystemManager.deletePatient(request.getId());

        DeletePatientResponse.Builder response = DeletePatientResponse.newBuilder();
        response.setStatusCode(Status.OK.getCode().value());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void getPatient(GetPatientRequest request, StreamObserver<GetPatientResponse> responseObserver) {
        RequestValidator.validateGetPatientRequest(request);

        Optional<Patient> optionalPatient = hospitalSystemManager.getPatient(request.getId());
        Patient patient = optionalPatient.get();

        GetPatientResponse.Builder response = GetPatientResponse.newBuilder();
        for (Hospital hospital : patient.getHospitals()) {
            response.addHospitals(hospital.toGrpcType());
        }

        response.setPatient(patient.toGrpcType());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void registerPatientInHospital(RegisterPatientRequest request, StreamObserver<RegisterPatientResponse> responseObserver) {
        RequestValidator.validateRegisterPatientRequest(request);

        hospitalSystemManager.registerPatientInHospital(request.getPatientId(), request.getHospitalId());

        RegisterPatientResponse.Builder response = RegisterPatientResponse.newBuilder();
        response.setStatusCode(Status.OK.getCode().value());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void unRegisterPatientInHospital(RegisterPatientRequest request, StreamObserver<RegisterPatientResponse> responseObserver) {
        RequestValidator.validateRegisterPatientRequest(request);

        hospitalSystemManager.unRegisterPatientInHospital(request.getPatientId(), request.getHospitalId());

        RegisterPatientResponse.Builder response = RegisterPatientResponse.newBuilder();
        response.setStatusCode(Status.OK.getCode().value());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
