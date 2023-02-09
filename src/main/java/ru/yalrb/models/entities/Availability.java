package ru.yalrb.models.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "yal_object_id")
    Yal_Object yal_object;

    @Column(name = "is_for_no_seeing")
    Boolean isForNoSeeing;

    @Column(name = "is_for_mental_discorder")
    Boolean isForMentalDiscorder;

    @Column(name = "is_for_wheel_chair_user")
    Boolean isForWheelchairUser;

    @Column(name = "is_for_no_hear")
    Boolean isForNoHear;

    @Column(name = "is_for_discorders_musc_skel_sys")
    Boolean isForDiscordersMuscSkelSys;





}
