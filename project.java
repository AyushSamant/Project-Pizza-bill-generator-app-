
import java.util.Scanner;
public class project {

    public static void main(String args[]) {
        System.out.println("************************ Welcome to Pizzamania ************************");
        System.out.println("**************** \"A slice of happiness in every bite\" *****************\n");
        System.out.println("==========================================================================\n");
        System.out.println("\t\tWelcome!\nPlease choose suitable option.\n");
        System.out.println("1) Menu.\n2) Exit.\n");
        Scanner sc = new Scanner(System.in);
        String pizzaCat="Null";
        int pizzaPrice=0;
        int price = 0;
        int isExtCheese=0;
        int isExtTooping=0;
        int isTakeAway=0;
        System.out.print("Enter your choice: ");
        int menu = sc.nextInt();
        if (menu == 1) {
            System.out.println("\n\t\tWelcome to Menu!\nPlease select your category.");
            System.out.println("1) Veg.\n2) Non-Veg");
        } else if (menu == 2) {
            System.out.println("\"Come back soon - we'd love to see you again!\"");
            System.out.println("************************************************");
        } else {
            System.out.println("Invalid!");
        }
        System.out.print("Enter your choice: ");
        int category = sc.nextInt();

        int vegcat;
        if (category == 1) {
            System.out.println("\n\t\tWelcome to the Veg-category.\nPlease select your Pizza.\n");
            System.out.println("1) Veg Pizza.\n2) Delux Veg Pizza");
            System.out.print("Enter your choice: ");
            vegcat = sc.nextInt();
            if (vegcat == 1) {
                price = price + 300;
                pizzaCat="Veg pizza";
                pizzaPrice=300;
                System.out.println("\nDo you want extra topping?\n1) Yes\n2) No");
                System.out.print("Enter your choice: ");
                int topping = sc.nextInt();
                if (topping == 1) {
                    price = price + 150;
                    isExtTooping=150;
                } else if (topping == 2) {
                    price = price + 0;
                } else {
                    System.out.println("Invalid!");
                }
                System.out.println("\nDo you want extra Cheese?\n1) Yes\n2) No");
                System.out.print("Enter your choice: ");
                int extCheese = sc.nextInt();
                if (extCheese == 1) {
                    price = price + 100;
                    isExtCheese=100;
                } else if (extCheese == 2) {
                    price = price + 0;
                } else {
                    System.out.println("Invalid!");
                }
                System.out.println("\nDo you want to take-away?\n1) Yes\n2) No");
                System.out.print("Enter your choice: ");
                int takeAway = sc.nextInt();
                if (takeAway == 1) {
                    price = price + 20;
                    isTakeAway=20;
                } else if (takeAway == 2) {
                    price = price + 0;
                } else {
                    System.out.println("Invalid!");
                }
            } else if (vegcat == 2) {
                price = price + 550;
                pizzaCat="Delux Veg pizza";
                pizzaPrice=550;
                System.out.println("\nDo you want to take-away?\n1) Yes\n2) No");
                System.out.print("Enter your choice: ");
                int takeAway2 = sc.nextInt();
                if (takeAway2 == 1) {
                    price = price + 20;
                    isTakeAway=20;
                } else if (takeAway2 == 2) {
                    price = price + 0;
                } else {
                    System.out.println("Invalid!");
                }
            }
        } else if (category == 2) {
            System.out.println("\n\t\tWelcome to the Non-Veg category.\nPlease select your Pizza.\n");
            System.out.println("1) Non-Veg Pizza.\n2) Delux Non-Veg Pizza");
            int nonVeg;
            System.out.print("Enter your choice: ");
            nonVeg = sc.nextInt();
            if (nonVeg == 1) {
                price = price + 300;
                pizzaCat="Non-veg pizzza";
                pizzaPrice=300;
                System.out.println("\nDo you want extra topping?\n1) Yes\n2) No");
                System.out.print("Enter your choice: ");
                int topping2 = sc.nextInt();
                if (topping2 == 1) {
                    price = price + 150;
                    isExtTooping=150;
                } else if (topping2 == 2) {
                    price = price + 0;
                } else {
                    System.out.println("Invalid!");
                }
                System.out.println("\nDo you want extra Cheese?\n1) Yes\n2) No");
                System.out.print("Enter your choice: ");
                int extCheese2 = sc.nextInt();
                if (extCheese2 == 1) {
                    price = price + 100;
                    isExtCheese=100;
                } else if (extCheese2 == 2) {
                    price = price + 0;
                } else {
                    System.out.println("Invalid!");
                }
                System.out.println("\nDo you want to take-away?\n1) Yes\n2) No");
                System.out.print("Enter your choice: ");
                int takeAway3 = sc.nextInt();
                if (takeAway3 == 1) {
                    price = price + 20;
                    isTakeAway=20;
                } else if (takeAway3 == 2) {
                    price = price + 0;
                } else {
                    System.out.println("Invalid!");
                }
            }else if (nonVeg == 2) {
                price = price + 550;
                pizzaCat="Delux Non-veg pizza";
                pizzaPrice=550;
                System.out.println("\nDo you want to take-away?\n1) Yes\n2) No");
                System.out.print("Enter your choice: ");
                int takeAway4 = sc.nextInt();
                if (takeAway4 == 1) {
                    price = price + 20;
                    isTakeAway=20;
                } else if (takeAway4 == 2) {
                    price = price + 0;
                } else {
                    System.out.println("Invalid!");
                }
            }

        }

        System.out.println("\n\t\tBill:\n");
        System.out.println(pizzaCat+" : "+pizzaPrice);
        if(isExtTooping==150){
            System.out.println("Extra Toppings : 150");
        }
        if(isExtCheese==100){
            System.out.println("Extra cheese : 100");
        }
        if(isTakeAway==20){
            System.out.println("Take away : 20");
        }
        System.out.println("Your Total amount is: "+price);
        System.out.println("Thanks for visiting!");
    }
}

