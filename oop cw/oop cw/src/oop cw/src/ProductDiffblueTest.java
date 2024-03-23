import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class ProductDiffblueTest {
    /**
     * Method under test: {@link Product#getProductId()}
     */
    @Test
    public void testGetProductId() {
        // Arrange, Act and Assert
        assertEquals("42", (new Clothing("42", "Product Name", 1000, 10.0d, "Size", "Color")).getProductId());
    }

    /**
     * Method under test: {@link Product#setProductID(String)}
     */
    @Test
    public void testSetProductID() {
        // Arrange
        Clothing clothing = new Clothing("42", "Product Name", 1000, 10.0d, "Size", "Color");

        // Act
        clothing.setProductID("Product ID");

        // Assert
        assertEquals("Product ID", clothing.getProductId());
    }

    /**
     * Method under test: {@link Product#getProductName()}
     */
    @Test
    public void testGetProductName() {
        // Arrange, Act and Assert
        assertEquals("Product Name", (new Clothing("42", "Product Name", 1000, 10.0d, "Size", "Color")).getProductName());
    }

    /**
     * Method under test: {@link Product#setProductName(String)}
     */
    @Test
    public void testSetProductName() {
        // Arrange
        Clothing clothing = new Clothing("42", "Product Name", 1000, 10.0d, "Size", "Color");

        // Act
        clothing.setProductName("Product Name");

        // Assert
        assertEquals("Product Name", clothing.getProductName());
    }

    /**
     * Method under test: {@link Product#getAvailableItems()}
     */
    @Test
    public void testGetAvailableItems() {
        // Arrange, Act and Assert
        assertEquals(1000, (new Clothing("42", "Product Name", 1000, 10.0d, "Size", "Color")).getAvailableItems());
    }

    /**
     * Method under test: {@link Product#setAvailableItems(int)}
     */
    @Test
    public void testSetAvailableItems() {
        // Arrange
        Clothing clothing = new Clothing("42", "Product Name", 1000, 10.0d, "Size", "Color");

        // Act
        clothing.setAvailableItems(1000);

        // Assert
        assertEquals(1000, clothing.getAvailableItems());
    }

    /**
     * Method under test: {@link Product#getPrice()}
     */
    @Test
    public void testGetPrice() {
        // Arrange, Act and Assert
        assertEquals(10.0d, (new Clothing("42", "Product Name", 1000, 10.0d, "Size", "Color")).getPrice(), 0.0);
    }

    /**
     * Method under test: {@link Product#setPrice(double)}
     */
    @Test
    public void testSetPrice() {
        // Arrange
        Clothing clothing = new Clothing("42", "Product Name", 1000, 10.0d, "Size", "Color");

        // Act
        clothing.setPrice(10.0d);

        // Assert
        assertEquals(10.0d, clothing.getPrice(), 0.0);
    }

    /**
     * Method under test:
     * {@link Product#createProduct(String, String, String, int, double)}
     */
    @Test
    public void testCreateProduct() {
        // Arrange, Act and Assert
        assertThrows(IllegalArgumentException.class,
                () -> Product.createProduct("Type", "42", "Product Name", 1000, 10.0d));
        assertEquals("Brand",
                ((Electronics) Product.createProduct("electronics", "42", "Product Name", 1000, 10.0d)).getBrand());
    }

    /**
     * Method under test:
     * {@link Product#createProduct(String, String, String, int, double)}
     */
    @Test
    public void testCreateProduct2() {
        // Arrange and Act
        Product actualCreateProductResult = Product.createProduct("clothing", "42", "Product Name", 1000, 10.0d);

        // Assert
        assertEquals("42", actualCreateProductResult.getProductId());
        assertEquals("Blue", ((Clothing) actualCreateProductResult).getColor());
        assertEquals("Medium", ((Clothing) actualCreateProductResult).getSize());
        assertEquals("Product Name", actualCreateProductResult.getProductName());
        assertEquals(10.0d, actualCreateProductResult.getPrice(), 0.0);
        assertEquals(1000, actualCreateProductResult.getAvailableItems());
    }
}
