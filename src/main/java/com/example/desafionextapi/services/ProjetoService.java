package com.example.desafionextapi.services;
import com.example.desafionextapi.entities.Projeto;

import java.util.ArrayList;
import java.util.List;
@org.springframework.stereotype.Service

public class ProjetoService {

    public List<Projeto> projetos = new ArrayList<>();

    public void salvarProjeto(Projeto projeto){
        projetos.add(projeto);
    }

    public List<Usuario> usuarios = new ArrayList<>();

    public void salvarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
}