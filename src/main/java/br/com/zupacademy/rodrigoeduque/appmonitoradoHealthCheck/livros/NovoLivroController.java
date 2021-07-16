package br.com.zupacademy.rodrigoeduque.appmonitoradoHealthCheck.livros;

import br.com.zupacademy.rodrigoeduque.appmonitoradoHealthCheck.livros.repository.LivroRepository;
import br.com.zupacademy.rodrigoeduque.appmonitoradoHealthCheck.livros.request.Livro;
import br.com.zupacademy.rodrigoeduque.appmonitoradoHealthCheck.livros.request.NovoLivroRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class NovoLivroController {

    private LivroRepository repository;

    @Autowired
    public NovoLivroController(LivroRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/api/livros")
    public ResponseEntity<?> novoLivro(@RequestBody @Valid NovoLivroRequest request) {
        Livro novoLivro = request.toModel();
        repository.save(novoLivro);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/livros")
    public ResponseEntity<?> buscaTodosLivros(@RequestBody ListarTodosLivrosResponse response) {
        List<Livro> livros = repository.findAll();

        return ResponseEntity.ok(livros.stream().map(livro -> new ListarTodosLivrosResponse(livro)).collect(Collectors.toList()));
    }
}
