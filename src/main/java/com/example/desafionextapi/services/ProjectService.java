package com.example.desafionextapi.services;

import com.example.desafionextapi.entities.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
    public List<Project> projects = new ArrayList<>();

    public ProjectService() {
        projects.add(new Project(1));
        projects.add(new Project(2));
        projects.add(new Project(3));
        projects.add(new Project(4));
    }

    public void saveProject(Project project){
        projects.add(project);
    }

    public List<Project> getProjects() {
        return projects;
    }

    public Project find(long id){
        for(Project projeto : projects) {
            if(projeto.getId() == id ){
                return projeto;
            }
        }
        return null;
    }

    public Project update (long id) {
        for(Project projeto : projects) {
            if (projeto.getId() == id) {
                projeto.setId(7);
                return projeto;
            }
        }
        return null;
    }
}