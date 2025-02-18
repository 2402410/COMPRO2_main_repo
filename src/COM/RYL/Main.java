package COM.RYL;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create flavor notes for coffee1
        List<String> flavorNotes1 = new ArrayList<>();
        flavorNotes1.add("Caramel");
        flavorNotes1.add("Smoky");

        // Create flavor notes for coffee2
        List<String> flavorNotes2 = new ArrayList<>();
        flavorNotes2.add("Berry");
        flavorNotes2.add("Sweet");

        // Create two coffee objects
        Coffee coffee1 = new Coffee("Cappuccino", "Arabica", "Medium", 300.0, "Medium", "Brazil", false, 10, flavorNotes1, "Espresso");
        Coffee coffee2 = new Coffee("Mocha", "Robusta", "Large", 399.99, "Dark", "Vietnam", true, 0, flavorNotes2, "French Press");

        // Call methods for coffee1
        System.out.println(coffee1.describe());
        coffee1.calculatePrice("Large");
        System.out.println("Price after changing size: Php" + coffee1.getPrice());
        coffee1.addFlavor("Chocolate");
        System.out.println(coffee1.describe());
        coffee1.updateStock(5);
        System.out.println("Stock after update: " + coffee1.getStock());
        coffee1.discount(15);
        System.out.println("Price after discount: Php" + coffee1.getPrice());

        // Call methods for coffee2
        System.out.println("\n" + coffee2.describe());
        System.out.println("Is coffee2 in stock? " + (coffee2.checkStock() ? "Yes" : "No"));
        coffee2.setDecaf(false);
        System.out.println("Is coffee2 decaf? " + (coffee2.isDecaf() ? "Yes" : "No"));
        coffee2.changeRoastLevel("Light");
        System.out.println("New roast level for coffee2: " + coffee2.describe());
    }
}
