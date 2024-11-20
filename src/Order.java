import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Flavor>flavors;
    List<Topping>toppings;

    public Order(List<Flavor>flavors,List<Topping>toppings){
        this.flavors=new ArrayList<>();
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
}
