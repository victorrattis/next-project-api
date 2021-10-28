package com.example.desafionextapi.controller;

import com.example.desafionextapi.dto.ProjectDTO;
import com.example.desafionextapi.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/projects")
    public ResponseEntity<List<ProjectDTO>> allProjects() {
        return ResponseEntity.ok().body(projectService.getProjects());
    }
    @PostMapping("/projects")
    public void saveProject(@RequestBody ProjectDTO projectDTO) {
        projectService.saveProject(projectDTO);
    }

    @GetMapping("/projects/{id}")
    public ResponseEntity<ProjectDTO> find (@PathVariable long id){
        ProjectDTO projectDTO = projectService.find(id);
        return ResponseEntity.ok().body(projectDTO);
    }

    @PutMapping("/projects/{id}")
    public ResponseEntity<ProjectDTO> update (@PathVariable long id, @RequestBody ProjectDTO projectDTO){
        ProjectDTO projectDTOUpdated = projectService.update(id, projectDTO);
        return ResponseEntity.ok(projectDTOUpdated);
    }
}
