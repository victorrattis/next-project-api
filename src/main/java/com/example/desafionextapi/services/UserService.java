package com.example.desafionextapi.services;

import com.example.desafionextapi.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public void saveUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

}
