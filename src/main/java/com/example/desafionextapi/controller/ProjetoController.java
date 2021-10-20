package com.example.desafionextapi.controller;

import com.example.desafionextapi.entities.Projeto;
import com.example.desafionextapi.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/projeto")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    public ProjetoController(ProjetoService projetoService) {
        this.projetoService = projetoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Projeto> find (@PathVariable long id){
        Projeto projeto = projetoService.find(id);
        return ResponseEntity.ok().body(projeto);
    }

    }

