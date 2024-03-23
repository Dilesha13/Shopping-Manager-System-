import java.awt.event.ActionEvent;

import org.junit.Ignore;
import org.junit.Test;

public class MyFrameDiffblueTest {
    /**
     * Method under test: {@link MyFrame#actionPerformed(ActionEvent)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testActionPerformed() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.awt.HeadlessException
        //       at java.desktop/java.awt.GraphicsEnvironment.checkHeadless(GraphicsEnvironment.java:166)
        //       at java.desktop/java.awt.Window.<init>(Window.java:553)
        //       at java.desktop/java.awt.Frame.<init>(Frame.java:428)
        //       at java.desktop/java.awt.Frame.<init>(Frame.java:393)
        //       at java.desktop/javax.swing.JFrame.<init>(JFrame.java:180)
        //       at MyFrame.<init>(MyFrame.java:126)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MyFrame myFrame = new MyFrame(new WestminsterShoppingManager());

        // Act
        myFrame.actionPerformed(new ActionEvent("42", 1, "foo"));
    }

    /**
     * Method under test: {@link MyFrame#MyFrame(WestminsterShoppingManager)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testNewMyFrame() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.awt.HeadlessException
        //       at java.desktop/java.awt.GraphicsEnvironment.checkHeadless(GraphicsEnvironment.java:166)
        //       at java.desktop/java.awt.Window.<init>(Window.java:553)
        //       at java.desktop/java.awt.Frame.<init>(Frame.java:428)
        //       at java.desktop/java.awt.Frame.<init>(Frame.java:393)
        //       at java.desktop/javax.swing.JFrame.<init>(JFrame.java:180)
        //       at MyFrame.<init>(MyFrame.java:126)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        new MyFrame(new WestminsterShoppingManager());
    }
}
