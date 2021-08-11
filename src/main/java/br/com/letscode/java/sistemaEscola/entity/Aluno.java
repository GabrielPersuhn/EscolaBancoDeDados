package br.com.letscode.java.sistemaEscola.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @Getter
    @Setter
    private int ra;
    @Getter @Setter private String nome;
    @Getter @Setter private String sobrenome;
    @Getter @Setter private Date dataNascimento;
    @ManyToOne
    @JoinColumn(name = "codigoCurso", referencedColumnName = "codigoCurso")
    @Getter @Setter private Curso codigoCurso;
}
