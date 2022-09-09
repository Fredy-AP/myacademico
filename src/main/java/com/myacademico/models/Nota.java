package com.myacademico.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nota")
public class Nota {
    @Id
    private int cod_nota;
}
