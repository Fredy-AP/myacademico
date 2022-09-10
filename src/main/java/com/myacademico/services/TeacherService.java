package com.myacademico.services;

import com.myacademico.models.Teacher;
import com.myacademico.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository repository;
    //CRUD
    //Metodo para listar datos Read
    public List<Teacher> Listar(){
        return repository.findAll();
    }

    //Metodo de Guardar Create and Update
    public Teacher Guardar(Teacher teacher) {
        return repository.save(teacher);
    }
    //Read
    //Metodo de Buscar por Id
    public Teacher BuscarById(Integer id){
        return repository.findById(id).get();
    }
    //Delete
    //Metodo de Eliminar
    public void Eliminar(Integer id){
        repository.deleteById(id);
    }
}
