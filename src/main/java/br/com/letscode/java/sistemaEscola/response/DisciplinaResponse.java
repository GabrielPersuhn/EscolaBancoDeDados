package br.com.letscode.java.sistemaEscola.response;

import br.com.letscode.java.sistemaEscola.entity.Disciplina;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

public class DisciplinaResponse {
    @Getter
    private final int codigoDisciplina;
    @Getter private final String nomeDisciplina;
    @Getter private final int cargaPratica;
    @Getter private final int cargaTeorica;

    public  DisciplinaResponse(Disciplina disciplina){
        this.codigoDisciplina = disciplina.getCodigoDisciplina();
        this.nomeDisciplina = disciplina.getNomeDisciplina();
        this.cargaPratica = disciplina.getCargaPratica();
        this.cargaTeorica = disciplina.getCargaTeorica();
    }

    public static List<DisciplinaResponse> convert(List<Disciplina> disciplinas){
        return disciplinas.stream().map(DisciplinaResponse::new).collect(Collectors.toList());
    }
}
