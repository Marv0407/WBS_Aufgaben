package RestaurantBestellsystem.model;

import java.util.ArrayList;
import java.util.Scanner;

import static RestaurantBestellsystem.RestaurantApp.menu;

public class Order {
    String kundenName;
    ArrayList<MenuItem> orderList;
//    ArrayList<MenuItem> menu;

    public Order(String kundenName){
        this.kundenName = kundenName;
        orderList = new ArrayList<>();
    }

    public void placeOrder(MenuItem menuItem){
        orderList.add(menuItem);
    }

    public void getOrder(){
        final Scanner scanner = new Scanner(System.in);
        while(true){
            String antwort;
            System.out.println("Bitte wählen Sie ein Gericht anhand der ID: ");
            placeOrder(menu.get(scanner.nextInt()-1));
            System.out.println("Weitere Gerichte hinzufügen? Y/N");
            antwort = scanner.next();
            if(antwort.equals("Y")){
                continue;
            } else if(antwort.equals("N")){
                break;
            }
            break;
        }
    }

    double getGesamtpreis(){
        double gesamt = 0.0;
        for (MenuItem menuItem : orderList){
            gesamt = gesamt + menuItem.getPrice();
        }
        return gesamt;
    }

    public void printQuittung(){
        final StringBuilder sb = new StringBuilder();
        sb.append("------| Quittung |------");
        sb.append("\n");
        sb.append("Kunde: "+kundenName);
        sb.append("\n");
        for(MenuItem menuItem : orderList){
            sb.append(menuItem.toString());
            sb.append("\n");
        }
        sb.append("Gesamtpreis: "+getGesamtpreis());
        sb.append("\n");
        sb.append("Vielen Dank für Ihre Bestellung!");
        System.out.println(sb.toString());
    }


}
