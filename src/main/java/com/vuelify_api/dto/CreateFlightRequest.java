package com.vuelify_api.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;

public record CreateFlightRequest(

    @NotNull String flightNumber,
    @NotNull String code,
    @NotNull String origin,
    @NotNull String destination,
    @NotNull BigDecimal price,
    @NotNull LocalDateTime departureTime
    
) {}
