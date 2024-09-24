package com.selftechlearner.doctor_service.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor
@Slf4j
public class DoctorController {

    @GetMapping
    public String getDoctor(HttpServletRequest request) {
        return "Getting response from doctor service where method is " + request.getMethod() + " and port " + request.getServerPort();
    }

    @PostMapping
    public String addDoctor(HttpServletRequest request) {
        return "Getting response from doctor service where method is " + request.getMethod() + " and port " + request.getServerPort();
    }
}
