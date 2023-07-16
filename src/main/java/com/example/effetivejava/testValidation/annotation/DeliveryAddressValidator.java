package com.example.effetivejava.testValidation.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DeliveryAddressValidator implements ConstraintValidator<RequiredForDelivery, StoreRequestDTO> {

    @Override
    public void initialize(RequiredForDelivery constraintAnnotation) {
    }

    @Override
    public boolean isValid(StoreRequestDTO request, ConstraintValidatorContext context) {
        if ("delivery".equals(request.getType()) && request.getAddress() == null) {
            return false;
        }
        return true;
    }
}

