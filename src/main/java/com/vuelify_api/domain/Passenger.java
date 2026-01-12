package com.vuelify_api.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "customers")
@DiscriminatorValue("PASSENGER") // If in the DB sais Pssenger is this very class
@Data
@EqualsAndHashCode(callSuper = true) // Lombok includes the parent's fields in equals
public class Passenger extends Person {

    private int loyaltyPoints;
    

}
