

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.*;
import java.util.Scanner;

public class WestminsterShoppingManager implements ShoppingManager {    //Declares the class `WestminsterShoppingManager` and implements the `ShoppingManager` interface
    private static final int MAX_PRODUCTS = 50;
    private ArrayList<Product> productList = new ArrayList();       //Defines a constant `MAX_PRODUCTS` and initializes an `ArrayList` to store products

    public ArrayList<Product> getProductList() {                    //Getter method to retrieve the `productList`
        return this.productList;
    }

    public WestminsterShoppingManager() {           //Constructor that initializes an instance of `WestminsterShoppingManager` and loads products from a file

        this.loadProductsFromFile();
    }

    public void displayMenu() {                     // Menu options for the shopping manager
        System.out.println("WELCOME TO WESTMINSTER SHOPPING MANAGER");
        System.out.println("   ******   Menu   ******   ");
        System.out.println("1. Add a new product");
        System.out.println("2. Delete a product");
        System.out.println("3. Print product list");
        System.out.println("4. Save to file");
        System.out.println("5. Load products from file");
        System.out.println("6. Open GUI");
        System.out.println("0. Exit");
        System.out.println();
    }

    void addProductFromConsole(Scanner scanner) {           // Method to add a product from console input
        boolean validProductType = false;

        do {
            try {
                System.out.print("Enter product type (E or e for Electronics / C or c for Clothing): ");
                String productType = scanner.next();
                if (!productType.equalsIgnoreCase("c") && !productType.equalsIgnoreCase("e")) {
                    System.out.println("Invalid input. Please enter 'E' for Electronics or 'C' for Clothing.");
                } else {
                    validProductType = true;

                    while(true) {
                        PrintStream var10000 = System.out;
                        String var10001 = productType.toUpperCase();
                        var10000.print("Enter the product id (e.g: " + var10001 + "1 to " + productType.toUpperCase() + "50 or " + productType.toLowerCase() + "1 to " + productType.toLowerCase() + "50): ");
                        String productID = scanner.next();
                        if (productID.matches("(?i)([ce][1-9]|[ce][1-4][0-9]|[ec]50)")) {
                            System.out.print("Enter the product name: ");
                            String name = scanner.next();

                            int availableItem;
                            while(true) {
                                try {
                                    System.out.print("Enter the available items: ");
                                    availableItem = scanner.nextInt();
                                    break;
                                } catch (InputMismatchException var14) {
                                    System.out.println("Invalid input. Please enter a valid integer for available items.");
                                    scanner.nextLine();
                                }
                            }

                            double price;
                            while(true) {
                                try {
                                    System.out.print("Enter price: ");
                                    price = scanner.nextDouble();
                                    break;
                                } catch (InputMismatchException var13) {
                                    System.out.println("Invalid input. Please enter a valid price.");
                                    scanner.nextLine();
                                }
                            }

                            String warrantyPeriod;
                            if (productType.equalsIgnoreCase("c")) {
                                String[] validSizes = new String[]{"xs", "s", "m", "l", "xl", "xxl"};

                                do {
                                    System.out.print("Enter valid size (xs, s, m, l, xl, xxl): ");
                                    warrantyPeriod = scanner.next().toLowerCase();
                                    if (Arrays.asList(validSizes).contains(warrantyPeriod)) {
                                        break;
                                    }

                                    System.out.println("Invalid input. Please enter a valid size.");
                                } while(!Arrays.asList(validSizes).contains(warrantyPeriod));

                                System.out.print("Enter color: ");
                                String color = scanner.next();
                                System.out.println();
                                Product product = new Clothing(productID, name, availableItem, price, warrantyPeriod, color);
                                this.addProduct(product);
                            } else if (productType.equalsIgnoreCase("e")) {
                                System.out.print("Enter the brand here: ");
                                String brand = scanner.next();
                                scanner = new Scanner(System.in);
                                warrantyPeriod = null;
                                boolean validInput = false;

                                while(!validInput) {
                                    System.out.print("Enter warranty period (e.g: '3 years' or '3 months'): ");
                                    warrantyPeriod = scanner.nextLine().trim();
                                    if (!warrantyPeriod.matches("\\d+\\s*(years?|months?)")) {
                                        System.out.println("Invalid input. Please enter a valid warranty period (e.g: '3 years' or '3 months').\n");
                                    } else {
                                        validInput = true;
                                    }
                                }

                                Product product = new Electronics(productID, name, availableItem, price, brand, warrantyPeriod);
                                this.addProduct(product);
                            }
                            break;
                        }

                        var10000 = System.out;
                        var10001 = productType.toUpperCase();
                        var10000.println("Invalid input. Please enter a valid product ID (e.g: " + var10001 + "1 to " + productType.toUpperCase() + "50 or " + productType.toLowerCase() + "1 to " + productType.toLowerCase() + "50).");
                    }
                }
            } catch (InputMismatchException var15) {
                System.out.println("Invalid input. Please enter the correct data type.");
                scanner.nextLine();
            }
        } while(!validProductType);

    }

    public void addProduct(Product product) {               // Method to add a product to the productList
        if (product != null) {
            if (this.productList.size() < 50) {
                this.productList.add(product);
                System.out.println("Product added successfully: " + product.getProductName());
                System.out.println();
            } else {
                System.out.println("Cannot add more products. Maximum limit reached.");
            }
        } else {
            System.out.println("Cannot add a null product.");
        }

    }

