package ru.yalrb.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class FeetBack {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "feet_back_owner_acount_id")
    Account feetBackOwner;

    @ManyToOne
    @JoinColumn(name = "feet_back_about_yal_object_id")
    Yal_Object feetBackAboutYalObject;

    @Column(name = "feet_back_text", columnDefinition = "character(1000) default 'none'")
    String feetBackText;

}
