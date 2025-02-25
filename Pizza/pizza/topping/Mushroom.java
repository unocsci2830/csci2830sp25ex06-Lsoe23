package pizza.topping;
public class Mushroom extends VeggieTopping {
    @Override
    public String toString() {
        return "Mushroom Topping";
    }
    
    public Mushroom() {
        super(1.00);
    }
}