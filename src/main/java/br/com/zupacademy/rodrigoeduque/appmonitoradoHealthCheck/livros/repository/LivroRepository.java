package br.com.zupacademy.rodrigoeduque.appmonitoradoHealthCheck.livros.repository;

import br.com.zupacademy.rodrigoeduque.appmonitoradoHealthCheck.livros.request.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro,Long> {
}
