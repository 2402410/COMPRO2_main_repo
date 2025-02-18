package COM.RYL;

import java.util.ArrayList;
import java.util.List;

public class Coffee {
    // Properties (Attributes)
    private String name;
    private String type;
    private String size;
    private double price;
    private String roastLevel;
    private String origin;
    private boolean isDecaf;
    private int stock;
    private List<String> flavorNotes;
    private String brewMethod;

    // Constructor
    public Coffee(String name, String type, String size, double price, String roastLevel, String origin, boolean isDecaf, int stock, List<String> flavorNotes, String brewMethod) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
        this.roastLevel = roastLevel;
        this.origin = origin;
        this.isDecaf = isDecaf;
        this.stock = stock;
        this.flavorNotes = new ArrayList<>(flavorNotes);
        this.brewMethod = brewMethod;
    }

    // Method to calculate price dynamically based on size
    public void calculatePrice(String size) {
        switch (size.toLowerCase()) {
            case "small":
                this.price = 250;
                break;
            case "medium":
                this.price = 300;
                break;
            case "large":
                this.price = 399.99;
                break;
            default:
                System.out.println("Invalid size. Setting to Medium.");
                this.price = 300; // Default to medium
        }
    }

    // Method to check if the coffee is in stock
    public boolean checkStock() {
        return this.stock > 0;
    }

    // Method to add a new flavor note
    public void addFlavor(String note) {
        this.flavorNotes.add(note);
    }

    // Method to update the coffee stock
    public void updateStock(int quantity) {
        this.stock += quantity;
    }

    // Method to return a description of the coffee
    public String describe() {
        String flavorDescription = String.join(", ", this.flavorNotes);
        return name + " is a " + roastLevel + " roast coffee from " + origin +
                " with flavors of " + flavorDescription + ". Brewed using " + brewMethod + ".";
    }

    // Method to update the decaf status
    public void setDecaf(boolean isDecaf) {
        this.isDecaf = isDecaf;
    }

    // Method to change the roast level
    public void changeRoastLevel(String newRoastLevel) {
        this.roastLevel = newRoastLevel;
    }

    // Method to apply a discount to the price
    public void discount(double percentage) {
        this.price -= this.price * (percentage / 100);
    }

    // Getters for displaying purposes
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean isDecaf() {
        return isDecaf;
    }
}