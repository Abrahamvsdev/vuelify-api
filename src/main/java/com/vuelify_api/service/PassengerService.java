package com.vuelify_api.service;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.NullMarked;
import org.springframework.stereotype.Service;

import com.vuelify_api.domain.Passenger;
import com.vuelify_api.dto.CreatePassengerRequest;
import com.vuelify_api.repository.PassengerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@NullMarked
public class PassengerService {

    private final PassengerRepository passengerRepository;

    public Passenger createPassenger(@NonNull CreatePassengerRequest request){
        Passenger newPassenger = new Passenger();
        
    }
}
