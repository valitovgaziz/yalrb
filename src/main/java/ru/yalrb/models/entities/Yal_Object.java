package ru.yalrb.models.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.ArrayList;
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "object_type_id", referencedColumnName = "id")
    ObjectType object_type;

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


    @ManyToOne
    @JoinColumn(name = "yal_object_id", nullable = false)
    private Account account;

    @Column(name = "long_name")
    private String longName;

    @Column(name = "short_description", length = 500)
    private String shortDescription;

    @Column(name = "full_description", length = 1500)
    private String fullDescription;

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

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "yal_object")
    @PrimaryKeyJoinColumn
    private WorkLoadState workLoad;


}