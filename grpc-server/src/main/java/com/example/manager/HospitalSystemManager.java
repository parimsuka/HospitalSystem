package com.example.manager;

import com.example.entity.Hospital;
import com.example.entity.Patient;
import com.example.hospital.HospitalProto;
import com.example.hospital.PatientProto;
import com.example.repository.HospitalRepository;
import com.example.repository.PatientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class HospitalSystemManager {
    @Autowired
    private HospitalRepository hospitalRepository;

    @Autowired
    private PatientRepository patientRepository;

    public Hospital createHospital(Hospital hospital) {
        return hospitalRepository.saveAndFlush(hospital);
    }

    public Optional<Hospital> updateHospital(HospitalProto hospitalUpdate) {
        Optional<Hospital> optionalHospital = hospitalRepository.findById(hospitalUpdate.getId());
        if (optionalHospital.isEmpty()) {
            throw new EntityNotFoundException("Hospital not found for ID: " + hospitalUpdate.getId());
        }
        Hospital hospital = optionalHospital.get();
        BeanUtils.copyProperties(hospitalUpdate, hospital);
        hospitalRepository.saveAndFlush(hospital);
        return Optional.of(hospital);
    }

    public void deleteHospital(long id) {
        Optional<Hospital> optionalHospital = hospitalRepository.findById(id);
        optionalHospital.ifPresent(hospital -> hospitalRepository.delete(hospital));
        patientRepository.flush();
    }

    public Optional<Hospital> getHospital(long id) {
        Optional<Hospital> optionalHospital = hospitalRepository.findById(id);
        if (optionalHospital.isEmpty()) {
            throw new EntityNotFoundException("Hospital not found for ID: " + id);
        }
        return optionalHospital;
    }

    public Patient createPatient(Patient patient) {
        return patientRepository.saveAndFlush(patient);
    }

    public Optional<Patient> updatePatient(PatientProto patientUpdate) {
        Optional<Patient> optionalPatient = patientRepository.findById(patientUpdate.getId());
        if (optionalPatient.isEmpty()) {
            throw new EntityNotFoundException("Patient not found for ID: " + patientUpdate.getId());
        }
        Patient patient = optionalPatient.get();
        BeanUtils.copyProperties(patientUpdate, patient);
        patientRepository.saveAndFlush(patient);
        return Optional.of(patient);
    }

    public void deletePatient(long id) {
        Optional<Patient> optionalPatient = patientRepository.findById(id);

        optionalPatient.ifPresent(patient -> {
            // Unregister the patient from all hospitals
            patient.getHospitals().forEach(hospital -> hospital.getPatients().remove(patient));
            patientRepository.delete(patient);
        });
        patientRepository.flush();
    }

    public Optional<Patient> getPatient(long id) {
        Optional<Patient> optionalPatient = patientRepository.findById(id);
        if (optionalPatient.isEmpty()) {
            throw new EntityNotFoundException("Patient not found for ID: " + id);
        }
        return optionalPatient;
    }

    public void registerPatientInHospital(long patientId, long hospitalId) {
        Optional<Hospital> optionalHospital = hospitalRepository.findById(hospitalId);
        if (optionalHospital.isEmpty()) {
            throw new EntityNotFoundException("Hospital not found for ID: " + hospitalId);
        }
        Optional<Patient> optionalPatient = patientRepository.findById(patientId);
        if (optionalPatient.isEmpty()) {
            throw new EntityNotFoundException("Patient not found for ID: " + patientId);
        }
        Hospital hospital = optionalHospital.get();
        hospital.getPatients().add(optionalPatient.get());
    }

    public void unRegisterPatientInHospital(long patientId, long hospitalId) {
        Optional<Hospital> optionalHospital = hospitalRepository.findById(hospitalId);
        if (optionalHospital.isEmpty()) {
            throw new EntityNotFoundException("Hospital not found for ID: " + hospitalId);
        }
        Optional<Patient> optionalPatient = patientRepository.findById(patientId);
        if (optionalPatient.isEmpty()) {
            throw new EntityNotFoundException("Patient not found for ID: " + patientId);
        }
        Hospital hospital = optionalHospital.get();
        hospital.getPatients().remove(optionalPatient.get());
    }
}
