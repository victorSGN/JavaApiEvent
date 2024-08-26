package com.eventoStack.api.domain.coupon;
import com.eventoStack.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Entity
@Table(name = "coupon")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue
    private UUID id;
    private String code;
    private String discount;
    private String valid;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
