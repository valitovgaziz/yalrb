package ru.yalrb.models.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DialectOverride;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Calendar;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "account")
public class Account {
    @Getter(AccessLevel.PRIVATE)
    @Setter(AccessLevel.PRIVATE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Long id;

    @Column(name = "phone_number")
    String phone_number;

    @Column(name = "gender")
    String gender;

    @Column(name = "email")
    String email;

    @Column(name = "state_id")
    State state_id;

    @Column(name = "created_date_time")
    Calendar created_date_time;

    @Column(name = "role_id")
    Role account_role;

    @Column(name = "score", columnDefinition = "integer default 0")
    Integer score = 0;

    @Column(name = "nickname", columnDefinition = "character(30) default 'турист'")
    String nickname;

}
