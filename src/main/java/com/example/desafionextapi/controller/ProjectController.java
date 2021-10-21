package com.example.desafionextapi.controller;

import com.example.desafionextapi.entities.Project;
import com.example.desafionextapi.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/projects")
    public void saveProject(@RequestBody Project project) {
        projectService.saveProject(project);
    }

    @GetMapping("/projects")
    public ResponseEntity<List<Project>> allProjects(){
        return ResponseEntity.ok().body(projectService.getProjects());
    }
}
