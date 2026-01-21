package com.vuelify_api.crew.dto;

import com.vuelify_api.crew.model.CrewRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record CreateCrewMemberRequest(
        @NotBlank String passportNumber,
        @NotBlank String firstName,
        @NotBlank String lastName,
        @Email String email,
        @NotNull int flightHours,
        @NotNull String licenseId,
        @NotNull CrewRole role) {

}
