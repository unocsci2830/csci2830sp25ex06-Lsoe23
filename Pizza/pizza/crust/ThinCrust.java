package pizza.crust;

public class ThinCrust extends PizzaCrust {

    public ThinCrust(String ingredient) {
        super(ingredient, 10.00);
        
    }
    @Override
    public String toString() {
        return "Thin Crust";
    }
}