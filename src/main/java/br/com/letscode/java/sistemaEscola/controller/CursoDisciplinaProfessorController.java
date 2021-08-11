package br.com.letscode.java.sistemaEscola.controller;


import br.com.letscode.java.sistemaEscola.entity.CursoDisciplinaProfessor;
import br.com.letscode.java.sistemaEscola.repository.CursoDisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoDisciplinaProfessorController {

    @Autowired
    private CursoDisciplinaRepository cursoDisciplinaRepository;

    @RequestMapping("/cursoDisciplinas")
    public Iterable<CursoDisciplinaProfessor> buscarCursoDisciplinas(){
        Iterable<CursoDisciplinaProfessor> cursoDisciplinas = cursoDisciplinaRepository.findAll();
        return cursoDisciplinas;
    }
}
