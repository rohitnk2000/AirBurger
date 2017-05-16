package src;
import java.util.*;
import java.util.Collections;
public class Order
{
public Order()
{
}


public void generateOrder()
{
    ArrayList<Ingredients> order = new ArrayList<Ingredients>();
   


    order.add(meat);
 
    Collections.shuffle(order); // or use conventional shuffling method w/recursion
    Object nextIngredient = order.remove();
    
}
}
