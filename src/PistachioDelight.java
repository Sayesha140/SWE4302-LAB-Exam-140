public class PistachioDelight extends Flavor{

    public PistachioDelight(double basePrice){
        super(basePrice);
    }

    @Override
    public void setBasePrice(double basePrice) {
        super.setBasePrice(3.25);
    }

    @Override
    public double calculatePricePerFlavour() {
        return getBasePrice();
    }
}