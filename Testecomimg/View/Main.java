package Testecomimg.View;

import javax.swing.*;

public class Main extends JFrame{
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("Minha Tela com Imagem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        TelaImg telaImg = new TelaImg();
        JPanel panel = telaImg.getPanel();

        frame.add(panel);
        frame.setVisible(true);
    }
}
