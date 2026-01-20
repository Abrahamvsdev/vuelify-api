package com.vuelify_api.service;

import java.util.UUID;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.NullMarked;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vuelify_api.domain.Flight;
import com.vuelify_api.dto.CreateFlightRequest;
import com.vuelify_api.repository.FlightRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@NullMarked
public class FlightService {

    private final FlightRepository flightRepository;

    @Transactional
    public Flight createFlight(@NonNull CreateFlightRequest request) {
        Flight newFlight = Flight.builder()
                .flightNumber(request.flightNumber())
                .code(request.code())
                .origin(request.origin())
                .destination(request.destination())
                .price(request.price())
                .departureTime(request.departureTime())
                .build();

        return flightRepository.save(newFlight);
    }

    @Transactional(readOnly = true)
    public @NonNull
    Flight getFlightById(@NonNull UUID id) {
        return flightRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Flight not found with ID: " + id)); //TODO Must change when organice exceptions
    }

    @Transactional(readOnly = true)
    public @NonNull
    Flight getFlightByCode(@NonNull String code) {
        return flightRepository.findByCode(code)
                .orElseThrow(() -> new RuntimeException("Ups.. there is no flght with this code you provided: " + code));//TODO Must change when organice exceptions
    }

}
