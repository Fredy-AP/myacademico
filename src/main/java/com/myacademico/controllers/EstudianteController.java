package com.myacademico.controllers;

import com.myacademico.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudianteController {
    @Autowired
    EstudianteService service;
    //Mapear la ruta de la entidad=Tabla Estudiante
    @GetMapping({"/estudiante/list"})
    public String Listar(Model model){
        model.addAttribute("estudiantes",service.Listar());
        return "/estudiante/list";
    }



}
