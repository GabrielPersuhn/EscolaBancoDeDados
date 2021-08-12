package br.com.letscode.java.sistemaEscola.response;

import br.com.letscode.java.sistemaEscola.entity.Curso;
import br.com.letscode.java.sistemaEscola.entity.Modalidade;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

public class CursoResponse {
    @Getter private final int codigoCurso;
    @Getter private final String nomeCurso;
    @Getter private final int duracao;
    @Getter private final int numeroAlunos;
    @Getter private final Modalidade modalidade;

    public CursoResponse(Curso curso){
        this.codigoCurso = curso.getCodigoCurso();
        this.nomeCurso = curso.getNomeCurso();
        this.duracao = curso.getDuracao();
        this.numeroAlunos = curso.getNumeroAlunos();
        this.modalidade = curso.getModalidade();
    }

    public static List<CursoResponse> convert(List<Curso> cursos){
        return cursos.stream().map(CursoResponse::new).collect(Collectors.toList());
    }

}
