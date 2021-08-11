package br.com.letscode.java.sistemaEscola.request;


import br.com.letscode.java.sistemaEscola.entity.Professor;
import lombok.Getter;
import lombok.Setter;

public class ProfessorRequest {
    @Getter @Setter private int registro_professor;
    @Getter @Setter private String nome;

    public Professor convert() {
        return new Professor(registro_professor,nome);
    }
}
