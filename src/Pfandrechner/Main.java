package Pfandrechner;

class Pfandautomat{
    public static double berechnepfand(int glasflaschen, int plastikflaschen) {
        return  (glasflaschen*0.15)+(plastikflaschen+0.25);
    }

    public static void cringe(double pfand) {
        if(pfand<1){
            System.out.println("Sie haben nur wenige Flaschen abgegeben");
        }
        if(pfand>=1 && pfand<=5){
            System.out.println("Eine gute menge an Flaschen zurückgegeben!");
        }
        if(pfand > 5){
            System.out.println("Wow, du hortest flaschen!");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Pfandautomat pfandautomat = new Pfandautomat();
        pfandautomat.cringe(pfandautomat.berechnepfand(23,133));


    }
}
