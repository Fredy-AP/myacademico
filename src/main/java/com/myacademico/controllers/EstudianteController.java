package com.myacademico.controllers;

import com.myacademico.models.Estudiante;
import com.myacademico.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstudianteController {
    @Autowired
    EstudianteService service;

    //Mapear la ruta de la entidad=Tabla Estudiante
    @GetMapping({"/estudiante/list","/estudiante"})
    public String Listar(Model model){
        model.addAttribute("estudiantes",service.Listar());
        return "/estudiante/list";
    }

    //Ruta para el formulario de Nuevo
    @GetMapping({"/estudiante/create"})
    public String Nuevo(Model model){
        Estudiante estudiante= new Estudiante();
        model.addAttribute("estudiante",estudiante);
        return "/estudiante/create";
    }

    //Ruta para guardar los datos
    @PostMapping({"/estudiante/guardar"})
    public String Guardar(@ModelAttribute("estudiante") Estudiante estudiante){
        service.Guardar(estudiante);
        return "redirect:/estudiante/list";
    }

    //Ruta para editar
    @GetMapping({"/estudiante/edit/{id}"})
    public String Editar(@PathVariable int id,Model model){
        Estudiante estudiante= service.BuscarById(id);
        model.addAttribute("estudiante",estudiante);
        return "/estudiante/create";
    }

    //Ruta para eliminar
    @GetMapping({"/estudiante/eliminar/{id}"})
    public String Eliminar(@PathVariable int id){
        service.Eliminar(id);
        return "redirect:/estudiante/list";
    }






}
