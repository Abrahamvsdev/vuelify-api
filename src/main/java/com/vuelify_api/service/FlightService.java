package com.vuelify_api.service;



import org.jspecify.annotations.NullMarked;
import org.springframework.stereotype.Service;

import com.vuelify_api.domain.Flight;
import com.vuelify_api.dto.CreateFlightRequest;
import com.vuelify_api.repository.FlightRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;

    @NullMarked
    public Flight createFlight(CreateFlightRequest request) {
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
