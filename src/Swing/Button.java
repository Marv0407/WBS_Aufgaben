package Swing;

import javax.swing.*;

public class Button {
        public static void main(String[] args) {
            // Wir machen ein neues Fenster mit einer Überschrift oben
            JFrame frame = new JFrame("Einfaches Fenster");

            // Wir sagen, wie groß das Fenster sein soll (Breite, Höhe)
            frame.setSize(400, 300);

            // Wenn man oben auf das rote X klickt, soll das Programm aufhören
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Erstellen eines Buttons ( Mit Text "Button" )
            JButton button = new JButton("Button");
            button.addActionListener(e ->
                    JOptionPane.showMessageDialog(frame, "Hallo Welt!", "Button", JOptionPane.INFORMATION_MESSAGE));

            frame.add(button);

            //void actionPerformed(ActionEvent e);



            // Jetzt zeigen wir das Fenster an
            frame.setVisible(true);
        }
}
