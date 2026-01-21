package com.vuelify_api.shared.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    protected LocalDateTime completeDateStart;
    protected LocalDateTime completeDateEnd;

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
