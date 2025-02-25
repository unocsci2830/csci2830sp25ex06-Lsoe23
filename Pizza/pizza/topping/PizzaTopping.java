package pizza.topping;
import pizza.MenuItem;


public abstract class PizzaTopping implements MenuItem {
    private double price;

    public PizzaTopping(double price) {
        this.price = price;
    }
    public abstract String toString(); {
        //return "Pizza Topping";
    }
    public String toNiceString() {
        return "Topping: " + toString();
    }

    @Override
    public double getPrice() {
        return price;
    }
}
