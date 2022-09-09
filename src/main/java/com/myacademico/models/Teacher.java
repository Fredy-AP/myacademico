package com.myacademico.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Date;


@Getter
@Setter
@Entity
@Table(name="teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    private String name;
    private String phone;
    private String email;
    private String matter;

    private Date fecha;

}
