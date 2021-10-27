package com.example.desafionextapi.services;

import com.example.desafionextapi.DAO.ProjectDAO;
import com.example.desafionextapi.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectDAO projectDAO;

    Project project = new Project();

    public void saveProject(Project project){
        projectDAO.save(project);
    }

    public List<Project> getProjects() {
        return projectDAO.findAll();
    }

    public Project find(long id) {
        return projectDAO.findById(id).get();
    }

    public Project update(long id) {
        projectDAO.findById(id);
        project.setId(id);
        return project;
    }

}