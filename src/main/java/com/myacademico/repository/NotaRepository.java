package com.myacademico.repository;

import com.myacademico.models.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota,Integer> {
}
