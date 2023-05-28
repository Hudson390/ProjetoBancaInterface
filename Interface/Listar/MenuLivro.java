package Interface.Listar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Main.Banca;
import Modelo.Livro;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class MenuLivro extends Banca{

    public MenuLivro(){

        setTitle(" MENU LIVROS");
        setVisible(true);
        setSize(1100,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        setLayout(null);

        JButton botao = new JButton("VOLTAR");
        botao.setBounds(900,15, 150, 40);
        botao.setFont(new Font("Arial", Font.BOLD, 15));
        botao.setForeground(new Color(237, 241, 238));
        botao.setBackground(new Color(9, 10, 9));
        add(botao);

        JLabel titulo = new JLabel("LIVROS");
        titulo.setBounds(20, 20, 500, 20 );
        titulo.setFont(new Font("Arial Black", Font.BOLD, 25));
        add(titulo);

    
        if (livros.size() > 0) {
            int i = 20;

            for (Livro l : livros) {
                i = i + 50;
                JLabel a = new JLabel("   " + l);
                a.setBounds(10, i, 1200, 30 );
                a.setFont(new Font("Arial", Font.BOLD, 15));
                add(a);
                JLabel b = new JLabel();
                add(b);
                } 

        }

        botao.addActionListener(this::voltar);
    }

    private void voltar(ActionEvent actionevent1) {
        dispose();
        new MenuListar();
    }
}