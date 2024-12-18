package com.meditrack.notificationservice.exception;

import com.meditrack.notificationservice.constant.ErrorCode;
import lombok.Getter;

@Getter
public class notificationserviceNotFoundException extends Exception {
    private final ErrorCode errorCode;

    public notificationserviceNotFoundException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
}
