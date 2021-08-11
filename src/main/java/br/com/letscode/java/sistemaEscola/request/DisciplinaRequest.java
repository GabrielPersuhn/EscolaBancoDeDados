package br.com.letscode.java.sistemaEscola.request;


import br.com.letscode.java.sistemaEscola.entity.Disciplina;
import lombok.Getter;
import lombok.Setter;

public class DisciplinaRequest {
    @Getter @Setter private int codigoDisciplina;
    @Getter @Setter private String nomeDisciplina;
    @Getter @Setter private int cargaPratica;
    @Getter @Setter private int cargaTeorica;

    public Disciplina convert() {
        return new Disciplina(codigoDisciplina,nomeDisciplina,cargaPratica,cargaTeorica);
    }
}
