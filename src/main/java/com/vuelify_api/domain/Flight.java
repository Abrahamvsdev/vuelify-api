package com.vuelify_api.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "flights")

public class Flight extends Operation {

    @Column(nullable = false)
    protected String origin;
    
    @Column(nullable = false)
    protected String destination;
    
    protected LocalDateTime departureTime;
    protected LocalDateTime arrivalTime;
    protected BigDecimal price;
    protected String code;
    protected String status = "SCHEDULED"; // SCHEDULED, ON_TIME, CANCELLED, DELAYED (PENDING DOING IT ENUM)

    @Column(nullable = false)
    private String flightNumber;

    public Flight(
            String flightNumber,
            String code,
            String origin,
            String destination,
            BigDecimal price,
            LocalDateTime departureTime
    ) {
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.price = price;
        this.code = code;
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    

}
