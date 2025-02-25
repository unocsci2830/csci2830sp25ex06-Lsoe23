package pizza.topping;
public class VeggieTopping extends PizzaTopping {
    private double price;
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Veggie Topping";
    }
    public VeggieTopping(double price) {
        super(price);
    }
}