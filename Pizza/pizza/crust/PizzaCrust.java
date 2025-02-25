package pizza.crust;
import pizza.MenuItem;


public abstract class PizzaCrust implements MenuItem {
    //private String ingredient;
    protected String ingredient;  //"protected: cannot be access back packages outside but can be access within same class or subclasses
    private double price;

    public PizzaCrust(String ingredient, double price) {
        this.ingredient = ingredient;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public abstract String toString();
        //return "Pizza Crust";

    public String toNiceString() {
        return "Crust: " + toString() + "(" + ingredient + ")";
    }

    public String checkIntegrity() {
        return this.ingredient.equalsIgnoreCase("Cauliflower")? "Handle carefully: crust might fall apart": "";
    }
    
}