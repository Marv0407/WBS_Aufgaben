package StudentennotenVerwaltungssystem;

public class Main {
    public static void main(String[] args) {
        NotenSystem ns = new NotenSystem(5);
        ns.setNoten();
        ns.printNotentabelle();
    }
}
