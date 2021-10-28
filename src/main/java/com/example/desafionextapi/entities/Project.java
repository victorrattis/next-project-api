package com.example.desafionextapi.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="PROJECTS")

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "CENTRO")
    private String centro;

    @Column(name = "GERENTE")
    private String gerenteProjeto;

    @Column(name = "DATA_INICIO")
    private Date dataDeInicio;

    @Column(name = "DATA_TERMINO")
    private Date dataDeTermino;

    @Column(name = "STATUS")
    private String statusProjeto;

    @Column(name = "FLAG")
    private String flag;
}