import java.util.List;
import java.util.ArrayList;

public class MenuCategory implements MenuComponent {
    private String categoryName;
    private List<MenuComponent> menuComponents;

    public MenuCategory(String name) {
        this.categoryName = name;
        this.menuComponents = new ArrayList<>();
    }

    // Implemented Methods
    @Override
    public double getPrice() {
        double totalPrice = 0.0;
        for(MenuComponent item: menuComponents) {
            totalPrice += item.getPrice;
        }
        return totalPrice;
    }

    @Override
    public void print() {
        System.out.println("\n--- " + this.categoryName.toUpperCase() + " ---");
        for (MenuComponent component : menuComponents) {
            component.print();
        }
    }
    
    // Composite Methods for adding and removing items from list
    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }
}