package com.example.desafionextapi.services;

import com.example.desafionextapi.entities.Projeto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjetoService {

    private List<Projeto> projetos = new ArrayList<>();
    public ProjetoService() {
        projetos.add(new Projeto(1));
        projetos.add(new Projeto(2));
        projetos.add(new Projeto(3));
        projetos.add(new Projeto(4));
    }

    public Projeto find(long id){
        for(Projeto projeto : projetos) {
            if(projeto.getId() == id ){
                return projeto;
            }
        }
        return null;
    }

    public Projeto update (long id) {
        for(Projeto projeto : projetos) {
            if (projeto.getId() == id) {
                projeto.setId(7);
                return projeto;
            }
        }
        return null;
    }
}
