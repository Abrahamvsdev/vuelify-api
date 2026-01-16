package com.vuelify_api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "crew")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class CrewMember extends Person {

    private String licenseId;

    @Enumerated(EnumType.STRING)
    private CrewRole role;

}
