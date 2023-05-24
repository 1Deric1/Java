package Testecomimg.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class TelaImg {
    private JPanel panel;

    public TelaImg() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/índice.jpg"));
        JLabel label = new JLabel();
        label.setPreferredSize(new Dimension(300, 200));
        Image image = icon.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        icon = new ImageIcon(image);
        label.setIcon(icon);

        panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.add(label);

        JLabel infoLabel = new JLabel("Para mais informações clique aqui");
        panel.add(infoLabel);

        JButton button = new JButton("Clique Aqui");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.google.com/"));
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
        panel.add(button);
    }

    public JPanel getPanel() {
        return panel;
    }
}

