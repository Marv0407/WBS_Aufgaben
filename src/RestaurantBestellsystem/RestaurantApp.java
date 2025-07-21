package RestaurantBestellsystem;

import RestaurantBestellsystem.model.MenuItem;
import RestaurantBestellsystem.model.Order;

import javax.swing.*;
import java.util.ArrayList;

public class RestaurantApp {
    public static ArrayList<MenuItem> menu = new ArrayList<>();


    public static void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
    }











    //! MAIN -----------------------------------------------------------
    public static void main(String[] args) {

        addMenuItem(new MenuItem("Pizza Margherita", 7.00));
        addMenuItem(new MenuItem("Pizza Hawaii", 9.50));
        addMenuItem(new MenuItem("Pizza Salami", 9.00));
        addMenuItem(new MenuItem("Pizza Diavolo", 11.00));
        addMenuItem(new MenuItem("Lasagne", 17.00));

        System.out.println("===== WELCOME TO JAVA RESTAURANT =====\nUnsere Speisekarte:\n");
        for(MenuItem i: menu){
            System.out.println(i);
        }
        Order order = new Order("Jeffrey Epstein");
        order.getOrder();


        order.printQuittung();

    }

}
