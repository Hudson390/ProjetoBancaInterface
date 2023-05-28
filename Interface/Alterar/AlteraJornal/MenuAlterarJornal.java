package Interface.Alterar.AlteraJornal;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Interface.Alterar.MenuAlterar;
import Main.Banca;
import Metodos.Alteracao;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class MenuAlterarJornal extends Banca {

    public MenuAlterarJornal() {
        setTitle("ALTERAR JORNAL ");
        setVisible(true);
        setSize(600,520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);


        setLayout(null);

        JButton botao = new JButton("VOLTAR");
        botao.setBounds(40,370, 244, 70);
        botao.setFont(new Font("Arial", Font.BOLD, 15));
        botao.setForeground(new Color(237, 241, 238));
        botao.setBackground(new Color(9, 10, 9));
        add(botao);

        JButton botao2 = new JButton("CADASTRAR");
        botao2.setBounds(300,370, 244, 70);
        botao2.setFont(new Font("Arial", Font.BOLD, 15));
        botao2.setForeground(new Color(237, 241, 238));
        botao2.setBackground(new Color(9, 10, 9));
        add(botao2);

        botao.addActionListener(this::menu);
        botao2.addActionListener(this::cadastrar);
        
        text2 = new JTextField();
        text2.setBounds(40,70, 500, 50);
        text2.setFont(new Font("Arial", Font.BOLD, 15));

        text3 = new JTextField();
        text3.setBounds(40,170, 500, 50);
        text3.setFont(new Font("Arial", Font.BOLD, 15));

        text4 = new JTextField();
        text4.setBounds(40,270, 500, 50);
        text4.setFont(new Font("Arial", Font.BOLD, 15));

        add(text2);
        add(text3);
        add(text4);

        JLabel nome = new JLabel("NOME DO PRODUTO");
        nome.setBounds(40, 20, 200, 50 );
        nome.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel preco = new JLabel("PREÇO DO PRODUTO");
        preco.setBounds(40, 120, 200, 50 );
        preco.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel data = new JLabel("DATA DE PUBLICAÇÃO");
        data.setBounds(40, 220, 200, 50 );
        data.setFont(new Font("Arial", Font.BOLD, 15));
        add(nome);
        add(preco);
        add(data);

    }

    private void menu(ActionEvent actionevent1){
        dispose();
        new MenuAlterar();
    }

    private void cadastrar(ActionEvent actionevent1) {

        Alteracao.MenuAlterarJornal();

        JOptionPane.showMessageDialog(null, text2.getText(),"Cadastrado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
        dispose();
        new MenuAlterar();
    }
    
}