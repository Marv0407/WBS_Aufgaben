package Swing;

import javax.swing.*;
import java.awt.*;

public class MehrereButtons {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Mehrere");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1,2));


        JButton button = new JButton("Hallo");
        JButton button1 = new JButton("Hallo1");

        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Hallo!", "Button", JOptionPane.WARNING_MESSAGE);
        });
        button1.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Hallo1!", "Button", JOptionPane.QUESTION_MESSAGE);
        });


        panel.add(button);
        panel.add(button1);

        frame.add(panel);

        frame.setVisible(true);
    }
}
