package RestaurantBestellsystem.model;

public class MenuItem {
    private static int count = 1;
    private String name;
    private final int id;
    double price;


    public MenuItem(String name, double price) {
        this.name = name;
        this.id = count;
        this.price = price;
        count++;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(""+id);
        builder.append(" - ");
        builder.append(name);
        builder.append(" - ");
        builder.append(price);
        return builder.toString();
    }
}
