package pizza;
import java.util.ArrayList;
import java.util.List;

import pizza.crust.PizzaCrust;
import pizza.pizza.PizzaSauce;
import pizza.topping.PizzaTopping;

public class Pizza implements MenuItem {
    private List<MenuItem> menuItems;

    public Pizza(PizzaCrust crust, PizzaSauce sauce) {
        menuItems = new ArrayList<>();
        menuItems.add(crust);
        menuItems.add(sauce);
    }

    public void addTopping(PizzaTopping topping) {
        if (menuItems.size() < 6) {
            menuItems.add(topping);
        } else {
            System.out.println("Only 4 toppings allowed!");
        }
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (MenuItem item : menuItems) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
    StringBuilder m = new StringBuilder("Your Pizza:\n");
    double totalPrice = 0.0;

    for (MenuItem item : menuItems) {
        double ingredPrice = item.getPrice();
        m.append("- ").append(item.toString()).append(": $")
         .append(String.format("%.2f", ingredPrice)).append("\n");
        totalPrice += ingredPrice;
    }

    m.append("Total Price: $").append(String.format("%.2f", totalPrice));
    return m.toString();
}

}
