package ru.yalrb.models.entities;


import jakarta.persistence.*;
import lombok.*;

import java.net.URL;
import java.util.Calendar;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yal_object_id", nullable = false)
    Yal_Object yal_object;

    @Column(name = "link_to_photo")
    String linkToPhoto;

    @Column(name = "name", columnDefinition = "character(50) default 'no name'")
    String name;

    @Column(name = "description", columnDefinition = "character(1000) default 'no description'")
    String description;

    @Column(name = "loaded_date_time")
    Calendar loadedDateTime;

}
