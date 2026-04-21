public class RestoApp {
    public static void main(String[] args) {
        // Create Leaves for the meal
        MenuItem burger = new MenuItem("Classic Burger", 250.00);
        MenuItem fries = new MenuItem("Large Fries", 85.00);
        MenuItem rootBeer = new MenuItem("Root Beer", 60.00);

        // Create Sub-Composite and add the meal leaves
        MenuCategory barkadaMeal = new MenuCategory("Barkada Solo Meal");
        barkadaMeal.add(burger);
        barkadaMeal.add(fries);
        barkadaMeal.add(rootBeer);

        // Create standalone Leaf
        MenuItem sundae = new MenuItem("Vanilla Sundae", 45.00);

        // Create Top-Composite and add the sub-composite and the standalone leaf
        MenuCategory mainMenu = new MenuCategory("Main Menu");
        mainMenu.add(barkadaMeal);
        mainMenu.add(sundae);

        // Test: Print the entire structure and the total price
        mainMenu.print();
        
        System.out.println("\n==============================");
        System.out.println("Total Menu Value: ₱" + String.format("%.2f", mainMenu.getPrice()));
    }
}