package Interface.Remover;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Main.Banca;
import Metodos.Remover;
import Modelo.Produto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class JanelaRemoveProduto extends Banca {
    
    public JanelaRemoveProduto() {
        setTitle("PRODUTOS");
        setVisible(true);
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        setLayout(null);

        JButton botao = new JButton("VOLTAR");
        botao.setBounds(300,500, 150, 40);
        botao.setFont(new Font("Arial", Font.BOLD, 15));
        botao.setForeground(new Color(237, 241, 238));
        botao.setBackground(new Color(9, 10, 9));
        add(botao);

        JButton selecionar = new JButton("REMOVER");
        selecionar.setBounds(100,500, 150, 40);
        selecionar.setFont(new Font("Arial", Font.BOLD, 15));
        selecionar.setForeground(new Color(237, 241, 238));
        selecionar.setBackground(new Color(9, 10, 9));
        add(selecionar);

        JLabel titulo = new JLabel("PRODUTOS GENERICOS");
        titulo.setBounds(20, 20, 500, 20 );
        titulo.setFont(new Font("Arial Black", Font.BOLD, 25));
        add(titulo);

        JLabel titulo2 = new JLabel("REFERENCIA      |       TITULO");
        titulo2.setBounds(20, 60, 500, 20 );
        titulo2.setFont(new Font("Arial", Font.BOLD, 18));
        add(titulo2);

        int x = 40;

        for (int i = 0; i < produtos.size(); i++) {
            Produto uTemp = produtos.get(i);

            x = x + 50;
            JLabel a = new JLabel("           [ " + i + " ]              |        " + uTemp.getTitulo());
            a.setBounds(10, x, 800, 30 );
            a.setFont(new Font("Arial", Font.BOLD, 18));
            add(a);
            JLabel b = new JLabel();
            add(b);

            
        }

        JLabel referencia = new JLabel("  Escolha o produto com base na referencia.");
        referencia.setBounds(10, 450, 500, 30 );
        referencia.setFont(new Font("Arial Black", Font.BOLD, 15));
        add(referencia);

        text = new JTextField();
        text.setBounds(20,500, 35, 40);
        text.setFont(new Font("Arial", Font.BOLD, 15));

        add(text);

        botao.addActionListener(this::voltar);
        selecionar.addActionListener(this::selecionar);
    }

    private void voltar(ActionEvent actionevent1) {
        dispose();
        new MenuRemover();
    }

    private void selecionar(ActionEvent actionevent1) {
        Remover.removerProdutoGenerico();
        JOptionPane.showMessageDialog(null, "REMOVIDO!","Removido com sucesso!", JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
        new MenuRemover();
    }
}