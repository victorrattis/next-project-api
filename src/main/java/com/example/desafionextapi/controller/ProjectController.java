package com.example.desafionextapi.controller;
import com.example.desafionextapi.entities.Project;
import com.example.desafionextapi.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @PostMapping("/projects")
    public void saveProject(@RequestBody Project project) {
        projectService.saveProject(project);
    }
}