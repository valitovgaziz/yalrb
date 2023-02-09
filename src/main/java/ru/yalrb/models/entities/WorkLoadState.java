package ru.yalrb.models.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class WorkLoadState {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "yal_object_id")
    Yal_Object yal_object;

    @Column(name = "level_name", columnDefinition = "character(30) default 'не определено'")
    String level_name;

    @Column(name = "description", columnDefinition = "character(1000) default 'не указано'")
    String description;

    @Column(name = "level_score", columnDefinition = "integer default 0")
    Integer level_score;

}
