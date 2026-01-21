package com.vuelify_api.flight.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vuelify_api.flight.model.Flight;


public interface FlightRepository extends JpaRepository<Flight, UUID>{

    Optional<Flight> findByCode(String code);

}
