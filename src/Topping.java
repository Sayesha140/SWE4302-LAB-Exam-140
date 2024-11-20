import java.security.PublicKey;

public abstract class Topping {
      private double basePrice;

      public Topping(double basePrice){
          this.basePrice=basePrice;
      }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public abstract double calculateToppingPrice();
}
