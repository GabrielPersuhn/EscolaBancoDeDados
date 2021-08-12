package br.com.letscode.java.sistemaEscola.controller;

import br.com.letscode.java.sistemaEscola.entity.Disciplina;
import br.com.letscode.java.sistemaEscola.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisciplinaController {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @RequestMapping("/disciplinas")
    public Iterable<Disciplina> buscarDisciplinas(){
        return disciplinaRepository.findAll();
    }
}
