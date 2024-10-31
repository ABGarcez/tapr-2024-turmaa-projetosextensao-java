package br.univille.microservprojetosextensao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservprojetosextensao.gestaoequipes.entities.BolsistasEntity;
import br.univille.microservprojetosextensao.gestaoequipes.entities.EquipeEntity;

@Repository
public interface EquipeRepository extends CrudRepository<EquipeEntity,String>{

    
    
}
