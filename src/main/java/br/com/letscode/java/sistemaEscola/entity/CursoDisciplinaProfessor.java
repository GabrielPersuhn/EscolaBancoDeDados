package br.com.letscode.java.sistemaEscola.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cursoDisciplina")
public class CursoDisciplinaProfessor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "codigoCurso", referencedColumnName = "codigoCurso")
    @Getter
    @Setter
    Curso codigoCurso;

    @ManyToOne @JoinColumn(name = "codigoDisciplina", referencedColumnName = "codigoDisciplina")
    @Getter @Setter Disciplina codigoDisciplina;

    @ManyToOne @JoinColumn(name = "registroProfessor", referencedColumnName = "registroProfessor")
    @Getter @Setter Professor registroProfessor;
}