public class FreshStrawberries extends Topping{

    public FreshStrawberries(double basePrice){
        super(basePrice);
    }

    @Override
    public void setBasePrice(double basePrice) {
        super.setBasePrice(1.00);
    }

    @Override
    public double calculateToppingPrice() {
        return getBasePrice();
    }
}