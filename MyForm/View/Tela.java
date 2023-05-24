package MyForm.View;

import MyForm.DAO.FuncionariosDAO;
import MyForm.DTO.FuncionariosDTO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Tela extends JDialog{
    private JButton enviarButton;

    public JPasswordField getSenhaUser() {
        return SenhaUser;
    }

    public void setSenhaUser(JPasswordField senhaUser) {
        SenhaUser = senhaUser;
    }

    public JTextField getNomeUser() {
        return NomeUser;
    }

    public void setNomeUser(JTextField nomeUser) {
        NomeUser = nomeUser;
    }



    private JPasswordField SenhaUser;
    private JTextField NomeUser;
    private String nome;
    private String senha;

    private JLabel TxtNm;
    private JLabel Txtpass;
    private JPanel contentPane;


    public Tela() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(enviarButton);
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarDados();
            }
        });
    }
    private void salvarDados() {
        nome = NomeUser.getText();
        senha = SenhaUser.getText();


        if (nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(this.NomeUser, "O nome não pode ser vazio.");
            return;
        }


        if (senha == null || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this.SenhaUser, "O senha não pode ser vazio.");
            return;
        }

        FuncionariosDTO funcionario = new FuncionariosDTO(  nome, senha);
        // Fazer algo com os dados salvos...
        JOptionPane.showMessageDialog(null,"Seus Dados foram salvos");
        dispose(); // Fechar a janela
    }

}
