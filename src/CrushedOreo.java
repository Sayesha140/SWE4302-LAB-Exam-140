public class CrushedOreo extends Topping{

    public CrushedOreo(double basePrice){
        super(basePrice);
    }

    @Override
    public void setBasePrice(double basePrice) {
        super.setBasePrice(0.85);
    }

    @Override
    public double calculateToppingPrice() {
        return getBasePrice();
    }
}
