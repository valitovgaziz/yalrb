package ru.yalrb.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class LeisureType {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany
    Set<Yal_Object> yal_objectSet;

    @Column(name = "name", columnDefinition = "character(50) default 'none'")
    String name;

    @Column(name = "description", columnDefinition = "character(1000) default 'none'")
    String description;
}
