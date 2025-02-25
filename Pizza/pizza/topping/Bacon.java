package pizza.topping;
public class Bacon extends MeatTopping {
    @Override
    public String toString() {
        return "Bacon Topping";
    }
    public Bacon() {
        super(1.00);
    }
}