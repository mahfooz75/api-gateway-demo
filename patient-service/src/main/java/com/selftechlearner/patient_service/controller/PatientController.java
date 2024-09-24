package com.selftechlearner.patient_service.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
@Slf4j
public class PatientController {


    @GetMapping
    public String getPatients(HttpServletRequest request) {
        return "Getting response from patient service where method is " + request.getMethod() + " and port " + request.getServerPort();
    }

    @PostMapping
    public String addPatients(HttpServletRequest request) {
        return "Getting response from patient service where method is " + request.getMethod() + " and port " + request.getServerPort();
    }
}
