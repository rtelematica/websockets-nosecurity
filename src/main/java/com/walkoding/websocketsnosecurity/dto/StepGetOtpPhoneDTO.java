package com.walkoding.websocketsnosecurity.dto;


import lombok.Data;


@Data
public class StepGetOtpPhoneDTO {




    private String flowId;


    private String phone;

    private StepMetadataDTO metadata;
}
