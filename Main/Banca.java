package Main;

import Modelo.Jornal;
import Modelo.Livro;
import Modelo.Produto;
import Modelo.Revista;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Interface.Menu;

public class Banca extends JFrame {
    protected static Scanner input = new Scanner(System.in);
    protected static ArrayList<Produto> produtos;
    protected static ArrayList<Jornal> jornais;
    protected static ArrayList<Revista> revistas;
    protected static ArrayList<Livro> livros;
    public static JTextField text, text2, text3, text4, text5, text6,  ref;

    public static void main(String[] args) {
        produtos = new ArrayList<>();
        jornais = new ArrayList<>();
        revistas = new ArrayList<>();
        livros = new ArrayList<>();
        
        new Menu();

    }
}