package br.com.letscode.java.sistemaEscola.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "disciplina")
public class Disciplina {
    @Id
    @Getter
    @Setter
    private int codigoDisciplina;

    @Getter @Setter private String nomeDisciplina;

    @Getter @Setter int cargaPratica;

    @Getter @Setter int cargaTeorica;
}
