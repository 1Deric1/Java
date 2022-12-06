package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame{
    //construtor
    JTextField txt;
    public Screen (){
        //INTERFACE
        //Faz com q a tela apareça mas ja vem "false padrao"
        //setVisible(true);
        //tamanho
        setSize(700,500);
        //atribuir titulo
        setTitle("MEu PRograma");
        //Quando eu fechar a interface grafica ele para de rodar
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Não pode flexibilizar a tela da interface
        setResizable(false);
        //Ele centraliza no meio da tela
        setLocationRelativeTo(null);
        setLayout(null);

        //BOTAO
        //Tem duas formas de setar o nome no botao pode ser no contrutor ou ultilizando o objeto jButton
        JButton jButton = new JButton();
        jButton.setText("Clique aqui");
        jButton.setFont(new Font("Arial",Font.BOLD, 12));
        //adiciona as funcoes dentro da interface
        jButton.setBounds(290,360,100,70);
        jButton.setForeground(new Color(0xFFFFFF));
        jButton.setBackground(new Color(0x151414));

        JButton jButton2 = new JButton("Clique aqui");
        jButton2.setFont(new Font("Arial",Font.ITALIC, 10));
        //adiciona as funcoes dentro da interface
        jButton2.setBounds(100,0,100,100);
        jButton2.setForeground(new Color(0xFFB6B6));
        jButton2.setBackground(new Color(0x000000));
        add(jButton);
        add(jButton2);

        jButton.addActionListener(this::actionPerformed);
        jButton2.addActionListener(this::teste);

        txt = new JTextField("Click aqui");
        txt.setBounds(100,160,100,100);
        txt.setFont(new Font("Arial",Font.BOLD, 12));
        txt.setText("Texto");
        add(txt);

        setVisible(true);

    }

    private void teste(ActionEvent actionEvent) {

        JOptionPane.showMessageDialog(null,"Obrigado por clicar","Titulo2",JOptionPane.INFORMATION_MESSAGE);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,txt.getText(),"Titulo",JOptionPane.WARNING_MESSAGE);
    }
}
