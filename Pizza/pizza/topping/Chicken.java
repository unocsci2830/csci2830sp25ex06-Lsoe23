package pizza.topping;
public class Chicken extends MeatTopping {
    @Override
    public String toString() {
        return "Chicken Topping";
    }
    public Chicken() {
        super(1.00);
    }
}