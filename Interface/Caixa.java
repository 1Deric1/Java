package Interface;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Caixa extends JFrame {
    JCheckBox jCheckBox;
    public Caixa() {
        setSize(700,500);
        setLayout(null);
        setTitle("TELA PRINCIPAL");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        jCheckBox = new JCheckBox("Concorda em peidar?");
        jCheckBox.setBounds(250,150,150,150);
        jCheckBox.addActionListener(this::action);
        add(jCheckBox);

        setVisible(true);
    }

    private void action(ActionEvent actionEvent) {
        //O programa diz se a caixa esta selecionada ou nao
        System.out.println(jCheckBox.isSelected());
    }
}
