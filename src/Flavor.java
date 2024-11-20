public abstract class Flavor {


    private double basePrice;

    public Flavor(double basePrice){

        this.basePrice=basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }


    public abstract double calculatePricePerFlavour();
}
