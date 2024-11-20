public abstract class Flavor {

    private int noOfScoops;
    private double basePrice;

    public Flavor(int noOfScoops,double basePrice){
        this.noOfScoops=noOfScoops;
        this.basePrice=basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getNoOfScoops() {
        return noOfScoops;
    }

    public abstract double calculatePricePerFlavour(int noOfScoops);
}
