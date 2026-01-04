package com.vuelify_api.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vuelify_api.domain.Flight;
import com.vuelify_api.dto.CreateFlightRequest;
import com.vuelify_api.service.FlightService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/flights")
@RequiredArgsConstructor
public class FlightController {

    private final FlightService flightService;

    @PostMapping
    public ResponseEntity<Flight> registerFlight(@RequestBody @Valid CreateFlightRequest request){
        
        Flight flightCreated = flightService.createFlight(request);

        return ResponseEntity.created(URI.create("/api/flights/"+ flightCreated.getId())).body(flightCreated);
    } 
}
