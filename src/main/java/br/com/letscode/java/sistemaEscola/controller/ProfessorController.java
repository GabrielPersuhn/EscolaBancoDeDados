package br.com.letscode.java.sistemaEscola.controller;


import br.com.letscode.java.sistemaEscola.entity.Professor;
import br.com.letscode.java.sistemaEscola.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @RequestMapping("/professores")
    public Iterable<Professor> buscarProfessores(){
        Iterable<Professor> professores = professorRepository.findAll();
        return professores;
    }
}
