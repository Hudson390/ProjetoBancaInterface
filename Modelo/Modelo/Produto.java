package Modelo;

public class Produto {
    private static int count = 1;

    private int id;
    private String titulo;
    private Double preco;

    
    public Produto(String titulo, Double preco) {
        this.id = count;
        this.titulo = titulo;
        this.preco = preco;
        Produto.count += 1;
    }


    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public Double getPreco() {
        return preco;
    }


    public void setPreco(Double preco) {
        this.preco = preco;
    }
   
    public String toString() {
        return "ID: " + this.getId() + 
                "\n     TITULO: " + this.getTitulo() +
                "\n     PREÇO: R$ " + this.getPreco();
    }

}

