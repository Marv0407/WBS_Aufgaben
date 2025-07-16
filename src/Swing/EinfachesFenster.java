package Swing;

import javax.swing.*;
import java.awt.*;

public class EinfachesFenster {
    public static void main(String[] args) {
        // Wir machen ein neues Fenster mit einer Überschrift oben
        JFrame frame = new JFrame("Einfaches Fenster");

        // Wir sagen, wie groß das Fenster sein soll (Breite, Höhe)
        frame.setSize(400, 300);

        // Wenn man oben auf das rote X klickt, soll das Programm aufhören
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Jetzt zeigen wir das Fenster an
        frame.setVisible(true);
    }
}