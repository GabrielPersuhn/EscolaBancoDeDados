package br.com.letscode.java.sistemaEscola.repository;


import br.com.letscode.java.sistemaEscola.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
}
