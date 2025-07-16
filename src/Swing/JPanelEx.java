package Swing;

import javax.swing.*;

public class JPanelEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel ECKZAMPEL");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Text im Panel");

        panel.add(label);
        frame.add(panel);

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
