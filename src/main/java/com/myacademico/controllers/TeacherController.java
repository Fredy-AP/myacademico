package com.myacademico.controllers;

import com.myacademico.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeacherController {
    //Mapear la ruta para mostras el listado de profesores
    @Autowired
    TeacherService service;
    @GetMapping({"/profesor/list"})
    public String Listar(Model model){
        model.addAttribute("profesores",service.Listar());
        return "/teacher/list";
    }

}
