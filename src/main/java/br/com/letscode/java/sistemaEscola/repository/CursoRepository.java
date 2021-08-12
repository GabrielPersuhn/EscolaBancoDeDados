package br.com.letscode.java.sistemaEscola.repository;


import br.com.letscode.java.sistemaEscola.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
