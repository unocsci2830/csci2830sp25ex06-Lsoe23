package pizza.topping;
public class Cheddar extends CheeseTopping {
    @Override
    public String toString() {
        return "Cheddar Topping";
    }
    public Cheddar() {
        super(1.00);
    }
}