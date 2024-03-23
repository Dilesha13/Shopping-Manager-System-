import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

public class WestminsterShoppingManagerDiffblueTest {
    /**
     * Method under test: {@link WestminsterShoppingManager#getProductList()}
     */
    @Test
    public void testGetProductList() {
        // Arrange and Act
        ArrayList<Product> actualProductList = (new WestminsterShoppingManager()).getProductList();

        // Assert
        assertEquals(1, actualProductList.size());
        Product getResult = actualProductList.get(0);
        assertTrue(getResult instanceof Clothing);
        assertEquals("Clothing ", getResult.getProductType());
        assertEquals("c5", getResult.getProductId());
        assertEquals("m", ((Clothing) getResult).getSize());
        assertEquals("s", ((Clothing) getResult).getColor());
        assertEquals("shirt", getResult.getProductName());
        assertEquals(40, getResult.getAvailableItems());
        assertEquals(600.0d, getResult.getPrice(), 0.0);
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#displayMenu()}
     */
    @Test
    public void testDisplayMenu() {
        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();

        // Act
        westminsterShoppingManager.displayMenu();

        // Assert that nothing has changed
        List<Product> expectedProductList = westminsterShoppingManager.getAllProducts();
        assertEquals(expectedProductList, westminsterShoppingManager.getProductList());
    }

    /**
     * Method under test:
     * {@link WestminsterShoppingManager#addProductFromConsole(Scanner)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAddProductFromConsole() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException
        //       at java.base/java.util.Scanner.throwFor(Scanner.java:945)
        //       at java.base/java.util.Scanner.next(Scanner.java:1486)
        //       at WestminsterShoppingManager.addProductFromConsole(WestminsterShoppingManager.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();

        // Act
        westminsterShoppingManager.addProductFromConsole(new Scanner("foo"));
    }

    /**
     * Method under test:
     * {@link WestminsterShoppingManager#addProductFromConsole(Scanner)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAddProductFromConsole2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException
        //       at java.base/java.util.Scanner.throwFor(Scanner.java:945)
        //       at java.base/java.util.Scanner.next(Scanner.java:1486)
        //       at WestminsterShoppingManager.addProductFromConsole(WestminsterShoppingManager.java:58)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();

        // Act
        westminsterShoppingManager
                .addProductFromConsole(new Scanner("Enter product type (E or e for Electronics / C or c for Clothing): "));
    }

    /**
     * Method under test:
     * {@link WestminsterShoppingManager#addProductFromConsole(Scanner)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAddProductFromConsole3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException
        //       at java.base/java.util.Scanner.throwFor(Scanner.java:945)
        //       at java.base/java.util.Scanner.next(Scanner.java:1486)
        //       at WestminsterShoppingManager.addProductFromConsole(WestminsterShoppingManager.java:58)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();

        // Act
        westminsterShoppingManager.addProductFromConsole(new Scanner("c"));
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#addProduct(Product)}
     */
    @Test
    public void testAddProduct() {
        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();

        // Act
        westminsterShoppingManager.addProduct(new Clothing("42", "Product Name", 1000, 10.0d, "Size", "Color"));

        // Assert
        assertEquals(2, westminsterShoppingManager.getProductList().size());
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#addProduct(Product)}
     */
    @Test
    public void testAddProduct2() {
        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();

        // Act
        westminsterShoppingManager.addProduct(null);

        // Assert that nothing has changed
        List<Product> expectedProductList = westminsterShoppingManager.getAllProducts();
        assertEquals(expectedProductList, westminsterShoppingManager.getProductList());
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#addProduct(Product)}
     */
    @Test
    public void testAddProduct3() {
        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();

        // Act
        westminsterShoppingManager
                .addProduct(new Electronics("Product ID", "Product Name", 1000, 10.0d, "Brand", "Warranty Period"));

        // Assert
        assertEquals(2, westminsterShoppingManager.getProductList().size());
    }

    /**
     * Method under test:
     * {@link WestminsterShoppingManager#deleteProductFromConsole(Scanner)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDeleteProductFromConsole() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException
        //       at java.base/java.util.Scanner.throwFor(Scanner.java:945)
        //       at java.base/java.util.Scanner.next(Scanner.java:1486)
        //       at WestminsterShoppingManager.deleteProductFromConsole(WestminsterShoppingManager.java:161)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();

        // Act
        westminsterShoppingManager.deleteProductFromConsole(new Scanner("foo"));
    }

    /**
     * Method under test:
     * {@link WestminsterShoppingManager#deleteProductFromConsole(Scanner)}
     */
    @Test
    public void testDeleteProductFromConsole2() {
        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();

        // Act
        westminsterShoppingManager.deleteProductFromConsole(new Scanner("C9"));

        // Assert that nothing has changed
        List<Product> expectedProductList = westminsterShoppingManager.getAllProducts();
        assertEquals(expectedProductList, westminsterShoppingManager.getProductList());
    }

    /**
     * Method under test:
     * {@link WestminsterShoppingManager#deleteProductFromConsole(Scanner)}
     */
    @Test
    public void testDeleteProductFromConsole3() {
        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();

        // Act
        westminsterShoppingManager.deleteProductFromConsole(new Scanner("C'5''0'"));

        // Assert that nothing has changed
        List<Product> expectedProductList = westminsterShoppingManager.getAllProducts();
        assertEquals(expectedProductList, westminsterShoppingManager.getProductList());
    }

    /**
     * Method under test:
     * {@link WestminsterShoppingManager#deleteProductFromConsole(Scanner)}
     */
    @Test
    public void testDeleteProductFromConsole4() {
        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();

        // Act
        westminsterShoppingManager.deleteProductFromConsole(
                new Scanner("Enter the product id to delete (e.g.,  E1 to E50 / e1 to e50 or C1 to C50 / c1 to c50): "));

        // Assert that nothing has changed
        List<Product> expectedProductList = westminsterShoppingManager.getAllProducts();
        assertEquals(expectedProductList, westminsterShoppingManager.getProductList());
    }

    /**
     * Method under test:
     * {@link WestminsterShoppingManager#deleteProductFromConsole(Scanner)}
     */
    @Test
    public void testDeleteProductFromConsole5() {
        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();

        // Act
        westminsterShoppingManager.deleteProductFromConsole(new Scanner("c5"));

        // Assert
        assertTrue(westminsterShoppingManager.getProductList().isEmpty());
    }

    /**
     * Method under test:
     * {@link WestminsterShoppingManager#deleteProductFromConsole(Scanner)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDeleteProductFromConsole6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "str" is null
        //       at WestminsterShoppingManager.findProductById(WestminsterShoppingManager.java:325)
        //       at WestminsterShoppingManager.deleteProductFromConsole(WestminsterShoppingManager.java:165)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();
        westminsterShoppingManager.addProduct(new Clothing());

        // Act
        westminsterShoppingManager.deleteProductFromConsole(new Scanner("C9"));
    }

    /**
     * Method under test:
     * {@link WestminsterShoppingManager#deleteProductFromConsole(Scanner)}
     */
    @Test
    public void testDeleteProductFromConsole7() {
        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();
        westminsterShoppingManager
                .addProduct(new Electronics("Product ID", "Product Name", 1000, 10.0d, "Brand", "Warranty Period"));

        // Act
        westminsterShoppingManager.deleteProductFromConsole(new Scanner("C9"));

        // Assert that nothing has changed
        List<Product> expectedProductList = westminsterShoppingManager.getAllProducts();
        assertEquals(expectedProductList, westminsterShoppingManager.getProductList());
    }

    /**
     * Method under test:
     * {@link WestminsterShoppingManager#deleteProductFromConsole(Scanner)}
     */
    @Test
    public void testDeleteProductFromConsole8() {
        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();
        westminsterShoppingManager
                .addProduct(new Electronics("C9", "Product Name", 1000, 10.0d, "Brand", "Warranty Period"));

        // Act
        westminsterShoppingManager.deleteProductFromConsole(new Scanner("C9"));

        // Assert
        assertEquals(1, westminsterShoppingManager.getProductList().size());
    }

    /**
     * Method under test:
     * {@link WestminsterShoppingManager#deleteProductFromConsole(Scanner)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDeleteProductFromConsole9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "str" is null
        //       at WestminsterShoppingManager.findProductById(WestminsterShoppingManager.java:325)
        //       at WestminsterShoppingManager.deleteProductFromConsole(WestminsterShoppingManager.java:179)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();
        westminsterShoppingManager.addProduct(new Clothing());

        // Act
        westminsterShoppingManager.deleteProductFromConsole(new Scanner("C'5''0'"));
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#removeProduct(Product)}
     */
    @Test
    public void testRemoveProduct() {
        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();

        // Act
        westminsterShoppingManager.removeProduct(new Clothing("42", "Product Name", 1000, 10.0d, "Size", "Color"));

        // Assert
        assertEquals(1, westminsterShoppingManager.getProductList().size());
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#removeProduct(Product)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRemoveProduct2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Product.getProductName()" because "product" is null
        //       at WestminsterShoppingManager.removeProduct(WestminsterShoppingManager.java:202)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new WestminsterShoppingManager()).removeProduct(null);
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#removeProduct(Product)}
     */
    @Test
    public void testRemoveProduct3() {
        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();

        // Act
        westminsterShoppingManager
                .removeProduct(new Electronics("Product ID", "Product Name", 1000, 10.0d, "Brand", "Warranty Period"));

        // Assert
        assertEquals(1, westminsterShoppingManager.getProductList().size());
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#printProductList()}
     */
    @Test
    public void testPrintProductList() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        (new WestminsterShoppingManager()).printProductList();
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#printProductList()}
     */
    @Test
    public void testPrintProductList2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();
        westminsterShoppingManager
                .addProduct(new Clothing("42", "Product List:", 1000, 10.0d, "Product List:", "Product List:"));

        // Act
        westminsterShoppingManager.printProductList();
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#printProductList()}
     */
    @Test
    public void testPrintProductList3() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();
        westminsterShoppingManager.addProduct(new Clothing());

        // Act
        westminsterShoppingManager.printProductList();
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#printProductList()}
     */
    @Test
    public void testPrintProductList4() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();
        westminsterShoppingManager
                .addProduct(new Electronics("Product List:", "Product List:", 1000, 10.0d, "Product List:", "Product List:"));

        // Act
        westminsterShoppingManager.printProductList();
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#printProductList()}
     */
    @Test
    public void testPrintProductList5() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();
        westminsterShoppingManager
                .addProduct(new Clothing("42", "Product List:", 1000, 10.0d, "Product List:", "Product List:"));
        westminsterShoppingManager
                .addProduct(new Electronics("Product List:", "Product List:", 1000, 10.0d, "Product List:", "Product List:"));

        // Act
        westminsterShoppingManager.printProductList();
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#getAllProducts()}
     */
    @Test
    public void testGetAllProducts() {
        // Arrange, Act and Assert
        assertEquals(1, (new WestminsterShoppingManager()).getAllProducts().size());
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#saveProductsToFile()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSaveProductsToFile() {
        // TODO: Complete this test.
        //   Reason: R011 Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access files (file 'products.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new WestminsterShoppingManager()).saveProductsToFile();
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#loadProductsFromFile()}
     */
    @Test
    public void testLoadProductsFromFile() {
        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();

        // Act
        westminsterShoppingManager.loadProductsFromFile();

        // Assert
        assertEquals(1, westminsterShoppingManager.getProductList().size());
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#findProductById(String)}
     */
    @Test
    public void testFindProductById() {
        // Arrange, Act and Assert
        assertNull((new WestminsterShoppingManager()).findProductById("42"));
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#findProductById(String)}
     */
    @Test
    public void testFindProductById2() {
        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();
        Clothing product = new Clothing("42", "c5", 1000, 10.0d, "c5", "c5");

        westminsterShoppingManager.addProduct(product);

        // Act and Assert
        assertSame(product, westminsterShoppingManager.findProductById("42"));
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#findProductById(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFindProductById3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "str" is null
        //       at WestminsterShoppingManager.findProductById(WestminsterShoppingManager.java:325)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();
        westminsterShoppingManager.addProduct(new Clothing());

        // Act
        westminsterShoppingManager.findProductById("42");
    }

    /**
     * Method under test: {@link WestminsterShoppingManager#findProductById(String)}
     */
    @Test
    public void testFindProductById4() {
        // Arrange
        WestminsterShoppingManager westminsterShoppingManager = new WestminsterShoppingManager();
        westminsterShoppingManager.addProduct(new Electronics("c5", "c5", 1000, 10.0d, "c5", "c5"));

        // Act and Assert
        assertNull(westminsterShoppingManager.findProductById("42"));
    }

    /**
     * Method under test: default or parameterless constructor of
     * {@link WestminsterShoppingManager}
     */
    @Test
    public void testNewWestminsterShoppingManager() {
        // Arrange and Act
        WestminsterShoppingManager actualWestminsterShoppingManager = new WestminsterShoppingManager();

        // Assert
        ArrayList<Product> productList = actualWestminsterShoppingManager.getProductList();
        assertEquals(1, productList.size());
        assertEquals(actualWestminsterShoppingManager.getAllProducts(), productList);
    }
}
