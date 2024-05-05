import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    GroceryItem(String name) {
        this(name,"Dairy",1);
    }
}

public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryItems = new GroceryItem[3];
        groceryItems[0] = new GroceryItem ("mile");
        groceryItems[1] = new GroceryItem ("gusta","darl",4);
        groceryItems[2] = new GroceryItem ("fring", "dxion", 1);


        ArrayList groceryItemsList = new ArrayList();
        groceryItemsList.add(new GroceryItem ("mile"));
        groceryItemsList.add("Milk");

        System.out.println(Arrays.toString(groceryItemsList.toArray()));
    }
}
