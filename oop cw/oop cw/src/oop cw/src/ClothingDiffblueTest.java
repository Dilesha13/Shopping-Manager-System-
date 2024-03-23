import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClothingDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Clothing#Clothing()}
     *   <li>{@link Clothing#setColor(String)}
     *   <li>{@link Clothing#setSize(String)}
     *   <li>{@link Clothing#getColor()}
     *   <li>{@link Clothing#getProductType()}
     *   <li>{@link Clothing#getSize()}
     * </ul>
     */
    @Test
    public void testGettersAndSetters() {
        // Arrange and Act
        Clothing actualClothing = new Clothing();
        actualClothing.setColor("Color");
        actualClothing.setSize("Size");
        String actualColor = actualClothing.getColor();
        String actualProductType = actualClothing.getProductType();

        // Assert that nothing has changed
        assertEquals("Clothing ", actualProductType);
        assertEquals("Color", actualColor);
        assertEquals("Size", actualClothing.getSize());
    }

    /**
     * Method under test:
     * {@link Clothing#Clothing(String, String, int, double, String, String)}
     */
    @Test
    public void testNewClothing() {
        // Arrange and Act
        Clothing actualClothing = new Clothing("42", "Product Name", 1000, 10.0d, "Size", "Color");

        // Assert
        assertEquals("42", actualClothing.getProductId());
        assertEquals("Color", actualClothing.getColor());
        assertEquals("Product Name", actualClothing.getProductName());
        assertEquals("Size", actualClothing.getSize());
        assertEquals(10.0d, actualClothing.getPrice(), 0.0);
        assertEquals(1000, actualClothing.getAvailableItems());
    }
}
