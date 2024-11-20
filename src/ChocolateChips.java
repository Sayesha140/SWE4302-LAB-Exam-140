public class ChocolateChips extends Topping{

    public ChocolateChips(double basePrice){
        super(basePrice);
    }

    @Override
    public void setBasePrice(double basePrice) {
        super.setBasePrice(0.50);
    }

    @Override
    public double calculateToppingPrice() {
        return getBasePrice();
    }
}