package com.example.desafionextapi.entities;

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