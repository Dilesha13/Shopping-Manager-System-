
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class WestminsterShoppingManagerTest {
    private WestminsterShoppingManager shoppingManager;

    @BeforeEach
    public void setup() {
        shoppingManager = new WestminsterShoppingManager();
    }

    @Test
    public void testaddProduct(){
        //create a sample product
        Product sampleProduct = new Clothing("C1","Sample Clothing",10,19.99,"M","Blue");

        // Add the product to the shopping manager
        shoppingManager.addProduct(sampleProduct);

        // Check if the product is in the list
        List<Product> productList = shoppingManager.getAllProducts();
        assertTrue(productList.contains(sampleProduct));
    }

    @Test
    public void testRemoveProduct() {
        // Create a sample product
        Product sampleProduct = new Electronics("E1", "Sample Electronics", 5, 199.99, "Brand", "3 years");

        // Add the product to the shopping manager
        shoppingManager.addProduct(sampleProduct);

        // Remove the product from the shopping manager
        shoppingManager.removeProduct(sampleProduct);

        // Check if the product is removed from the list
        List<Product> productList = shoppingManager.getAllProducts();
        assertFalse(productList.contains(sampleProduct));
    }

    @Test
    public void testFindProductById() {
        // Create a sample product
        Product sampleProduct = new Clothing("C2", "Another Clothing", 8, 29.99, "L", "Red");

        // Add the product to the shopping manager
        shoppingManager.addProduct(sampleProduct);

        // Find the product by ID
        Product foundProduct = shoppingManager.findProductById("C2");

        // Check if the found product matches the added product
        assertEquals(sampleProduct, foundProduct);
    }

    @Test
    public void testAddProductFromConsole() {
        // Simulate user input for adding a product
        String input = "c\nC1\nSample Clothing\n10\n19.99\nM\nBlue\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Create a scanner using the simulated input
        Scanner scanner = new Scanner(System.in);

        // Call the method that reads from the console
        shoppingManager.addProductFromConsole(scanner);

        // Check if the product is added to the list
        List<Product> productList = shoppingManager.getAllProducts();
        assertTrue(productList.stream().anyMatch(p -> p.getProductId().equals("C1")));
    }

    // Add more test methods to cover other functionalities



}
