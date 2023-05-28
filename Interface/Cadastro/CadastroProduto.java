package Interface.Cadastro;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Main.Banca;
import Metodos.Cadastro;


import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class CadastroProduto extends Banca {

    public CadastroProduto() {
        setTitle("CADASTRO PRODUTO");
        setVisible(true);
        setSize(600,410);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);


        setLayout(null);

        JButton botao = new JButton("VOLTAR");
        botao.setBounds(40,250, 244, 70);
        botao.setFont(new Font("Arial", Font.BOLD, 15));
        botao.setForeground(new Color(237, 241, 238));
        botao.setBackground(new Color(9, 10, 9));
        add(botao);

        JButton botao2 = new JButton("CADASTRAR");
        botao2.setBounds(300,250, 244, 70);
        botao2.setFont(new Font("Arial", Font.BOLD, 15));
        botao2.setForeground(new Color(237, 241, 238));
        botao2.setBackground(new Color(9, 10, 9));
        add(botao2);

        botao.addActionListener(this::menu);
        botao2.addActionListener(this::cadastrar);

        text = new JTextField();
        text.setBounds(40,70, 500, 50);
        text.setFont(new Font("Arial", Font.BOLD, 15));

        text2 = new JTextField();
        text2.setBounds(40,170, 500, 50);
        text2.setFont(new Font("Arial", Font.BOLD, 15));

        add(text);
        add(text2);

        JLabel nome = new JLabel("NOME DO PRODUTO");
        nome.setBounds(40, 20, 200, 50 );
        nome.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel preco = new JLabel("PREÇO DO PRODUTO");
        preco.setBounds(40, 120, 200, 50 );
        preco.setFont(new Font("Arial", Font.BOLD, 15));

        add(nome);
        add(preco);
    }

    private void menu(ActionEvent actionevent1){
        dispose();
        new MenuCadastro();
    }

    private void cadastrar(ActionEvent actionevent1) {

        Cadastro.cadastrarProdutos();

        JOptionPane.showMessageDialog(null, text.getText(),"Cadastrado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
        dispose();
        new CadastroProduto();
    }

}
