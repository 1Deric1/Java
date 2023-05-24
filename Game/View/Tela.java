package Game.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.net.URI;

public class Tela extends JDialog{
    private JButton btn;
    private JPanel Cont;
public Tela() {
    Desktop desktop = Desktop.getDesktop();
    setContentPane(Cont);
    setModal(true);
    getRootPane().setDefaultButton(btn);
    btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    Cont.addComponentListener(new ComponentAdapter() {
    });
}
}
