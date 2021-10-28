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

    @Autowired
    private ProjectDAO projectDAO;

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

    public ProjectDTO find(long id) {
        Project project = projectDAO.findById(id).get();
        return convertToProjectDTO(project);
    }

    public ProjectDTO update(long id, ProjectDTO projectDTO) {
        Project project = projectDAO.findById(id).get();
        project.setId(projectDTO.getId());
        return convertToProjectDTO(project);
    }

}