public class MintChocolateChip extends Flavor{

    public MintChocolateChip(int noOfScoops,double basePrice){
        super(noOfScoops,basePrice);
    }

    @Override
    public void setBasePrice(double basePrice) {
        super.setBasePrice(2.80);
    }

    @Override
    public double calculatePricePerFlavour(int noOfScoops) {
        return noOfScoops*getBasePrice();
    }
}
