package Interface.Listar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Main.Banca;
import Modelo.Revista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class MenuRevista extends Banca{
    public MenuRevista(){

        setTitle(" MENU REVISTAS");
        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        setLayout(null);

        JButton botao = new JButton("VOLTAR");
        botao.setBounds(400,13, 150, 40);
        botao.setFont(new Font("Arial", Font.BOLD, 15));
        botao.setForeground(new Color(237, 241, 238));
        botao.setBackground(new Color(9, 10, 9));
        add(botao);

        JLabel titulo = new JLabel("REVISTAS");
        titulo.setBounds(20, 20, 500, 20 );
        titulo.setFont(new Font("Arial Black", Font.BOLD, 25));
        add(titulo);

    
        if (revistas.size() > 0) {
            int i = 20;

            for (Revista r : revistas) {
                i = i + 50;
                JLabel a = new JLabel("   " + r);
                a.setBounds(10, i, 800, 30 );
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