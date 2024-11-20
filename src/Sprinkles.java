public class Sprinkles extends Topping{

    public Sprinkles(double basePrice){
        super(basePrice);
    }

    @Override
    public void setBasePrice(double basePrice) {
        super.setBasePrice(0.30);
    }

    @Override
    public double calculateToppingPrice() {
        return getBasePrice();
    }
}
