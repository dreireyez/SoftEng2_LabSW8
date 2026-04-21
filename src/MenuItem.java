public class MenuItem implements MenuComponent {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Implemented Methods
    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String display() {
        return " - " + name + ": " + "₱" + String.valueOf(price); 
    }
}