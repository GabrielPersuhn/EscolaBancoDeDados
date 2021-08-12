package br.com.letscode.java.sistemaEscola.repository;

import br.com.letscode.java.sistemaEscola.entity.TelefoneProfessor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TelefoneProfessorRepository extends JpaRepository<TelefoneProfessor, Integer> {
}
