package com.example.desafionextapi.services;
import com.example.desafionextapi.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> usuarios = new ArrayList<>();

    public void saveUser(User user){
        usuarios.add(user);
    }
}
