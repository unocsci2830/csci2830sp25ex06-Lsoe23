package pizza.pizza;
import pizza.MenuItem;


public abstract class PizzaSauce implements MenuItem {
    private double price;

    public PizzaSauce(double price) {
        this.price = price;
    }
    
    @Override
    public double getPrice() {
        return price;
    }

    public abstract String toString(); {
        //return "Pizza Sauce";
    }
    
    public String toNiceString() {
        return "Sauce: " + toString();
    }

    
}