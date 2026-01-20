package com.vuelify_api.controller;

import java.net.URI;
import java.util.UUID;

import org.jspecify.annotations.NullMarked;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@NullMarked
public class FlightController {

    private final FlightService flightService;

    @PostMapping
    public ResponseEntity<Flight> registerFlight(@RequestBody @Valid CreateFlightRequest request) {
        Flight flightCreated = flightService.createFlight(request);
        return ResponseEntity.created(URI.create("/api/flights/" + flightCreated.getId())).body(flightCreated);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable UUID id) {
        Flight flightFoundById = flightService.getFlightById(id);
        return ResponseEntity.ok(flightFoundById);
    }

    @GetMapping("/code/{code}") // TODO Path must change when "findAll" enters in the game
    public ResponseEntity<Flight> getFlightByCode(@PathVariable String code) {
        Flight flightFoundByCode = flightService.getFlightByCode(code);
        return ResponseEntity.ok(flightFoundByCode);
    }

}
