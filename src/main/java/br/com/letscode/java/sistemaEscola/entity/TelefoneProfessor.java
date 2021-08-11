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
@Table(name = "telefoneProfessor")
public class TelefoneProfessor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    int numero;

    @ManyToOne
    @JoinColumn(name = "registroProfessor", referencedColumnName = "registroProfessor")
    @Getter @Setter Professor registroProfessor;
}
