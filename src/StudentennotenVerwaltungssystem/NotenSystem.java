package StudentennotenVerwaltungssystem;

import java.util.Arrays;
import java.util.Scanner;

public class NotenSystem {
    private String name;
    private int[] noten;
    Scanner scanner;

    public NotenSystem(int anzSchueler) {
        this.name = "Noten System";
        this.noten = new int[anzSchueler];
        scanner = new Scanner(System.in);
    }

    public void setNoten() {
        //TODO Bei falscher eingabe nicht einfach abbrechen sondern bei der aktuellen eingabe fortführen.. try catch?
        System.out.println("Debug: setNoten");
        for (int i = 0; i < noten.length; i++) {
            System.out.println("Note für Schüler "+(i+1)+" setzen: ");
            int temp = scanner.nextInt();
            if(temp<7&&temp>0) {
                noten[i] = temp;
            } else {
                System.out.println("Bitte Noten von 6 bis 1 eingeben!");
                break;
            }
        }
        System.out.println("Debug noten[]: "+ Arrays.toString(noten));
    }

    public void printNotentabelle(){
        System.out.println("Debug: printNotentabelle");
        System.out.println("-------[NOTENTABELLE]-------");
        for (int i = 0; i < noten.length; i++) {
            System.out.print("Schüler Nr."+(i+1)+" Note: "+ noten[i]+"\n");
        }
    }


}
