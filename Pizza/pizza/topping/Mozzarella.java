package pizza.topping;
public class Mozzarella extends CheeseTopping {
    @Override
    public String toString() {
        return "Mozzarella Topping";
    }
    public Mozzarella() {
        super(1.00);
    }
}