package com.walkoding.websocketsnosecurity.dto;

import lombok.Data;

@Data
public class StepGetOtpSpeechDTO {


    private String flowId;

    private String message;

    private StepMetadataDTO metadata;
}
