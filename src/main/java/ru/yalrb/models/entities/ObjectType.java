package ru.yalrb.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "object_type")
public class ObjectType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "yal_object_id", referencedColumnName = "id")
    Yal_Object yal_object;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;


}
