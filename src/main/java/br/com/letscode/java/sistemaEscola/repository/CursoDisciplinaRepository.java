package br.com.letscode.java.sistemaEscola.repository;


import br.com.letscode.java.sistemaEscola.entity.CursoDisciplinaProfessor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoDisciplinaRepository extends JpaRepository<CursoDisciplinaProfessor, Integer> {
}
