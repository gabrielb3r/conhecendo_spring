package com.example.exemplo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.exemplo.repositories.DiaristaRepository;

@Controller
@RequestMapping("/diaristas")
public class DiaristaController {

    @Autowired
    private DiaristaRepository repository;
    
    public ModelAndView buscarTodos(){

        var modelAndView = new ModelAndView("listar_diaristas");
        modelAndView.addObject("diaristas", repository.findAll());
        return modelAndView;

    }
}
