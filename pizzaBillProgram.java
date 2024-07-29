import java.util.Scanner;

class Pizza {
    private String type;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;
    private double basePrice;
    private double cheesePrice;
    private double toppingsPrice;
    private double takeAwayPrice;

    public Pizza(String type, boolean extraCheese, boolean extraToppings, boolean takeAway) {//constructor (called when object is created)
        this.type = type;
        this.extraCheese = extraCheese;
        this.extraToppings = extraToppings;
        this.takeAway = takeAway;
        fixPrices();
    }

    private void fixPrices() {
        switch (type) {
            case "vegPizza":
                this.basePrice = 300.00;
                break;
            case "vegDeluxe":
                this.basePrice = 550.00;
                break;
            case "nonVegPizza":
                this.basePrice = 300.00;
                break;
            case "nonVegDeluxe":
                this.basePrice=550.00;
                break;
            default:
                throw new IllegalArgumentException("Invalid pizza type"); //if any other type except from mentioned ones exception occurs
        }
        this.cheesePrice = 100.00;
        this.toppingsPrice =150.00;
        this.takeAwayPrice = 20.00;
    }

    private double calculateTotal() {
        double total = basePrice;
        if (extraCheese) {
            total += cheesePrice;
        }
        if (extraToppings) {
            total += toppingsPrice;
        }
        if (takeAway) {
            total += takeAwayPrice;
        }
        return total;
    }

    public String generateBill() {
        String bill = "----- Pizza Bill -----\n";
        bill += "Type: " + type + "\n";
        bill += "Base Price: Rs." + basePrice + "\n";
        if (extraCheese) {
            bill += "Extra Cheese: Rs." + cheesePrice + "\n";
        }
        if (extraToppings) {
            bill += "Extra Toppings: Rs." + toppingsPrice + "\n";
        }
        if (takeAway) {
            bill += "Take Away: Rs." + takeAwayPrice + "\n";
        }
        bill += "----------------------\n";
        bill += "Total: Rs." + calculateTotal() + "\n";
        bill += "----------------------\n";
        return bill;
    }
}

public class pizzaBillProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n************************ Welcome to Pizzamania ************************");
        System.out.println("**************** \"A slice of happiness in every bite\" *****************\n");
        System.out.println("==========================================================================\n");
        System.out.println("\t\tWelcome!\nPlease choose suitable option.\n");
        System.out.println("1) Menu.\n2) Exit.\n");
        System.out.print("Enter your choice: ");
        int menu = scanner.nextInt();
        scanner.nextLine();
        if (menu == 1) {
            System.out.println("\n\t\tWelcome to Menu!\n");
            System.out.println("Enter pizza type (vegPizza,vegDeluxe,nonVegPizza,nonVegDeluxe): ");
            String type = scanner.nextLine();

            System.out.println("Extra cheese? (true/false): ");
            boolean extraCheese = scanner.nextBoolean();

            System.out.println("Extra toppings? (true/false): ");
            boolean extraToppings = scanner.nextBoolean();

            System.out.println("Take away? (true/false): ");
            boolean takeAway = scanner.nextBoolean();

            Pizza pizza = new Pizza(type, extraCheese, extraToppings, takeAway); //constructor calling automatically
            System.out.println(pizza.generateBill());
        }
        else if (menu == 2) {
            System.out.println("\"Come back soon - we'd love to see you again!\"");
            System.out.println("************************************************");
        }
        scanner.close();
    }
}
