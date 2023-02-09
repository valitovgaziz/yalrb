package ru.yalrb.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "rate", columnDefinition = "integer default 0")
    Integer rate = 0;

    @OneToOne
    @MapsId
    @JoinColumn(name = "yal_object_id")
    Yal_Object yal_object;

}
