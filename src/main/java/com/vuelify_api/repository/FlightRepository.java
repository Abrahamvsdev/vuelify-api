package com.vuelify_api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vuelify_api.domain.Flight;

public interface FlightRepository extends JpaRepository<Flight, UUID>{

}
