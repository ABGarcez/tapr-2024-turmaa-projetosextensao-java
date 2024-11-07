package br.univille.microservprojetosextensao.controleprojetos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservprojetosextensao.controleprojetos.entities.ProjetoEntity;
import br.univille.microservprojetosextensao.controleprojetos.service.ProjetoService;

@RestController
@RequestMapping("/api/v1/projeto")
public class ProjetoAPIController {
    @Autowired
    private ProjetoService service;

    @GetMapping
    public ResponseEntity<List<ProjetoEntity>> get(){
        var listaProjetos = service.getAll();

        return new ResponseEntity<List<ProjetoEntity>>(listaProjetos, HttpStatus.OK);
    }
}
