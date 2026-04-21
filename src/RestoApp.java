public class RestoApp {
    public static void main(String[] args) {
        
        System.out.println("--- MAIN MENU ---")

        MenuCategory barkadaMeal = new MenuCategory("Barkada Solo Meal");

        barkadaMeal.add(new MenuItem("Classic Burger", 250.00));
        barkadaMeal.add(new MenuItem("Large Fries", 85.00));
        barkadaMeal.add(new MenuItem("Root Beer", 60.00));
        barkadaMeal.add(new MenuItem("Vanilla Sundae", 45.00));

        mainMenu.add(barkadaMeal);

        mainMenu.print();
        
        System.out.println("\n==============================");
        System.out.println("Total Menu Value: ₱" + String.format("%.2f", mainMenu.getPrice()));
    }
}