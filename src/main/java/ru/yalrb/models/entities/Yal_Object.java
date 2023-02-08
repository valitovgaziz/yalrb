package ru.yalrb.models.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Calendar;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Yal_Object {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    @JdbcTypeCode(SqlTypes.UUID)
    private UUID id;
    private String name;

    @Column(name = "long_name")
    private String longName;
    @Column(name = "short_description")
    private String shortDescription;
    @Column(name = "full_description")
    private String fullDescription;
    @Column(name = "owner_id")
    private Integer ownerId;
    @Column(name = "rate_id")
    private Byte rateId;
    @Column(name = "state_id")
    private Byte stateId;
    @Column(name = "start_date_time")
    private Calendar dateTimeStart;
    @Column(name = "end_date_time")
    private Calendar dateTimeEnd;
    @Column(name = "access_level")
    private Byte accessLevel;
    @Column(name = "availability_score")
    private Byte availabilityScore;
    @Column(name = "work_load_id")
    private Byte workLoadId;
}