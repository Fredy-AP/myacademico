package com.myacademico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeacherController {
    //Mapear la ruta para mostras el listado de profesores
    @GetMapping({"/profesor/list"})
    public String Listar(){
        return "/teacher/list";
    }

}
