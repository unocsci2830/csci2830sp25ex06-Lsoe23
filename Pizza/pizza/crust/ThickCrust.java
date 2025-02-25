package pizza.crust;

public class ThickCrust extends PizzaCrust {

    private boolean isDeepDish;

    public ThickCrust(String ingredient, boolean isDeepDish) {
        super(ingredient, isDeepDish ? 12.00 : 10.00);  //super allows us to access members of its superclass
        this.isDeepDish = isDeepDish;
    }

    @Override
    public String toString() {
        if (isDeepDish) {
            return "Deep Dish Thick Crust";
        } else {
            return "Regular Thick Crust";
        }
    }
}