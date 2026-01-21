package com.vuelify_api.passenger.controller;

import java.net.URI;
import java.util.UUID;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.NullMarked;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vuelify_api.passenger.dto.CreatePassengerRequest;
import com.vuelify_api.passenger.model.Passenger;
import com.vuelify_api.passenger.service.PassengerService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/passengers")
@RequiredArgsConstructor
@NullMarked
public class PassengerControler {

    private final PassengerService passengerService;

    @PostMapping
    public ResponseEntity<Passenger> registerPassenger(@Valid @RequestBody @NonNull CreatePassengerRequest request) {
        Passenger passengerCreated = passengerService.createPassenger(request);
        return ResponseEntity.created(URI.create("/api/passengers" + passengerCreated.getId())).body(passengerCreated);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable @NonNull UUID id) {
        Passenger passengerFoundById = passengerService.getPassengerById(id);
        return ResponseEntity.ok(passengerFoundById);
    }

    // TODO Path must change when "findAll" enters in the game
    // ? Do I need create the findAllPassengersByFlight? If response id yes, I'll
    // ? need to change this path
    @GetMapping("/passportnumber/{passportNumber}")
    public ResponseEntity<Passenger> getPassengerByPassportNumber(@PathVariable @NonNull String passportNumber) {
        Passenger passengerFoundByPassportNumber = passengerService.getPassengerByPassport(passportNumber);
        return ResponseEntity.ok(passengerFoundByPassportNumber);
    }

}
