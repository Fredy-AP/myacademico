package com.myacademico.models;

import jdk.nashorn.internal.ir.annotations.Ignore;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    private String name;
    private String phone;
    private String email;
    //private String matter; se quita el campo y se asocia a continuacion
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "matter")
    private Materia materia;
    private Date fecha;//para que no genere error debe depender de java.sql.Date

}
