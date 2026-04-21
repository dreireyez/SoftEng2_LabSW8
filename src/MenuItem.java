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
    public void print() {
        System.out.println("  - " + this.name + ": ₱" + String.format("%.2f", this.price));
    }
}