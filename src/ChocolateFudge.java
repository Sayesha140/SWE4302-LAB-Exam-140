public class ChocolateFudge extends Flavor{

    public ChocolateFudge(int noOfScoops,double basePrice){
        super(basePrice);
    }

    @Override
    public void setBasePrice(double basePrice) {
        super.setBasePrice(3.00);
    }

    @Override
    public double calculatePricePerFlavour() {
        return getBasePrice();
    }
}