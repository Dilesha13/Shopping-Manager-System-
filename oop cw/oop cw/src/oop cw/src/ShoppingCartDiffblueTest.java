import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ShoppingCartDiffblueTest {
    /**
     * Method under test: {@link ShoppingCart#getItems()}
     */
    @Test
    public void testGetItems() {
        // Arrange, Act and Assert
        assertTrue((new ShoppingCart()).getItems().isEmpty());
    }

    /**
     * Method under test: {@link ShoppingCart#calculateTotalPrice()}
     */
    @Test
    public void testCalculateTotalPrice() {
        // Arrange, Act and Assert
        assertEquals(0.0d, (new ShoppingCart()).calculateTotalPrice(), 0.0);
    }

    /**
     * Method under test: {@link ShoppingCart#addItem()}
     */
    @Test
    public void testAddItem() {
        // Arrange, Act and Assert
        assertNull((new ShoppingCart()).addItem());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link ShoppingCart}
     *   <li>{@link ShoppingCart#addProduct(Product)}
     *   <li>{@link ShoppingCart#getCartItems()}
     * </ul>
     */
    @Test
    public void testGettersAndSetters() {
        // Arrange and Act
        ShoppingCart actualShoppingCart = new ShoppingCart();
        actualShoppingCart.addProduct(new Clothing("42", "Product Name", 1000, 10.0d, "Size", "Color"));
        actualShoppingCart.getCartItems();

        // Assert that nothing has changed
        assertTrue(actualShoppingCart.getItems().isEmpty());
    }
}
