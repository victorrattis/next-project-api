package com.example.desafionextapi.entities;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Projeto {
    @Id
    private long id;

    public Projeto (long id) {
        if (id < 1) {
            System.out.println("O número de identificação do projeto não pode ser menor que 1");
        }else {
            this.setId(id);
        }
    }

    private void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
