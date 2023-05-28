package Metodos;

import Main.Banca;

public class Remover extends Banca {

    public static void removerProdutoGenerico() {
        
        int referencia = Integer.parseInt(text.getText());

        produtos.remove(referencia);
         
        }


    public static void removerLivro() {

        int referencia = Integer.parseInt(text.getText());

        livros.remove(referencia);

        }

    public static void removerRevista() {

        int referencia = Integer.parseInt(text.getText());

        revistas.remove(referencia);
        
        }

    public static void removerJornal() {

        int referencia = Integer.parseInt(text.getText());

        jornais.remove(referencia);

        }
    
}
