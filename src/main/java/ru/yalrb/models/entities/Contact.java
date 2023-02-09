package ru.yalrb.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "contact")
public class Contact {
    @Getter(AccessLevel.PRIVATE)
    @Setter(AccessLevel.PRIVATE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "yal_object_id")
    Yal_Object yal_object;

    @Column(name = "phone_number", columnDefinition = "character(30) default 'none'")
    String phoneNumber;

    @Column(name = "address", columnDefinition = "character(100) default 'none'")
    String address;

    @Column(name = "email", columnDefinition = "character(100) default 'none'")
    String email;

    @Column(name = "site_link", columnDefinition = "character(100) default 'none'")
    String siteLink;


}
