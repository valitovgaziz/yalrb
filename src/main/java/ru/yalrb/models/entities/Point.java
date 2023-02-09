package ru.yalrb.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "level")
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "yal_object_id")
    Yal_Object yal_object;

    @Column(name = "longitude", columnDefinition = "float default 0.0")
    float longitude;

    @Column(name = "latitude", columnDefinition = "float default 0.0")
    float latitude;

}
