package com.example.desafionextapi.controller;

import com.example.desafionextapi.dto.ProjectDTO;
import com.example.desafionextapi.services.MapProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MapProjectController {

    @Autowired
    private MapProjectService mapProjectService;

    @GetMapping("/map")
    @ResponseBody
    public List<ProjectDTO> getAllUsersLocation() {
        List <ProjectDTO> usersLocation = mapProjectService.getAllUsersLocation();
        return usersLocation;
    }
}
