package com.example.desafionextapi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Projeto {
    private long id;

    public Projeto (long id) {
        this.setId(id);
    }

    private void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}