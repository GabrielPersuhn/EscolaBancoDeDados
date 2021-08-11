package br.com.letscode.java.sistemaEscola.controller;

import br.com.letscode.entity.TelefoneProfessor;
import br.com.letscode.repository.TelefoneProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelefoneProfessorController {
    @Autowired
    private TelefoneProfessorRepository telefoneProfessorRepository;

    @RequestMapping("/telefonesProfessor")
    public Iterable<TelefoneProfessor> buscaTelefoneProfessor(){

        Iterable<TelefoneProfessor> telefoneProfessor = telefoneProfessorRepository.findAll();
        return  telefoneProfessor;
    }
}
