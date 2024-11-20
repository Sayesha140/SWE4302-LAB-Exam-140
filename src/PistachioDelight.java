public class PistachioDelight extends Flavor{

    public PistachioDelight(int noOfScoops,double basePrice){
        super(noOfScoops,basePrice);
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