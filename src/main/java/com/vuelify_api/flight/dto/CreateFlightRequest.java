package com.vuelify_api.flight.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record CreateFlightRequest(

    @NotBlank String flightNumber,
    @NotBlank String code,
    @NotBlank String origin,
    @NotBlank String destination,
    @NotBlank @Positive BigDecimal price,
    @NotNull LocalDateTime departureTime
    
) {}
