package Metodos;

import Main.Banca;
import Modelo.Jornal;
import Modelo.Livro;
import Modelo.Produto;
import Modelo.Revista;

public class Cadastro extends Banca{  

    public static void cadastrarProdutos() {
        String titulo = text.getText();
        Double preco = Double.parseDouble(text2.getText());

        Produto produto = new Produto(titulo, preco);
        produtos.add(produto);
    }

    public static void cadastrarJornais() {
        String titulo = text.getText();
        Double preco = Double.parseDouble(text2.getText());
        String data = text3.getText();

        Jornal jornal = new Jornal(titulo, preco, data);
        jornais.add(jornal);
    }

    public static void cadastrarRevistas() {
        String titulo = text.getText();
        Double preco = Double.parseDouble(text2.getText());
        String editora = text3.getText();

        Revista revista = new Revista(titulo, preco, editora);
        revistas.add(revista);
    }

    public static void cadastrarLivro() {
        String titulo = text.getText();
        Double preco = Double.parseDouble(text2.getText());
        String autor = text3.getText();
        String descricao = text4.getText();
        int numPaginas = Integer.parseInt(text5.getText());

        Livro livro = new Livro(titulo, preco, autor, descricao, numPaginas);
        livros.add(livro);


    }
    
}
