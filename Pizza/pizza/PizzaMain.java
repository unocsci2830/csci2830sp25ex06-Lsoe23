package pizza;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pizza.crust.PizzaCrust;
import pizza.crust.ThickCrust;
import pizza.crust.ThinCrust;
import pizza.pizza.AlfredSauce;
import pizza.pizza.PizzaSauce;
import pizza.pizza.TomatoSauce;
import pizza.topping.Bacon;
import pizza.topping.Bellpepper;
import pizza.topping.Chicken;
import pizza.topping.Chickpeas;
import pizza.topping.Ham;
import pizza.topping.Mushroom;
import pizza.topping.Pepperoni;
import pizza.topping.PizzaTopping;
import pizza.topping.Spinach;

public class PizzaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Select Pizza Crust
        System.out.println("What kind of crust would you like:");
        System.out.println("1 - Thin Crust");
        System.out.println("2 - Thick Crust");
        System.out.print("Options: ");
        int crustOption = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Choose crust ingredient:");
        System.out.println("1 - Flour");
        System.out.println("2 - Cauliflower");
        System.out.println("Options: ");

        String ingredient = "";
        int ingredientOption = scanner.nextInt();
        scanner.nextLine();

        if (ingredientOption == 1) {
            ingredient = "Flour";
        } else if (ingredientOption == 2) {
            ingredient = "Cauliflower";
        }

        PizzaCrust crust;
        if (crustOption == 1) {
            crust = new ThinCrust(ingredient);
        } else {
            System.out.println("Would you like deep dish?");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            System.out.print("Options");
            int deepDishOption = scanner.nextInt();
            scanner.nextLine();

            boolean isDeepDish = deepDishOption == 1;
            crust = new ThickCrust(ingredient, isDeepDish);
        }

        // Select Sauce
        System.out.println("What kind of sauce would you like:");
        System.out.println("1 - Tomato Sauce");
        System.out.println("2 - Alfredo Sauce");
        System.out.print("Your choice: ");
        int sauceOption = scanner.nextInt();
        scanner.nextLine();

        PizzaSauce sauce;
        if (sauceOption == 1) {
            sauce = new TomatoSauce();
        } else {
            sauce = new AlfredSauce();
        }

        // Select Toppings
        System.out.print("How many toppings? (Only 4!): ");
        int numToppings = scanner.nextInt();
        scanner.nextLine();

        List<PizzaTopping> chosenToppings = new ArrayList<>();

        System.out.println("Choose your toppings:");
        System.out.println("1 - Chicken");
        System.out.println("2 - Ham");
        System.out.println("3 - Bacon");
        System.out.println("4 - Pepperoni");
        System.out.println("5 - Mushroom");
        System.out.println("6 - Bell Pepper");
        System.out.println("7 - Spinach");
        System.out.println("8 - Chickpeas");

        for (int i = 0; i < numToppings && i < 4; i++) {
            System.out.print("Your choice (Pick toppings): ");
            int toppingChoice = scanner.nextInt();
            scanner.nextLine();

            PizzaTopping topping = null;

            switch (toppingChoice) {
                case 1 -> topping = new Chicken();
                case 2 -> topping = new Ham();
                case 3 -> topping = new Bacon();
                case 4 -> topping = new Pepperoni();
                case 5 -> topping = new Mushroom();
                case 6 -> topping = new Bellpepper();
                case 7 -> topping = new Spinach();
                case 8 -> topping = new Chickpeas();
                default -> System.out.println("Invalid Entry!");
            }

            if (topping != null) {
                chosenToppings.add(topping);
            }
        }

        //Pizza Object
        Pizza pizza = new Pizza(crust, sauce);
        for (PizzaTopping topping : chosenToppings) { 
            pizza.addTopping(topping);
        }
        
        //Final Order Descriptions
        /*System.out.println("\n--------------------------------------------------");
        System.out.println("Users order:");
        System.out.println("Crust: " + crust.toNiceString());
        //Warning so we don't get sued
        String alarm = crust.checkIntegrity();
        if (!alarm.isEmpty()) {
            System.out.println("Warning: " + alarm);
        }
        System.out.println("Sauce: " + sauce);
        System.out.println("Toppings: " + chosenToppings);
        System.out.println("---------------------------------------------------");
        System.out.println("Total Price: $" + pizza.getPrice());*/

        System.out.println("\n" + pizza);
        scanner.close();
    }
}
