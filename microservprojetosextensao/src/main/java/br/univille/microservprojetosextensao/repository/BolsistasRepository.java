package br.univille.microservprojetosextensao.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservprojetosextensao.gestaoequipes.entities.BolsistasEntity;

@Repository
public interface BolsistasRepository extends CrudRepository<BolsistasEntity,String>{
    

    
}
