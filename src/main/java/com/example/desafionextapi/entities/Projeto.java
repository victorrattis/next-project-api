package com.example.desafionextapi.entities;

import javax.persistence.*;

@Entity
@Table(name="PROJETOS")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}