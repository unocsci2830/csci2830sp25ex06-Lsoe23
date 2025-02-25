package pizza.topping;
public class MeatTopping extends PizzaTopping {
    private double price;
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Meat Topping";
    }
    public MeatTopping(double price) {
        super(price);
    }
}