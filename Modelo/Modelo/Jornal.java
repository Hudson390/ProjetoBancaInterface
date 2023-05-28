package Modelo;

public class Jornal extends Produto{
    private String dataPublicacao;

    public Jornal(String titulo, Double preco, String dataPublicacao) {
        super(titulo, preco);
        this.dataPublicacao = dataPublicacao;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String toString() {
        return "ID: " + this.getId() + 
                "\n     TITULO: " + this.getTitulo() +
                "\n     PREÇO: R$ " + this.getPreco() +
                "\n     DATA DE PUBLICAÇÃO: " + this.getDataPublicacao();
    }


}
