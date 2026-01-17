package com.vuelify_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreatePassengerRequest(

    @NotNull @NotBlank String passportNumber,
    @NotNull @NotBlank String firstName,
    @NotBlank String lastName,
    @Email String email
    
) {}
