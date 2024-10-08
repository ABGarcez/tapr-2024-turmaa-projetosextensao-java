package br.univille.microservprojetosextensao.gestaoequipes.entities;

import java.util.List;
import java.util.UUID;

public class EquipeEntity {
    public UUID id;
    public List<BolsistasEntity> integrantes;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public List<BolsistasEntity> getIntegrantes() {
        return integrantes;
    }
    public void setIntegrantes(List<BolsistasEntity> integrantes) {
        this.integrantes = integrantes;
    }
    public EquipeEntity(UUID id, List<BolsistasEntity> integrantes) {
        this.id = id;
        this.integrantes = integrantes;
    }
    
}
