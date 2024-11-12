package br.univille.microservprojetosextensao.controleprojetos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservprojetosextensao.controleprojetos.entities.ProjetoEntity;
import br.univille.microservprojetosextensao.controleprojetos.repository.ProjetoRepository;
import br.univille.microservprojetosextensao.controleprojetos.service.ProjetoService;

@Service
public class ProjetoServiceImpl implements ProjetoService {

    @Autowired
    private ProjetoRepository repository;

    @Override
    public List<ProjetoEntity> getAll() {
        var retornoIterador = repository.findAll();
        var listaProjetos = new ArrayList<ProjetoEntity>();

        retornoIterador.forEach(listaProjetos::add);
        return listaProjetos;    
    }

    @Override
    public ProjetoEntity save(ProjetoEntity projetoEntity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    
}
