package com.vuelify_api.service;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.NullMarked;
import org.springframework.stereotype.Service;

import com.vuelify_api.domain.Flight;
import com.vuelify_api.dto.CreateFlightRequest;
import com.vuelify_api.repository.FlightRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@NullMarked
public class FlightService {

    private final FlightRepository flightRepository;

    public Flight createFlight(@NonNull CreateFlightRequest request) {
        Flight newFlight = new Flight(
                request.flightNumber(),
                request.code(),
                request.origin(),
                request.destination(),
                request.price(),
                request.departureTime()
        );

        return flightRepository.save(newFlight);
    }

}
