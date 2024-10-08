package br.univille.microservprojetosextensao.controleprojetos.entities;

import java.util.UUID;

import br.univille.microservprojetosextensao.gestaoequipes.entities.EquipeEntity;

public class ProjetoEntity {
    public UUID id;
    public String titulo;
    public String objetivo;
    public EquipeEntity equipe;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getObjetivo() {
        return objetivo;
    }
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    public EquipeEntity getEquipe() {
        return equipe;
    }
    public void setEquipe(EquipeEntity equipe) {
        this.equipe = equipe;
    }
    public ProjetoEntity(UUID id, String titulo, String objetivo, EquipeEntity equipe) {
        this.id = id;
        this.titulo = titulo;
        this.objetivo = objetivo;
        this.equipe = equipe;
    }
    
}
