package com.vuelify_api.passenger.service;

import java.util.UUID;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.NullMarked;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vuelify_api.passenger.dto.CreatePassengerRequest;
import com.vuelify_api.passenger.model.Passenger;
import com.vuelify_api.passenger.repository.PassengerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@NullMarked
public class PassengerService {

    private final PassengerRepository passengerRepository;

    @Transactional
    public Passenger createPassenger(@NonNull CreatePassengerRequest request) {
        Passenger newPassenger = Passenger.builder()
                .passportNumber(request.passportNumber())
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .loyaltyPoints(0)
                .build();

        return passengerRepository.save(newPassenger);
    }

    @Transactional(readOnly = true)
    public @NonNull Passenger getPassengerById(@NonNull UUID id) {
        return passengerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Passenger not found with ID: " + id)); // TODO Must change when
                                                                                                // organice exceptions)
    }

    @Transactional(readOnly = true)
    public @NonNull Passenger getPassengerByPassport(@NonNull String passportNumber) {
        return passengerRepository.findByPassportNumber(passportNumber)
                .orElseThrow(() -> new RuntimeException("Passenger not found with passport number: " + passportNumber));
    }

}
