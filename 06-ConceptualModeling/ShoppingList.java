import java.util.ArrayList;
import java.util.Scanner;

/*
 * 15.	Create a class diagram for a shopping list. You can use, 
 * for example, an ArrayList as the data structure for storing products. 
 * Then, based on the class diagram, define a class. Finally, 
 * create an object representing a shopping list and perform the following actions:
    a.	Display the list of products (should be empty)
    b.	Display information about the number of products to be purchased
    c.	Add three products to your shopping list
    d.	Display the list of products
    e.	Display information about the number of products to be purchased
    f.	Add one product to your shopping list
    g.	Display the list of products
    h.	Display information about the number of products to be purchased
 *  16.	Add to the list of products the ability to enter product names from the keyboard. 
 *  Then, run the program, create a shopping list and display a list of products to buy.
 */

public class ShoppingList {
    
    ArrayList<String> shoppingList = new ArrayList<String>();

    public int display() {
        return shoppingList.size();
    }

    public void addItem() {
        try (Scanner keyboard = new Scanner(System.in)) {
            String myString = keyboard.nextLine();
            shoppingList.add(myString);
        }
    }

    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        System.out.println(shoppingList.shoppingList);
        System.out.println(shoppingList.display());
        shoppingList.shoppingList.add("Mleko");
        shoppingList.shoppingList.add("Masło");
        shoppingList.shoppingList.add("Ścierki");
        System.out.println(shoppingList.shoppingList);
        System.out.println(shoppingList.display());
        shoppingList.shoppingList.add("Wycieraczki");
        System.out.println(shoppingList.shoppingList);
        System.out.println(shoppingList.display());
        shoppingList.addItem();
        System.out.println(shoppingList.shoppingList);
    }
}
