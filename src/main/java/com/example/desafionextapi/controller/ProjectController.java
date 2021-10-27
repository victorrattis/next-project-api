package com.example.desafionextapi.controller;

import com.example.desafionextapi.dto.ProjectDTO;
import com.example.desafionextapi.entities.Project;
import com.example.desafionextapi.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;
    /*
    @GetMapping("/projects")
    public ResponseEntity<List<Project>> allProjects(){
        return ResponseEntity.ok().body(projectService.getProjects());
    }

     */
    @GetMapping("/projects") // Ok!
    public ResponseEntity<List<ProjectDTO>> allProjects() {
        return ResponseEntity.ok().body(projectService.getProjects());
    }
    /*
    @PostMapping("/projects")
    public void saveProject(@RequestBody Project project) {
        projectService.saveProject(project);
    }

     */
    @PostMapping("/projects") //Ok!
    public void saveProject(@RequestBody ProjectDTO projectDTO) {
        projectService.saveProject(projectDTO);
    }

    //Falta Alterar
    @GetMapping("/projects/{id}")
    public ResponseEntity<Project> find (@PathVariable long id){
        Project projeto = projectService.find(id);
        return ResponseEntity.ok().body(projeto);
    }

    @PutMapping("/projects/{id}")
    public ResponseEntity<Project> update (@PathVariable long id){
        Project projeto = projectService.update(id);
        return ResponseEntity.ok(projeto);
    }
}
