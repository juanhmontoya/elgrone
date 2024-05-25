package com.example.elgrone.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class MockController {

    @GetMapping
    public ResponseEntity<String> ping() {
        String responseBody = "pong";
        return ResponseEntity.ok(responseBody);
    }
}
