package br.com.letscode.java.sistemaEscola.controller;

import br.com.letscode.java.sistemaEscola.entity.Aluno;
import br.com.letscode.java.sistemaEscola.repository.AlunoRepository;
import br.com.letscode.java.sistemaEscola.repository.CursoRepository;
import br.com.letscode.java.sistemaEscola.request.AlunoRequest;
import br.com.letscode.java.sistemaEscola.request.AlunoRequestAtualizar;
import br.com.letscode.java.sistemaEscola.response.AlunoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping()
    public List<AlunoResponse> buscarAlunos(String nome, String nomeCurso, String sobrenome, Integer duracao, Integer ano){
        if(nome != null){
            List<Aluno> alunos = alunoRepository.findByNome(nome);
            return AlunoResponse.convert(alunos);
        }else if(nomeCurso != null && sobrenome != null){
            List<Aluno> alunos = alunoRepository.findByCodigoCursoNomeCursoAndSobrenome(nomeCurso, sobrenome);
            return AlunoResponse.convert(alunos);
        } else if(nomeCurso != null){
            List<Aluno> alunos = alunoRepository.findByCodigoCursoNomeCurso(nomeCurso);
            return AlunoResponse.convert(alunos);
        } else if(duracao != null){
            List<Aluno> alunos = alunoRepository.findByCodigoCursoDuracaoEquals(duracao);
            return AlunoResponse.convert(alunos);
        } else if (ano != null){
            List<Aluno> alunos = alunoRepository.findByAnoNascimento(ano);
            return AlunoResponse.convert(alunos);
        }else {
            List<Aluno> alunos = alunoRepository.findAll();
            return AlunoResponse.convert(alunos);
        }
    }

    @PostMapping
    public ResponseEntity<AlunoResponse> cadastrar(
            @RequestBody AlunoRequest alunoRequest,
            UriComponentsBuilder uriComponentsBuilder
    ) {
        Aluno aluno = alunoRequest.convert(cursoRepository);
        alunoRepository.save(aluno);
        URI uri = uriComponentsBuilder.path("/alunos/{ra}").buildAndExpand(aluno.getRa()).toUri();
        return ResponseEntity.created(uri).body(new AlunoResponse(aluno));
    }

    @GetMapping("/{ra}")
    public AlunoResponse buscarAlunoPorRa(@PathVariable int ra){
        Aluno aluno = alunoRepository.getById(ra);
        return new AlunoResponse(aluno);
    }

    @PutMapping("/{ra}")
    public ResponseEntity<AlunoResponse> atualizar(
            @PathVariable int ra,
            @RequestBody AlunoRequestAtualizar alunoRequestAtualizar
    ){
        Aluno aluno = alunoRequestAtualizar.convert(cursoRepository,ra);
        alunoRepository.save(aluno);
        return ResponseEntity.ok(new AlunoResponse(aluno));
    }

    @DeleteMapping("/{ra}")
    public ResponseEntity<?> remover(@PathVariable int ra){
        alunoRepository.deleteById(ra);
        return ResponseEntity.ok().build();
    }
}
