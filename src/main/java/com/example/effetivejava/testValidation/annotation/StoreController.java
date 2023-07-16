package com.example.effetivejava.testValidation.annotation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class StoreController {

    @PostMapping("/stores")
    public ResponseEntity<String> createStore(@Validated @RequestBody StoreRequestDTO request) {
        // 요청 처리 로직
        // ...

        return ResponseEntity.ok("Store created successfully.");
    }
}
