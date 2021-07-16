package br.com.zupacademy.rodrigoeduque.appmonitoradoHealthCheck.livros.request;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    private String descricao;
    private String idioma;
    private Integer paginas;

    @Deprecated
    public Livro() {
    }

    public Livro(@NotBlank @Size(max = 100) String titulo,
                 @NotBlank @Size(min = 50, max = 250) String descricao,
                 @NotBlank @Size(max = 20) String idioma,
                 @NotNull @Min(50) @Max(1000) Integer paginas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.idioma = idioma;
        this.paginas = paginas;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getIdioma() {
        return idioma;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "Livro Cadastrado{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", idioma='" + idioma + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
