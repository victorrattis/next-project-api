package com.example.desafionextapi.dao;

import com.example.desafionextapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
}
