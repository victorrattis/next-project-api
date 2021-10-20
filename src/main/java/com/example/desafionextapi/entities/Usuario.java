package com.example.desafionextapi.entities;

import javax.persistence.*;

@Entity
@Table(name="USERS")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
