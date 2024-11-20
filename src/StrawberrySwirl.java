public class StrawberrySwirl extends Flavor{

    public StrawberrySwirl(int noOfScoops,double basePrice){
        super(noOfScoops,basePrice);
    }

    @Override
    public void setBasePrice(double basePrice) {
        super.setBasePrice(2.75);
    }

    @Override
    public double calculatePricePerFlavour() {
        return getBasePrice();
    }
}