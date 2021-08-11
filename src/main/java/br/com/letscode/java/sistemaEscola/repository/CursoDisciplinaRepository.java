package br.com.letscode.java.sistemaEscola.repository;


import br.com.letscode.java.sistemaEscola.entity.CursoDisciplinaProfessor;
import org.springframework.data.repository.CrudRepository;

public interface CursoDisciplinaRepository extends CrudRepository<CursoDisciplinaProfessor, Integer> {
}
