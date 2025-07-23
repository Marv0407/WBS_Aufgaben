package RestaurantBestellsystem.gui;
import RestaurantBestellsystem.model.MenuItem;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static RestaurantBestellsystem.RestaurantApp.addMenuItem;
import static RestaurantBestellsystem.RestaurantApp.menu;

public class MainWindow {
    public static void main(String[] args) {

        addMenuItem(new MenuItem("Pizza Margherita", 7.00));
        addMenuItem(new MenuItem("Pizza Hawaii", 9.50));
        addMenuItem(new MenuItem("Pizza Salami", 9.00));
        addMenuItem(new MenuItem("Pizza Diavolo", 11.00));
        addMenuItem(new MenuItem("Lasagne", 17.00));




        //? Menü Panel
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Restaurant Bestellsystem");
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);


            DefaultListModel<MenuItem> orderListModel = new DefaultListModel<>();
            for (MenuItem menuItem : menu) {
                orderListModel.addElement(menuItem);
            }
            JList<MenuItem> menuList = new JList<>(orderListModel);
            menuList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            JScrollPane scrollPane = new JScrollPane(menuList);
            scrollPane.setPreferredSize(new Dimension(200, 120));
            scrollPane.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,10,true));

            JPanel northPanel = new JPanel();
            northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.Y_AXIS));
            northPanel.setBackground(Color.ORANGE);

            JLabel titel = new JLabel("Menü");
            titel.setFont(new Font(titel.getFont().getName(), Font.BOLD, 14));
            titel.setAlignmentX(Component.CENTER_ALIGNMENT);

            scrollPane.setAlignmentX(Component.CENTER_ALIGNMENT);

            northPanel.add(titel);
            northPanel.add(Box.createVerticalStrut(8));
            northPanel.add(scrollPane);

            JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 2));
            inputPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel kundenName = new JLabel("Kundenname:");
            JTextField kundenNameField = new JTextField(20);
            inputPanel.add(kundenName);
            inputPanel.add(kundenNameField);

            northPanel.add(inputPanel);


            DefaultListModel<MenuItem> kundenOrderModel = new DefaultListModel<>();


            JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 2));
            buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JButton bestell1 = new JButton("1");
            bestell1.addActionListener(e -> {
                kundenOrderModel.add(0,menu.get(0));
            });
            JButton bestell2 = new JButton("2");
            bestell2.addActionListener(e -> {
                kundenOrderModel.add(1,menu.get(1));
            });
            JButton bestell3 = new JButton("3");
            bestell3.addActionListener(e -> {
                kundenOrderModel.add(2,menu.get(2));
            });
            JButton bestell4 = new JButton("4");
            bestell4.addActionListener(e -> {
                kundenOrderModel.add(3,menu.get(3));
            });
            JButton bestell5 = new JButton("5");
            bestell5.addActionListener(e -> {
                kundenOrderModel.add(4,menu.get(4));
            });

            buttonPanel.add(bestell1);
            buttonPanel.add(bestell2);
            buttonPanel.add(bestell3);
            buttonPanel.add(bestell4);
            buttonPanel.add(bestell5);

            northPanel.add(buttonPanel);

            JPanel textPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 2));
            textPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);

            


            frame.getContentPane().add(northPanel, BorderLayout.NORTH);

            frame.setVisible(true);
        });










    }
}
