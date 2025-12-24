package com.vuelify_api.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    protected LocalDateTime completeDateStart;
    protected LocalDateTime completeDateEnd;

    public Operation() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getCompleteDateStart() {
        return completeDateStart;
    }

    public void setCompleteDateStart(LocalDateTime completeDateStart) {
        this.completeDateStart = completeDateStart;
    }

    public LocalDateTime getCompleteDateEnd() {
        return completeDateEnd;
    }

    public void setCompleteDateEnd(LocalDateTime completeDateEnd) {
        this.completeDateEnd = completeDateEnd;
    }

    

}
