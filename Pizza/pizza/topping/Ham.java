package pizza.topping;
public class Ham extends MeatTopping {
    @Override
    public String toString() {
        return "Ham Topping";
    }
    public Ham() {
        super(1.00);
    }
}