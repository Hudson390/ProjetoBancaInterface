package Interface.Cadastro;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Interface.Menu;
import Main.Banca;

import java.awt.event.ActionEvent;

public class MenuCadastro extends Banca{

    public MenuCadastro() {
        setTitle("MENU");
        setVisible(true);
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.YELLOW);


        setLayout(null);

        JLabel titulo = new JLabel("CADASTRAR PRODUTO");
        titulo.setBounds(100, 30, 400, 50 );
        titulo.setFont(new Font("Arial Black", Font.BOLD, 22));
        add(titulo);

        JButton Buttonproduto = new JButton("PRODUTO GENERICO");
        Buttonproduto.setBounds(120,100, 250, 70);
        Buttonproduto.setFont(new Font("Arial", Font.BOLD, 15));
        Buttonproduto.setForeground(new Color(237, 241, 238));
        Buttonproduto.setBackground(new Color(9, 10, 9));
        add(Buttonproduto);

        JButton ButtonJornal = new JButton("JORNAL");
        ButtonJornal.setBounds(120,180, 250, 70);
        ButtonJornal.setFont(new Font("Arial", Font.BOLD, 15));
        ButtonJornal.setForeground(new Color(237, 241, 238));
        ButtonJornal.setBackground(new Color(9, 10, 9));
        add(ButtonJornal);

        JButton ButtonRevista = new JButton("REVISTA");
        ButtonRevista.setBounds(120,260, 250, 70);
        ButtonRevista.setFont(new Font("Arial", Font.BOLD, 15));
        ButtonRevista.setForeground(new Color(237, 241, 238));
        ButtonRevista.setBackground(new Color(9, 10, 9));
        add(ButtonRevista);

        JButton ButtonLivro = new JButton("LIVRO");
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

        ButtonVoltar.addActionListener(this::voltar);
        Buttonproduto.addActionListener(this::produto);
        ButtonJornal.addActionListener(this::jornal);
        ButtonRevista.addActionListener(this::revista);
        ButtonLivro.addActionListener(this::livro);
    }

    private void voltar(ActionEvent actionevent1) {
        dispose();
        new Menu();
    }

    private void produto(ActionEvent actionevent1) {
        dispose();
        new CadastroProduto();
    }

    private void jornal(ActionEvent actionevent1) {
        dispose();
        new CadastroJornal();
    }

    private void revista(ActionEvent actionevent1) {
        dispose();
        new CadastroRevista();
    }

    private void livro(ActionEvent actionevent1) {
        dispose();
        new CadastroLivro();
    }
}
