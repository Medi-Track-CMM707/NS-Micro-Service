package com.meditrack.notificationservice.model.dto;

public record ErrorResponseDTO(String errorCode, String errorMessage, Object additionalInformation) {

}

