package com.example.desafionextapi.services;

import com.example.desafionextapi.dao.UserDAO;
import com.example.desafionextapi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public void saveUser(User user) {
        userDAO.save(user);
    }

    public List<User> getUsers() {
        return userDAO.findAll();
    }

}
