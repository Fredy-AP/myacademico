package com.myacademico.controllers;

import com.myacademico.models.Teacher;
import com.myacademico.services.MateriaService;
import com.myacademico.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TeacherController {
    //Mapear la ruta para mostras el listado de profesores
    @Autowired
    TeacherService service;
    @Autowired
    MateriaService materiaService;
    @GetMapping({"/profesor/list"})
    public String Listar(Model model){
        model.addAttribute("profesores",service.Listar());
        return "/teacher/list";
    }

    @GetMapping({"/teacher/create"})
    public String nuevo(Model model){
        Teacher teacher= new Teacher();
        model.addAttribute("teacher",teacher);
        model.addAttribute("materias",materiaService.Listar());
        return "/teacher/create";
    }

    @PostMapping("/teacher/guardar")
    public String Guardar(@ModelAttribute("teacher") Teacher teacher){
        service.Guardar(teacher);
        return "redirect:/profesor/list";
    }


}
