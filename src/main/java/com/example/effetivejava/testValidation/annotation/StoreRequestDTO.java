package com.example.effetivejava.testValidation.annotation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class StoreRequestDTO {

    @NotNull(message = "storeCode is required")
    private String storeCode;

    @NotNull(message = "corporationCode is required")
    private String corporationCode;

    private String type;
    @RequiredForDelivery
    private String address;
}
