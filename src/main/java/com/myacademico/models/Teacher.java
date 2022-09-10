package com.myacademico.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name="teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int code;
    private String name;
    private String phone;
    private String email;
    private String matter;
    private Date fecha;//para que no genere error debe depender de java.sql.Date

}
