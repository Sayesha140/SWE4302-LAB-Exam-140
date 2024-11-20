public class Marshmallow extends Topping{

    public Marshmallow(double basePrice){
        super(basePrice);
    }

    @Override
    public void setBasePrice(double basePrice) {
        super.setBasePrice(0.70);
    }

    @Override
    public double calculateToppingPrice() {
        return getBasePrice();
    }
}