package pizza.topping;
public class Pepperoni extends MeatTopping {

    public Pepperoni() {
        super(1.50);
    }
    
    @Override
    public String toString() {
        return "Pepperoni Topping";
    }
}