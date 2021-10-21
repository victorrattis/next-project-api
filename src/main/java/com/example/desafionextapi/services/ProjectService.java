package com.example.desafionextapi.services;
import com.example.desafionextapi.entities.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    public List<Project> projects = new ArrayList<>();

    public void saveProject(Project project){
        projects.add(project);
    }

    public List<Project> getProjects() {
        return projects;
    }
}