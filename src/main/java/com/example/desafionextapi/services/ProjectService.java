package com.example.desafionextapi.services;

import com.example.desafionextapi.dao.ProjectDAO;
import com.example.desafionextapi.dto.ProjectDTO;
import com.example.desafionextapi.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {
    public List<Project> projects = new ArrayList<>();

    @Autowired
    private ProjectDAO projectDAO;

    Project project = new Project();

    /*
    public void saveProject(Project project){
        projectDAO.save(project);
    }

     */
     /*
    public List<Project> getProjects() {
        return projectDAO.findAll();
    }
      */

    public List<ProjectDTO> getProjects() {
        return ((List<Project>) projectDAO
                .findAll())
                .stream()
                .map(this::convertToProjectDTO)
                .collect(Collectors.toList());
    }

    private ProjectDTO convertToProjectDTO(Project project) {
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setId(project.getId());
        return projectDTO;
    }

    public void saveProject(ProjectDTO projectDTO){
        projectDAO.save(convertProjectDTOToProject(projectDTO));
    }
    private Project convertProjectDTOToProject(ProjectDTO projectDTO) {
        Project project = new Project();
        project.setId(projectDTO.getId());
        return project;
    }

    //Falta Alterar
    /*
    public Project find(long id) {
        return projectDAO.findById(id).get();
    }

     */

    public ProjectDTO find(long id) {
        Project project = projectDAO.findById(id).get();
        return convertToProjectDTO(project);
    }

    public Project update(long id) {
        projectDAO.findById(id);
        project.setId(id);
        return project;
    }

}