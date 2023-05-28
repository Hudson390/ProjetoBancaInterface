package Interface.Remover;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Interface.Menu;
import Main.Banca;

import java.awt.event.ActionEvent;

public class MenuRemover extends Banca {

    public MenuRemover() {

        setTitle("MENU REMOVER");
        setVisible(true);
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.RED);


        setLayout(null);

        JLabel titulo = new JLabel("REMOVER PRODUTOS");
        titulo.setBounds(110, 30, 600, 50 );
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial Black", Font.BOLD, 22));
        add(titulo);

        JButton ButtonProduto = new JButton("PRODUTO GENERICO");
        ButtonProduto.setBounds(120,100, 250, 70);
        ButtonProduto.setFont(new Font("Arial", Font.BOLD, 15));
        ButtonProduto.setForeground(new Color(237, 241, 238));
        ButtonProduto.setBackground(new Color(9, 10, 9));
        add(ButtonProduto);

        JButton ButtonJornal = new JButton("JORNAIS");
        ButtonJornal.setBounds(120,180, 250, 70);
        ButtonJornal.setFont(new Font("Arial", Font.BOLD, 15));
        ButtonJornal.setForeground(new Color(237, 241, 238));
        ButtonJornal.setBackground(new Color(9, 10, 9));
        add(ButtonJornal);

        JButton ButtonRevista = new JButton("REVISTAS");
        ButtonRevista.setBounds(120,260, 250, 70);
        ButtonRevista.setFont(new Font("Arial", Font.BOLD, 15));
        ButtonRevista.setForeground(new Color(237, 241, 238));
        ButtonRevista.setBackground(new Color(9, 10, 9));
        add(ButtonRevista);

        JButton ButtonLivro = new JButton("LIVROS");
        ButtonLivro.setBounds(120,340, 250, 70);
        ButtonLivro.setFont(new Font("Arial", Font.BOLD, 15));
        ButtonLivro.setForeground(new Color(237, 241, 238));
        ButtonLivro.setBackground(new Color(9, 10, 9));
        add(ButtonLivro);

        JButton ButtonVoltar = new JButton("VOLTAR");
        ButtonVoltar.setBounds(120,420, 250, 70);
        ButtonVoltar.setFont(new Font("Arial", Font.BOLD, 15));
        ButtonVoltar.setForeground(new Color(237, 241, 238));
        ButtonVoltar.setBackground(new Color(9, 10, 9));
        add(ButtonVoltar);


        ButtonProduto.addActionListener(this::removerProduto);
        ButtonJornal.addActionListener(this::removerJornal);
        ButtonRevista.addActionListener(this::removerRevista);
        ButtonLivro.addActionListener(this::removerLivro);
        ButtonVoltar.addActionListener(this::voltar);

    }

    private void voltar(ActionEvent actionevent1) {
        dispose();
        new Menu();
    }

    private void removerProduto(ActionEvent actionevent1) {
        dispose();
        new JanelaRemoveProduto();
    }

    private void removerJornal(ActionEvent actionevent1) {
        dispose();
        new JanelaRemoveJornal();
    }

    private void removerRevista(ActionEvent actionevent1) {
        dispose();
        new JanelaRemoveRevista();
    }

    private void removerLivro(ActionEvent actionevent1) {
        dispose();
        new JanelaRemoveLivro();
    }

}
