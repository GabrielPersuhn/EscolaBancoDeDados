package br.com.letscode.java.sistemaEscola.request;


import br.com.letscode.java.sistemaEscola.entity.Aluno;
import br.com.letscode.java.sistemaEscola.entity.Curso;
import br.com.letscode.java.sistemaEscola.repository.CursoRepository;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.Optional;

public class AlunoRequestAtualizar {
    @Getter @Setter private String nome;
    @Getter @Setter private String sobrenome;
    @Getter @Setter private Date dataNascimento;
    @Getter @Setter private int codigoCurso;


    public Aluno convert(CursoRepository cursoRepository, int ra) {
        Optional<Curso> cursoOptional = cursoRepository.findById(codigoCurso);
        Curso curso = cursoOptional.get();
        return new Aluno(ra,nome,sobrenome,dataNascimento,curso);
    }
}
