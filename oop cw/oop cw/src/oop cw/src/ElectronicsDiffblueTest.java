import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ElectronicsDiffblueTest {
    /**
     * Method under test: {@link Electronics#getwarrantyPeriod()}
     */
    @Test
    public void testGetwarrantyPeriod() {
        // Arrange, Act and Assert
        assertEquals("Warranty Period",
                (new Electronics("Product ID", "Product Name", 1000, 10.0d, "Brand", "Warranty Period")).getwarrantyPeriod());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Electronics#Electronics()}
     *   <li>{@link Electronics#setBrand(String)}
     *   <li>{@link Electronics#setwarrantyPeriod(String)}
     *   <li>{@link Electronics#getBrand()}
     *   <li>{@link Electronics#getProductType()}
     * </ul>
     */
    @Test
    public void testGettersAndSetters() {
        // Arrange and Act
        Electronics actualElectronics = new Electronics();
        actualElectronics.setBrand("Brand");
        actualElectronics.setwarrantyPeriod("Warranty Period");
        String actualBrand = actualElectronics.getBrand();

        // Assert that nothing has changed
        assertEquals("Brand", actualBrand);
        assertEquals("Electronics ", actualElectronics.getProductType());
    }

    /**
     * Method under test:
     * {@link Electronics#Electronics(String, String, int, double, String, String)}
     */
    @Test
    public void testNewElectronics() {
        // Arrange, Act and Assert
        assertEquals("Brand",
                (new Electronics("Product ID", "Product Name", 1000, 10.0d, "Brand", "Warranty Period")).getBrand());
    }
}
