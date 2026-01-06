package com.vuelify_api.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vuelify_api.domain.Flight;
import java.util.List;


public interface FlightRepository extends JpaRepository<Flight, UUID>{

    Optional<Flight> findByCode(String code);

}
