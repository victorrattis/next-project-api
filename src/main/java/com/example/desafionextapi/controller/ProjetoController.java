package com.example.desafionextapi.controller;

import com.example.desafionextapi.entities.Projeto;
import com.example.desafionextapi.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @GetMapping("/projects")
    public ResponseEntity<List<Projeto>> allProjects(){
        return ResponseEntity.ok().body(projetoService.getProjetos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Projeto> find (@PathVariable long id){
        Projeto projeto = projetoService.find(id);
        return ResponseEntity.ok().body(projeto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Projeto> update (@PathVariable long id){
        Projeto projeto = projetoService.update(id);
        return ResponseEntity.ok(projeto);
    }
}