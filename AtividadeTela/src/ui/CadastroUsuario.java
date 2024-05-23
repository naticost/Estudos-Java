package ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroUsuario extends JFrame implements ActionListener {

    private JTextField txtNome;
    private JTextField txtEmail;
    private JButton btnSalvar;

    public CadastroUsuario() {
        setTitle("Cadastro de Usuário");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        txtNome = new JTextField();
        txtEmail = new JTextField();
        btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(new JLabel("Nome:"));
        panel.add(txtNome);
        panel.add(new JLabel("Email:"));
        panel.add(txtEmail);
        panel.add(btnSalvar);

        getContentPane().add(panel, BorderLayout.CENTER);

        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Implementar lógica para salvar as informações do usuário
        // (banco de dados, arquivo, etc.)

        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
        dispose();
    }
}