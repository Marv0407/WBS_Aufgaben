package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JCheckBox checkBox = new JCheckBox("Ich scheiß mich ein");

        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    checkBox.setBackground(Color.getHSBColor(10, 19, 50));
                }

            }


        });

        frame.add(checkBox);
        frame.setVisible(true);
    }
}
