package Modelo;

public class Livro extends Produto {
    private String autor;
    private String descricao;
    private int numPaginas;

    public Livro(String titulo, Double preco, String autor, String descricao, int numPaginas) {
        super(titulo, preco);
        this.autor = autor;
        this.descricao = descricao;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String toString() {
        return "ID: " + this.getId() + 
                "\n     TITULO: " + this.getTitulo() +
                "\n     PREÇO: R$" + this.getPreco() +
                "\n     AUTOR: " + this.getAutor() +
                "\n     DESCRIÇÃO: " + this.getDescricao() +
                "\n     NÚMEROS DE PÁGINAS: " + this.getNumPaginas();
    }
    
}
