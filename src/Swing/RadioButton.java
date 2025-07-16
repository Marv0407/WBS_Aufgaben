package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);


        JPanel panel = new JPanel(new GridLayout());


        JRadioButton radioButton = new JRadioButton("Poopy");
        JRadioButton radioButton1 = new JRadioButton("Poop");
        JRadioButton radioButton2 = new JRadioButton("Funny");



        //BUttongroup
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton);
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        radioButton1.addItemListener(new ItemListener() {
                                         @Override
                                         public void itemStateChanged(ItemEvent e) {
                                             if (e.getStateChange() == ItemEvent.SELECTED) {
                                                 radioButton1.setBackground(Color.GREEN);
                                                 radioButton1.setOpaque(true);
                                             } else {
                                                 radioButton1.setBackground(null);
                                                 radioButton1.setOpaque(false);
                                             }
                                         }
                                     });


        panel.add(radioButton);
        panel.add(radioButton1);
        panel.add(radioButton2);

        frame.add(panel);
        frame.setVisible(true);
    }
}
