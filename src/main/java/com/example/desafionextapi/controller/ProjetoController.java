package com.example.desafionextapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping("/projects")
    public ResponseEntity<List<Projeto>> allProjects(){
        return ResponseEntity.ok().body(projetoService.getProjetos());
    }
}
