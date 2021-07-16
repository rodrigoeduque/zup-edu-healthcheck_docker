package br.com.zupacademy.rodrigoeduque.appmonitoradoHealthCheck.livros;

import br.com.zupacademy.rodrigoeduque.appmonitoradoHealthCheck.livros.request.Livro;

public class ListarTodosLivrosResponse {

    private String titulo;
    private String descricao;
    private String idioma;
    private Integer paginas;

    @Deprecated
    public ListarTodosLivrosResponse(){

    }

    public ListarTodosLivrosResponse(Livro livro) {
        this.titulo = livro.getTitulo();
        this.descricao = livro.getDescricao();
        this.idioma = livro.getIdioma();
        this.paginas = livro.getPaginas();
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
}
