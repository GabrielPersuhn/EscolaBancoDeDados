package br.com.letscode.java.sistemaEscola.response;

import br.com.letscode.java.sistemaEscola.entity.Professor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

public class ProfessorResponse {
    @Getter private final int registro_professor;
    @Getter private final String nome;

    public ProfessorResponse(Professor professor){
        this.registro_professor = professor.getRegistroProfessor();
        this.nome = professor.getNome();
    }

    public static List<ProfessorResponse> convert(List<Professor> professores){
        return professores.stream().map(ProfessorResponse::new).collect(Collectors.toList());
    }
}
