
import java.io.Serializable;                                /*Import statement of the serializable interface.
                                                              It indicates that instance of this class can be serialized,
                                                              meaning they can be converted into a byte stream for
                                                              storage or transmission.*/
import java.util.ArrayList;                                 //allow to create resizable arrays
import java.util.Collection;                                //provide a way to work with groups of objects
import java.util.HashMap;                                   //provide constant-time performance for basic operations under normal circumstances
import java.util.Iterator;                                  //allow to sequentially access elements without exposing the underlying implementation
import java.util.*;
import java.util.Map;

public class ShoppingCart implements Serializable {         //declaration of the 'ShoppingCart' class, which implements the 'Serializable' interface
    private ArrayList<Product> items = new ArrayList();     //declaration of a private ArrayList named 'items' to store products in the shopping cart.
    private Map<String, Integer> categoryCounts = new HashMap();    //Declaration of a private HashMap named 'categoryCounts' to keep track of the count of products in each category
    private boolean firstPurchase = true;                   //Declaration of a private boolean variable 'firstPurchase' to track whether it's the customer's first purchase

    public ShoppingCart() {                                 //default constructor for serialization without that save part not working correctly
    }

    public ArrayList<Product> getItems() {                  //Getter method for the 'items' ArrayList. It returns a copy of the ArrayList to ensure encapsulation

        return new ArrayList(this.items);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;

        Product item;
        for(Iterator var3 = this.items.iterator(); var3.hasNext(); totalPrice += item.getPrice()) {
            item = (Product)var3.next();                    //Iterating through the 'items' ArrayList and calculating the total price of the products
        }

        totalPrice -= this.calculateCategoryDiscount();     //Subtracting the category discount from the total price
        totalPrice -= this.calculateFirstPurchaseDiscount();//Subtracting the first purchase discount from the total price
        return Math.max(totalPrice, 0.0);                   //Returning the maximum of the calculated total price and 0.0 to ensure a non-negative value
    }

    private double calculateCategoryDiscount() {
        double categoryDiscount = 0.0;
        Iterator var3 = this.categoryCounts.entrySet().iterator();

        while(var3.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry)var3.next();
            int itemCount = (Integer)entry.getValue();      //Iterating through the entries in 'categoryCounts' HashMap
            if (itemCount >= 3) {
                categoryDiscount += (double)itemCount * 0.2 * this.items.stream().filter((product) -> {
                    return product.getProductType().equalsIgnoreCase((String)entry.getKey());
                }).mapToDouble(Product::getPrice).sum();
            }
            //If the count of items in a category is 3 or more, apply a discount of 20% to the total price of items in that category
        }

        return categoryDiscount;
        //Returning the calculated category discount
    }

    private double calculateFirstPurchaseDiscount() {
        if (this.firstPurchase) {
            this.firstPurchase = false;
            return 0.1 * this.items.stream().mapToDouble(Product::getPrice).sum();
        } else {
            return 0.0;
        }
        //If it's the customer's first purchase, apply a discount of 10% to the total price of items,otherwise return 0.0 for no discount
    }

    public void addProduct(Product product) {               //Placeholder method for adding a product to the shopping cart. The implementation is currently empty
    }

    public ArrayList<Product> getCartItems() {              //Placeholder method for getting the items in the shopping cart. The implementation currently returns null

        return null;
    }

    public Collection<Object> addItem() {                   //Placeholder method for adding an item to the shopping cart. The implementation currently returns null

        return null;
    }
}
