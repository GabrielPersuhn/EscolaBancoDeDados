package br.com.letscode.java.sistemaEscola.repository;


import br.com.letscode.java.sistemaEscola.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
