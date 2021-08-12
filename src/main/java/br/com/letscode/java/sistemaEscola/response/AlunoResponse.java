package br.com.letscode.java.sistemaEscola.response;

import br.com.letscode.java.sistemaEscola.entity.Aluno;
import br.com.letscode.java.sistemaEscola.entity.Curso;
import lombok.Getter;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;


public class AlunoResponse {
    @Getter private final int ra;
    @Getter private final String nome;
    @Getter private final String sobrenome;
    @Getter private final Date dataNascimento;
    @Getter private final Curso codigoCurso;

    public AlunoResponse(Aluno aluno){
        this.ra = aluno.getRa();
        this.nome = aluno.getNome();
        this.sobrenome = aluno.getSobrenome();
        this.dataNascimento = aluno.getDataNascimento();
        this.codigoCurso = aluno.getCodigoCurso();
    }

    public static List<AlunoResponse> convert(List<Aluno> alunos){
        return alunos.stream().map(AlunoResponse::new).collect(Collectors.toList());
    }
}
