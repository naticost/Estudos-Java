package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.*;

import ui.CadastroUsuario;
import ui.InterfaceAdministrador;
import ui.InterfaceBibliotecario;
import ui.InterfaceMembroBiblioteca;
import logic.AcervoDeLivros;
import logic.Biblioteca;

public class menu extends JPanel {
    private BufferedImage backgroundImage;

    public menu() {
        Biblioteca biblioteca = new Biblioteca(); // Cria uma nova instância de Biblioteca

        // Carrega a imagem de fundo
        try {
            backgroundImage = ImageIO.read(new File("estudos-java/AtividadeTela/src/main/background.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        

        // Criação da barra de menu
        JMenuBar barramenu = new JMenuBar();

        // Criação dos menus
        JMenu fileMenu = new JMenu("Menu");
        JMenu collectioMenu = new JMenu("Acervo de livros");
        JMenu aboutMenu = new JMenu("Sobre");

        // Criação dos itens de menu para o menu
        JMenuItem bibliotecario = new JMenuItem("Bibliotecário");
        JMenuItem membro = new JMenuItem("Membro");
        JMenuItem administrador = new JMenuItem("Administrador");
        JMenuItem sair = new JMenuItem("Sair");
        JMenuItem acervoDeLivros = new JMenuItem("Acervo de Livros");
        JMenuItem sobre = new JMenuItem("Sobre");
           
        aboutMenu.add(sobre);

        // Adicionar um ActionListener para o item de menu "Sobre"
        sobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Sistema Bibliotecário\n Atividade de seminario da matéria de POO do 3º periodo do curso de ADS, orientado pelo Professor Manfrine Santos. \n Sistema de gerenciamento de biblioteca desenvolvido em Java, com uma interface gráfica de usuário (GUI).\n \n\nDesenvolvedores:\n- Adila \n- Yan \n- Natiele ",
                        "Sobre",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Adiciona um ouvinte de ação ao item "Sair"
        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exibe uma caixa de diálogo de confirmação ao clicar em "Sair"
                int option = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0); // Sai do programa
                }
            }
        });

        // Ações ao clicar no menuitem bibliotecario
        bibliotecario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfaceBibliotecario interfaceBibliotecario = new InterfaceBibliotecario(biblioteca);
                interfaceBibliotecario.setVisible(true);
            }
        });

        // Ações ao clicar no menu item membro
        membro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfaceMembroBiblioteca interfaceMembroBiblioteca = new InterfaceMembroBiblioteca(biblioteca);
                interfaceMembroBiblioteca.setVisible(true);
            }
        });

        // Ações ao clicar no menu item Administrador
        administrador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfaceAdministrador interfaceAdministrador = new InterfaceAdministrador(biblioteca);
                interfaceAdministrador.setVisible(true);
            }
        });

        // Ações ao clicar no menuitem Acervo de Livros
        acervoDeLivros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Criar lista de livros de exemplo
                List<String[]> livros = new ArrayList<>();
                livros.add(new String[]{"1", "JAVA como programar ", "Paul Deitel", "2016", "Disponível"});
                livros.add(new String[]{"2", "Engenharia de Software ", "Roger S. Pressman", "2021", "Emprestado"});
                livros.add(new String[]{"3", "Sistemas de Banco de Dados", "Elmasri", "2019", "Disponível"});
                livros.add(new String[]{"4", "Sistemas Operacionais Modernos", "Andrew S Tanenbaum", "2024", "Disponível"});
                livros.add(new String[]{"5", "Entendendo Algoritmos: guia Ilustrado", "Aditya Y.Bhargava", "2017", "Disponível"});
                livros.add(new String[]{"6", "Arquitetura Limpa", "Robert C. Martin", "2019", "Emprestado"});
                livros.add(new String[]{"7", "Introdução à Linguagem SQL ", "Thomas Nield ", "2016", "Emprestado"});
                livros.add(new String[]{"8", "Modelagem de Dados", "José Osvaldo de Sordi", "2019", "Disponível"});
                livros.add(new String[]{"9", "Governaça de Dados ", "Carlos Bardieri", "2019", "Disponível"});
                livros.add(new String[]{"10", "Um Curso de Cálculo - Vol. 1 ", "Hamilton Luiz Guidorizzi","2018","Disponível"});                
                livros.add(new String[]{"11", "Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros",  "Aditya Y. Bhargava", "2017","Emprestado"});
                livros.add(new String[]{"12", "Estática: Mecânica para Engenharia", "R. C. Hibbeler", "2010","Disponível"});
                livros.add(new String[]{"13", "Linguagem C - Completa e Descomplicada",  "André Backes", "2022","Disponível"});
                livros.add(new String[]{"14", "Algoritmos e Lógica da Programação",  "Marco A. Furlan de Souza" ,"2019","Emprestado"});
                livros.add(new String[]{"15", "Introdução à Programação com Python 4ª Edição: Algoritmos e lógica de programação para iniciantes", "Nilo Ney Coutinho Menezes", "2024","Disponível"});
                livros.add(new String[]{"16", "HTML5 e CSS3: Guia Prático e Visual", "Elizabeth Castro, Bruce Hyslop", "2013", "Disponível"});
                livros.add(new String[]{"17", "Construindo Aplicações web com PHP e MySQL", "André Milani", "2016", "Disponível"});
                livros.add(new String[]{"18", "Use A Cabeça! PHP e MySQL",  "Lynn Beighley", "2010", "Disponível"});
                livros.add(new String[]{"19", "React Native: Desenvolvimento de aplicativos mobile com React", "Bruna Escudelario, Diego Pinho", "2020", "Disponível"});
                livros.add(new String[]{"20", "Ruby: Aprenda a programar na linguagem mais divertida",  "Lucas Souza", "2014", "Disponível"});
                            
                // Adicionar mais livros conforme necessário

                AcervoDeLivros acervoDeLivrosFrame = new AcervoDeLivros(livros);
                acervoDeLivrosFrame.setVisible(true);
            }
        });

        // Adiciona os menus à barra de menu
        barramenu.add(fileMenu);
        barramenu.add(collectioMenu);
        barramenu.add(aboutMenu);

        // Adiciona os itens de menu ao menu
        fileMenu.add(bibliotecario);
        fileMenu.add(membro);
        fileMenu.add(administrador);
        fileMenu.addSeparator(); // Adiciona uma linha separadora
        fileMenu.add(sair);
        collectioMenu.add(acervoDeLivros); // Adicionar o item de menu Acervo de Livros ao collectioMenu

        // Define a barra de menu para este painel
        setLayout(new BorderLayout());
        add(barramenu, BorderLayout.NORTH);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        
        JFrame frame = new JFrame("Sistema Bibliotecário");
        menu panel = new menu();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 800);
        frame.add(panel);
        frame.setVisible(true);
        cadastroUsuario.setVisible(true);
        cadastroUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
