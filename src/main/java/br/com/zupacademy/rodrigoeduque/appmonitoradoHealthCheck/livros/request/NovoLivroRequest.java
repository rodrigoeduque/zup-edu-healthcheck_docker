package br.com.zupacademy.rodrigoeduque.appmonitoradoHealthCheck.livros.request;

import javax.validation.constraints.*;

public class NovoLivroRequest {

    @NotBlank
    @Size(max = 100)
    private String titulo;

    @NotBlank
    @Size(min = 50, max = 250)
    private String descricao;

    @NotBlank
    @Size(max = 20)
    private String idioma;

    @NotNull
    @Min(50)
    @Max(1000)
    private Integer paginas;

    public NovoLivroRequest(String titulo, String descricao, String idioma, Integer paginas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.idioma = idioma;
        this.paginas = paginas;
    }

    public Livro toModel() {
        return new Livro(titulo,descricao,idioma,paginas);
    }
}
