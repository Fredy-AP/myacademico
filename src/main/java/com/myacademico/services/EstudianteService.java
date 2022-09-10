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
    //CRUD
    //Metodo Listar Read
    public List<Estudiante> Listar(){
        return repository.findAll();
    }

    //Crear metodo para guardar y Actualizar Create and Update
    public Estudiante Guardar(Estudiante estudiante){
        return repository.save(estudiante);
    }

    //Metodo Buscar por Id Delete
    public Estudiante BuscarById(Integer id){
        return repository.findById(id).get();
    }

    //Metodo Eliminar
    public void Eliminar(Integer id){
        repository.deleteById(id);
    }






}
