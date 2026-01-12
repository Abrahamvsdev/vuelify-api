package com.vuelify_api.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ticket_addons")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketAddon {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ticket_id", nullable = false)
    private Ticket ticket;

    @Enumerated(EnumType.STRING)
    private AddonType addonType;

    private BigDecimal price;


    private List<TicketAddon> addons = new ArrayList<>();
}
