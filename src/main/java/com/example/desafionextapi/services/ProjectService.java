package com.example.desafionextapi.services;
import com.example.desafionextapi.entities.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    public List<Project> projetos = new ArrayList<>();

    public void saveProject(Project project){
        projetos.add(project);
    }

    public int numeroDeProjetosCadastrados() {
        return projetos.size();
    }
}