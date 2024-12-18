package com.meditrack.notificationservice.exception;


import lombok.Getter;

@Getter
public class notificationserviceInvalidRequestException extends Exception {
    private final ErrorCode errorCode;

    public notificationserviceInvalidRequestException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
}