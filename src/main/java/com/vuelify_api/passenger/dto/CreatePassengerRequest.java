package com.vuelify_api.passenger.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CreatePassengerRequest(

    @NotBlank String passportNumber,
    @NotBlank String firstName,
    @NotBlank String lastName,
    @Email String email
    
) {}
