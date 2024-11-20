public class MintChocolateChip extends Flavor{

    public MintChocolateChip(double basePrice){
        super(basePrice);
    }

    @Override
    public void setBasePrice(double basePrice) {
        super.setBasePrice(2.80);
    }

    @Override
    public double calculatePricePerFlavour() {
        return getBasePrice();
    }
}
