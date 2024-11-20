import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {

    Map<Integer,Flavor>flavors;
    List<Topping>toppings;

    public Order(){

        flavors=new HashMap<>();
        this.toppings=new ArrayList<>();
    }

    public void addFlavors(Flavor flavor,int noOfScoops){
        flavors.put(noOfScoops,Flavor) ;
    }

    public void addToppings(Topping topping){
        toppings.add(topping);
    }

   /* public double calculateFlavorPrice(){
        double total=0;

        for(Flavor flavor:flavors){
            total+=flavor.calculatePricePerFlavour();
        }
        return total;
    }
*/
    public double calculateToppingTotal(){
        double total=0;

        for(Topping topping:toppings){
            total+=topping.calculateToppingPrice();
        }
        return total;
    }
}
