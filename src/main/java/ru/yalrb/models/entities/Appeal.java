package ru.yalrb.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Calendar;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Appeal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    String email;

    String phoneNumber;

    String theam;

    String appealText;

    State state;

    Calendar appealDateTime;

    String responseText;

    Calendar responseDateTime;

    @ManyToOne
    @JoinColumn(name = "moder_id", nullable = false)
    Account moder;

}
