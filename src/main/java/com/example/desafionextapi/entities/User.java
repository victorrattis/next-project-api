package com.example.desafionextapi.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "USER")
public class User {
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "SOBRENOME")
    private String sobrenome;

    @Column(name = "MATRICULA")
    private Long matricula;

    @Column(name = "ATIVO")
    private Boolean ativo;

    @Column(name = "DATA_NASCIMENTO")
    private Date dataNascimento;

    @Column(name = "CENTRO_ASSOCIADO")
    private String centroAssociado;

}
