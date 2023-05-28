package Interface;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Interface.Alterar.MenuAlterar;
import Interface.Cadastro.MenuCadastro;
import Interface.Listar.MenuListar;
import Interface.Remover.MenuRemover;
import Main.Banca;

//import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class Menu extends Banca {

    public Menu() {
        setTitle("MENU");
        setVisible(true);
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);


        setLayout(null);

        JLabel titulo = new JLabel("BEM VINDO A BANCA UFMA");
        titulo.setBounds(85, 30, 400, 50 );
        titulo.setFont(new Font("Arial Black", Font.BOLD, 22));
        add(titulo);

        JLabel autor = new JLabel("Por: Hudson Costa Diniz");
        autor.setBounds(140, 500, 400, 50 );
        autor.setFont(new Font("Arial", Font.BOLD, 18));
        add(autor);

        JButton ButtonCadastrar = new JButton("CADASTRAR PRODUTO");
        ButtonCadastrar.setBounds(120,100, 250, 70);
        ButtonCadastrar.setFont(new Font("Arial", Font.BOLD, 15));
        ButtonCadastrar.setForeground(new Color(237, 241, 238));
        ButtonCadastrar.setBackground(new Color(9, 10, 9));
        add(ButtonCadastrar);

        JButton ButtonAlterar = new JButton("ALTERAR PRODUTO");
        ButtonAlterar.setBounds(120,180, 250, 70);
        ButtonAlterar.setFont(new Font("Arial", Font.BOLD, 15));
        ButtonAlterar.setForeground(new Color(237, 241, 238));
        ButtonAlterar.setBackground(new Color(9, 10, 9));
        add(ButtonAlterar);

        JButton ButtonRemove = new JButton("EXCLUIR PRODUTO");
        ButtonRemove.setBounds(120,260, 250, 70);
        ButtonRemove.setFont(new Font("Arial", Font.BOLD, 15));
        ButtonRemove.setForeground(new Color(237, 241, 238));
        ButtonRemove.setBackground(new Color(9, 10, 9));
        add(ButtonRemove);

        JButton ButtonListar = new JButton("LISTAR PRODUTO");
        ButtonListar.setBounds(120,340, 250, 70);
        ButtonListar.setFont(new Font("Arial", Font.BOLD, 15));
        ButtonListar.setForeground(new Color(237, 241, 238));
        ButtonListar.setBackground(new Color(9, 10, 9));
        add(ButtonListar);
        

       
        ButtonCadastrar.addActionListener(this::cadastrar);
        ButtonListar.addActionListener(this::listar);
        ButtonAlterar.addActionListener(this::alterar);
        ButtonRemove.addActionListener(this::remover);
    }

    private void cadastrar(ActionEvent actionevent1) {
        dispose();
        new MenuCadastro();
    }

    private void listar(ActionEvent actionevent1) {
        dispose();
        new MenuListar();
    }

    private void alterar(ActionEvent actionevent1) {
        dispose();
        new MenuAlterar();
    }

    private void remover(ActionEvent actionevent1) {
        dispose();
        new MenuRemover();
    }
}

