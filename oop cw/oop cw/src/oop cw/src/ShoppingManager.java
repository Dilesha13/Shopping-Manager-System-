
import java.util.List;
import java.util.Scanner;

//Interface declaration for ShoppingManager
interface ShoppingManager {
    void addProduct(Product var1);                  //Method to add a product to the shopping manager

    void deleteProductFromConsole(Scanner var1);   //Method to delete a product using user input from the console

    void removeProduct(Product var1);              //Method to remove a product from the shopping manager

    void printProductList();                       //Method to print the list of products

    List<Product> getAllProducts();               //Method to get a list of all products

    void saveProductsToFile();                   //Method to save the products to a file

    Product findProductById(String var1);        //Method to find a product by its ID
}
