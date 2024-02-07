package com.example.exception;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityNotFoundException;

@GrpcAdvice
public class GrpcExceptionAdvice {
    Logger logger = LoggerFactory.getLogger(getClass());

    @GrpcExceptionHandler(IllegalArgumentException.class)
    public Status handleInvalidArgument(IllegalArgumentException e) {
        return Status.INVALID_ARGUMENT.withDescription(e.getMessage()).withCause(e);
    }

    @GrpcExceptionHandler(EntityNotFoundException.class)
    public Status handleEntityNotFoundException(EntityNotFoundException e) {
        return Status.NOT_FOUND.withDescription(e.getMessage()).withCause(e);
    }

    @GrpcExceptionHandler(ValidationException.class)
    public StatusRuntimeException handleValidationException(ValidationException e) {
//        return Status.FAILED_PRECONDITION.withDescription(e.getMessage()).withCause(e);
        return Status.INTERNAL.withDescription(e.getMessage()).asRuntimeException();
    }

    @GrpcExceptionHandler
    public Status handleException(Exception e) {
        return Status.FAILED_PRECONDITION.withDescription(e.getMessage()).withCause(e);

//        logger.error("Exception: " + e);
//        Status status = Status.INTERNAL.withDescription("Internal server error");
    }
}
