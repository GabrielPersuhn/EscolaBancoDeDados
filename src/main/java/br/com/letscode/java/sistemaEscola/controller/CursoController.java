package br.com.letscode.java.sistemaEscola.controller;


import br.com.letscode.java.sistemaEscola.entity.Curso;
import br.com.letscode.java.sistemaEscola.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @RequestMapping("/cursos")
    public Iterable<Curso> buscarCursos(){
        Iterable<Curso> cursos = cursoRepository.findAll();

        return  cursos;
    }
}
