package com.vuelify_api.passenger.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vuelify_api.passenger.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, UUID> {
    Optional<Passenger> findByPassportNumber(String passportNumber);
}
