package ru.yalrb.models.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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


    @ManyToMany
    private ArrayList<LeisureType> leisure_types;

    @ManyToMany
    private ArrayList<LeisureSubType> leisureSubTypes;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "yal_object")
    @PrimaryKeyJoinColumn
    Contact contact;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "yal_object")
    @PrimaryKeyJoinColumn
    private Rate rate;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "yal_object")
    @PrimaryKeyJoinColumn
    private Point point;
    @Column(name = "name")
    private String name;

    @Column(name = "long_name")
    private String longName;

    @Column(name = "short_description", length = 500)
    private String shortDescription;

    @Column(name = "full_description", length = 1500)
    private String fullDescription;

    @Column(name = "account_id")
    private Integer accountId; // TODO OneToMeny wil do.


    @Column(name = "state_id")
    private Byte stateId;

    @Temporal(TemporalType.DATE)
    @Column(name = "start_date_time")
    private Calendar dateTimeStart;

    @Temporal(TemporalType.DATE)
    @Column(name = "end_date_time")
    private Calendar dateTimeEnd;

    @Column(name = "access_level")
    private Byte accessLevel;

    @Column(name = "availability_score")
    private Byte availabilityScore;

    @Column(name = "work_load_id")
    private Byte workLoadId;



}