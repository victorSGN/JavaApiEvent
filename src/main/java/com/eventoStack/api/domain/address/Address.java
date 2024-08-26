package com.eventoStack.api.domain.address;

import com.eventoStack.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "address")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue
    private UUID id;
    private String city;
    private String uf;
    private String valid;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
