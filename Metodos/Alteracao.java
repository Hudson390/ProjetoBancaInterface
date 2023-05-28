package Metodos;

import Main.Banca;
import Modelo.Jornal;
import Modelo.Livro;
import Modelo.Produto;
import Modelo.Revista;

public class Alteracao extends Banca {

    public static void MenuAlterarProduto() {

        int referencia = Integer.parseInt(text.getText());

        String titulo = text2.getText();
        Double preco = Double.parseDouble(text3.getText());


        Produto p = produtos.get(referencia);
        p.setTitulo(titulo);
        p.setPreco(preco);
    }

    public static void MenuAlterarJornal() {

        int referencia = Integer.parseInt(text.getText());

        String titulo = text2.getText();
        Double preco = Double.parseDouble(text3.getText());
        String data = text4.getText();


        Jornal j = jornais.get(referencia);
        j.setTitulo(titulo);
        j.setPreco(preco);
        j.setDataPublicacao(data);

    }
    public static void MenuAlterarRevista() {

        int referencia = Integer.parseInt(text.getText());

        String titulo = text2.getText();
        Double preco = Double.parseDouble(text3.getText());
        String editora = text4.getText();


        Revista r = revistas.get(referencia);
        r.setTitulo(titulo);
        r.setPreco(preco);
        r.setEditora(editora);
    }

    public static void MenuAlterarLivro() {

        int referencia = Integer.parseInt(text.getText());

        String titulo = text2.getText();
        Double preco = Double.parseDouble(text3.getText());
        String autor = text4.getText();
        String descricao = text5.getText();
        int numPaginas = Integer.parseInt(text6.getText());


        Livro l = livros.get(referencia);
        l.setTitulo(titulo);
        l.setPreco(preco);
        l.setAutor(autor);
        l.setDescricao(descricao);
        l.setNumPaginas(numPaginas);
    }

    





}
