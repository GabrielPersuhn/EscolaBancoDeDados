package br.com.letscode.java.sistemaEscola.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @Getter
    @Setter
    private int codigoCurso;

    @Getter @Setter private String nomeCurso;

    @Getter @Setter private int duracao;

    @Getter @Setter private int numeroAlunos;

    @Enumerated(EnumType.STRING)
    @Getter @Setter private Modalidade modalidade;

}

