package pizza.topping;
public class CheeseTopping extends PizzaTopping {
    private double price;
    @Override
    public double getPrice() {
        return price;
    }
    public CheeseTopping(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Cheese Topping";
    }
    
}