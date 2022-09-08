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
    public List<Teacher> Listar(){
        return repository.findAll();
    }

       public Teacher Guardar(Teacher teacher)
    {
        return repository.save(teacher);
    }

}
