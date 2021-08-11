package br.com.letscode.java.sistemaEscola.request;


import br.com.letscode.java.sistemaEscola.entity.Curso;
import br.com.letscode.java.sistemaEscola.entity.Modalidade;
import lombok.Getter;
import lombok.Setter;

public class CursoRequest {
    @Getter @Setter private int codigoCurso;
    @Getter @Setter private String nomeCurso;
    @Getter @Setter private int duracao;
    @Getter @Setter private int numeroAlunos;

    public Curso convert() {
        return new Curso(codigoCurso,nomeCurso,duracao,numeroAlunos, Modalidade.PRESENCIAL);
    }
}
