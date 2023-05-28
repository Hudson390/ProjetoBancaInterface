package Modelo;

public class Revista extends Produto{
    private String editora;

    public Revista(String titulo, Double preco, String editora) {
        super(titulo, preco);
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String toString() {
        return "ID: " + this.getId() + 
                "\n     TITULO: " + this.getTitulo() +
                "\n     PREÇO: R$" + this.getPreco() +
                "\n     EDITORA: " + this.getEditora();
    }

    
}
