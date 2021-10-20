package com.example.desafionextapi.controller;
import com.example.desafionextapi.entities.Projeto;
import com.example.desafionextapi.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class APIController {
    @Autowired
    private ProjetoService projetoService;

    @PostMapping("/projects")
    public void salvarProjeto(Projeto projeto) {
        projetoService.salvarProjeto(projeto);
    }

    @PostMapping("/users")
    public void salvarUsuario(Usuario usuario) {
        projetoService.salvarUsuario(usuario);
    }
}