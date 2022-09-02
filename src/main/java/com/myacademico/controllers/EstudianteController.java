package com.myacademico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudianteController {

    //Mapear la ruta de la entidad=Tabla Estudiante
    @GetMapping({"/estudiante/list"})
    public String Listar(){
        return "/estudiante/list";
    }

}
