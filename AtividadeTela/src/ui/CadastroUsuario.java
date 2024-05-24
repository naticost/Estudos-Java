package ui;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CadastroUsuario extends JFrame implements ActionListener {
    public CadastroUsuario() {

        JTextField txtNome = new JTextField();
        JTextField txtEmail = new JTextField(); 
        JRadioButton rdbtnBibliotecario = new JRadioButton("Funcionário");
        JRadioButton rdbtnMembro = new JRadioButton("Aluno");
        ButtonGroup group = new ButtonGroup();
        JButton btnSalvar = new JButton("Salvar");
        JPanel panel = new JPanel();
        
        group.add(rdbtnBibliotecario);
        group.add(rdbtnMembro);
        btnSalvar.addActionListener(this);

        panel.setLayout(new GridLayout(6, 3));
        panel.add(new JLabel("Nome:"));
        panel.add(txtNome);
        panel.add(new JLabel("Email:"));
        panel.add(txtEmail);
        panel.add(new JLabel("Tipo de Usuário:"));
        panel.add(new JLabel("")); 
        panel.add(rdbtnBibliotecario);
        panel.add(rdbtnMembro);
        panel.add(new JLabel("")); 
        panel.add(new JLabel("")); 
        panel.add(btnSalvar);

        getContentPane().add(panel, BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Dados do Usuário");
        setSize(300, 200);
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