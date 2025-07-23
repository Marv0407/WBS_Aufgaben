package Swing.MVC.formular;

import javax.swing.*;
import java.awt.*;

public class UserView extends JFrame {
    private JTextField nameField = new JTextField(20);
    private JTextField emailField = new JTextField(20);
    private JButton submitButton = new JButton("Submit");
    private JLabel messageLabel = new JLabel();


    public UserView() {
        this.setTitle("User");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setLayout(new GridLayout(4, 2));

        this.add(new JLabel("Name:"));
        this.add(nameField);
        this.add(new JLabel("Email:"));
        this.add(emailField);
        this.add(submitButton);
        this.add(messageLabel);
    }

    public JTextField getNameField() {
        return nameField;
    }
    public JTextField getEmailField() {
        System.out.println();
        return emailField;
    }
    public JButton getSubmitButton() {
        return submitButton;
    }
    public void showMessage(String message) {
        messageLabel.setText(message);
    }
}
