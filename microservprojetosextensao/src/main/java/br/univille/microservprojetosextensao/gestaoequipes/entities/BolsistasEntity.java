package br.univille.microservprojetosextensao.gestaoequipes.entities;

import java.util.UUID;

public class BolsistasEntity {
    public UUID id;
    public String nome;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public BolsistasEntity(UUID id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
}
