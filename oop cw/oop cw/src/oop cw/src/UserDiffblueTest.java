import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class
UserDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link User#User(String, String)}
     *   <li>{@link User#setPassword(String)}
     *   <li>{@link User#setUsername(String)}
     *   <li>{@link User#getPassword()}
     *   <li>{@link User#getUsername()}
     * </ul>
     */
    @Test
    public void testGettersAndSetters() {
        // Arrange and Act
        User actualUser = new User("janedoe", "iloveyou");
        actualUser.setPassword("iloveyou");
        actualUser.setUsername("janedoe");
        String actualPassword = actualUser.getPassword();

        // Assert that nothing has changed
        assertEquals("iloveyou", actualPassword);
        assertEquals("janedoe", actualUser.getUsername());
    }
}
