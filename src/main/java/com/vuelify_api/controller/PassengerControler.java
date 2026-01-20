package com.vuelify_api.controller;

import org.jspecify.annotations.NullMarked;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vuelify_api.service.PassengerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/passengers")
@RequiredArgsConstructor
@NullMarked
public class PassengerControler {

    private final PassengerService passengerService;
}
