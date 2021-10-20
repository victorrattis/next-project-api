package com.example.desafionextapi.controller;

import com.example.desafionextapi.entities.User;
import com.example.desafionextapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @GetMapping("/all_users")
    public ResponseEntity<List<User>> allUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }
}

