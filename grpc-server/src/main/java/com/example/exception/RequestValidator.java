package com.example.exception;

import com.example.hospital.*;

public class RequestValidator {

    public static void validateHospitalProto(HospitalProto hospitalProto) throws ValidationException {
        validatePositive(hospitalProto.getId(), "ID");
        validateNotEmpty(hospitalProto.getName(), "Name");
        validateNotEmpty(hospitalProto.getAddress(), "Address");
    }

    public static void validateCreateHospitalRequest(CreateHospitalRequest request) throws ValidationException {
        validateNotEmpty(request.getName(), "Name");
        validateNotEmpty(request.getAddress(), "Address");
    }

    public static void validateDeleteHospitalRequest(DeleteHospitalRequest request) throws ValidationException {
        validatePositive(request.getId(), "ID");
    }

    public static void validateGetHospitalRequest(GetHospitalRequest request) throws ValidationException {
        validatePositive(request.getId(), "ID");
    }

    public static void validatePatientProto(PatientProto patientProto) throws ValidationException {
        validatePositive(patientProto.getId(), "ID");
        validateNotEmpty(patientProto.getName(), "Name");
        validateNotEmpty(patientProto.getPhone(), "Phone");
        validateNotEmpty(patientProto.getAddress(), "Address");
    }

    public static void validateCreatePatientRequest(CreatePatientRequest request) throws ValidationException {
        validateNotEmpty(request.getName(), "Name");
        validateNotEmpty(request.getPhone(), "Phone");
        validateNotEmpty(request.getAddress(), "Address");
    }

    public static void validateDeletePatientRequest(DeletePatientRequest request) throws ValidationException {
        validatePositive(request.getId(), "ID");
    }

    public static void validateGetPatientRequest(GetPatientRequest request) throws ValidationException {
        validatePositive(request.getId(), "ID");
    }

    public static void validateRegisterPatientRequest(RegisterPatientRequest request) throws ValidationException {
        validatePositive(request.getPatientId(), "Patient ID");
        validatePositive(request.getHospitalId(), "Hospital ID");
    }


    private static void validateNotEmpty(String value, String fieldName) throws ValidationException {
        if (value == null || value.trim().isEmpty()) {
            throw new ValidationException(fieldName + " cannot be empty");
        }
    }

    private static void validatePositive(long value, String fieldName) throws ValidationException {
        if (value <= 0) {
            throw new ValidationException(fieldName + " must be positive");
        }
    }
}
