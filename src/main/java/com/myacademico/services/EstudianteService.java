package com.myacademico.services;

import com.myacademico.models.Estudiante;
import com.myacademico.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository repository;

    public List<Estudiante> Listar(){
        return repository.findAll();
    }


}
