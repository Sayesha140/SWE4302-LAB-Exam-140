import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {

    List<Flavor>flavors;
    List<Topping>toppings;

    PricingPolicy pricingPolicy;

    double tax=0.08;

    public Order(){

        flavors=new ArrayList<>();
        this.toppings=new ArrayList<>();
    }

    public void addFlavors(Flavor flavor){
        flavors.add(flavor);
    }

    public void addToppings(Topping topping){
        toppings.add(topping);
    }

    public double calculateFlavorPrice(){
        double total=0;

        for(Flavor flavor:flavors){
            total+=flavor.calculatePricePerFlavour();
        }
        return total;
    }

    public double calculateToppingTotal(){
        double total=0;

        for(Topping topping:toppings){
            total+=topping.calculateToppingPrice();
        }
        return total;
    }

    public double calculateTotalPrice(){
        return calculateFlavorPrice()+calculateToppingTotal()+pricingPolicy.calculatePrice()+calculateTotalPrice()*tax;
    }
}
