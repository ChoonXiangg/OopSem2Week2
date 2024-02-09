package ie.atu;
import java.util.ArrayList;
public class OnlineOrderingSystem{
    public static void main(String[] args){
        ArrayList<MenuItem> menuItems=new ArrayList<MenuItem>();
        menuItems.add(new Burger("Classic Burger",8.99,"Beef Patty, lettuce, tomato, cheese"));
        menuItems.add(new Pizza ("Margherita Pizza",12.99,"Tomato sauce, mozzarella, basil"));
        menuItems.add(new Salad ("Caesar Salad",6.99,"Romaine Lettuce, croutons, Caesar dressing"));
        for(MenuItem menuItem:menuItems){
            System.out.println("Name: "+menuItem.getName());
            System.out.println("Price: $"+menuItem.getPrice());
            System.out.println("Description: "+menuItem.getDescription()+"\n");
        }
        double totalCost=0;
        for(MenuItem menuItem:menuItems){
            totalCost+=menuItem.getPrice();
        }
        System.out.println("Total Cost: $"+totalCost);
    }
}