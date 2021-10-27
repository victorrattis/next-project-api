package com.example.desafionextapi.services;

import com.example.desafionextapi.dao.ProjectDAO;
import com.example.desafionextapi.dto.ProjectDTO;
import com.example.desafionextapi.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapProjectService {

    @Autowired
    private ProjectDAO projectDAO;

    public List<ProjectDTO> allProjects() {
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

}