    public void deleteProductFromConsole(Scanner scanner) {         // Method to delete a product interactively from the console
        while(true) {
            try {
                System.out.print("Enter the product id to delete (e.g.,  E1 to E50 / e1 to e50 or C1 to C50 / c1 to c50): ");
                String productIdToDelete = scanner.next();
                System.out.println();
                Product productToDelete;
                if (productIdToDelete.matches("(?i)([ce][1-9]|[ce][1-4][0-9]|[ce]50)")) {
                    productToDelete = this.findProductById(productIdToDelete);
                    if (productToDelete != null) {
                        this.removeProduct(productToDelete);
                        System.out.println("Product deleted successfully.");
                        System.out.println();
                    } else {
                        System.out.println("Product not found: " + productIdToDelete);
                    }
                } else {
                    if (!productIdToDelete.matches("(?i)([ce]'5''0')")) {
                        System.out.println("Invalid input. Please enter a valid product ID (e.g.,  E1 to E50).");
                        continue;
                    }

                    productToDelete = this.findProductById(productIdToDelete);
                    if (productToDelete != null) {
                        this.removeProduct(productToDelete);
                        System.out.println("Product deleted successfully.");
                    } else {
                        System.out.println("Product not found: " + productIdToDelete);
                        System.out.println();
                    }
                }
            } catch (InputMismatchException var4) {
                System.out.println("Invalid input. Please enter the correct ID.");
                scanner.nextLine();
            }

            return;
        }
    }

    public void removeProduct(Product product) {                // Method to remove a product from the productList
        if (this.productList.remove(product)) {
            System.out.println("Product removed: " + product.getProductName());
            System.out.println("Total number of products left: " + this.productList.size());
        } else {
            System.out.println("Product not found: " + product.getProductName());
        }

    }

    public void printProductList() {                    // Method to print the product list
        System.out.println("Product List:");

        try {
            List<Product> productList = this.getAllProducts();
            productList.sort(Comparator.comparing(Product::getProductName));
            Iterator var2 = productList.iterator();

            while(var2.hasNext()) {
                Product product = (Product)var2.next();
                PrintStream var10000 = System.out;
                String var10001 = product.getProductType();
                var10000.print("Type: " + var10001 + " ID: " + product.getProductId() + ", Name: " + product.getProductName() + ", Available Items: " + product.getAvailableItems() + ", Price: " + product.getPrice());
                if (product instanceof Clothing clothing) {
                    var10000 = System.out;
                    var10001 = clothing.getSize();
                    var10000.println(", Size: " + var10001 + ", Color: " + clothing.getColor());
                    System.out.println();
                } else if (product instanceof Electronics electronics) {
                    var10000 = System.out;
                    var10001 = electronics.getBrand();
                    var10000.println(", Brand: " + var10001 + ", Warranty Period: " + electronics.getwarrantyPeriod() + " years");
                    System.out.println();
                } else {
                    System.out.println();
                }
            }
        } catch (Exception var6) {
            System.out.println("An error occurred while processing the product list: " + var6.getMessage());
            System.out.println();
        }

    }

    public List<Product> getAllProducts() {                 // Method to get a copy of all products

        return new ArrayList(this.productList);
    }

    public void saveProductsToFile() {                  // Method to save products to a file
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("products.txt"));

            try {
                ArrayList<Product> productsToSave = new ArrayList();
                Iterator var3 = this.productList.iterator();

                while(true) {
                    if (!var3.hasNext()) {
                        oos.writeObject(productsToSave);
                        System.out.println("Products saved to file successfully.");
                        System.out.println();
                        break;
                    }

                    Product product = (Product)var3.next();
                    if (product instanceof Clothing || product instanceof Electronics) {
                        productsToSave.add(product);
                    }
                }
            } catch (Throwable var6) {
                try {
                    oos.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }

                throw var6;
            }

            oos.close();
        } catch (IOException var7) {
            System.out.println("Error saving products to file: " + var7.getMessage());
        }

    }

    public void loadProductsFromFile() {                // Method to load products from a file
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("products.txt"));

            try {
                Object obj = ois.readObject();
                if (obj instanceof ArrayList<?>) {
                    ArrayList<?> loadedProducts = (ArrayList<?>) obj;
                    if (loadedProducts.size() > 0 && loadedProducts.get(0) instanceof Product) {
                        this.productList.clear();
                        this.productList.addAll((ArrayList<Product>) loadedProducts);
                        System.out.println("Products loaded from file.");
                        System.out.println();
                    }
                }
            } catch (Throwable var5) {
                try {
                    ois.close();
                } catch (Throwable var4) {
                    var5.addSuppressed(var4);
                }

                throw var5;
            }

            ois.close();
        } catch (ClassNotFoundException | IOException var6) {
            System.out.println("Error loading products from file: " + var6.getMessage());
        }

    }

    public Product findProductById(String productId) {                      // Method to find a product by its ID
        Iterator var2 = this.productList.iterator();

        Product product;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            product = (Product)var2.next();
        } while(!product.getProductId().equals(productId));

        return product;
    }
}
