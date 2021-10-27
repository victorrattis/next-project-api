package com.example.desafionextapi.dao;

import com.example.desafionextapi.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectDAO extends JpaRepository<Project, Long> {
}
