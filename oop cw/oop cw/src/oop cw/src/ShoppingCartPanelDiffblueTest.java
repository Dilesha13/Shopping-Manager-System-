import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;

import org.junit.Test;

public class ShoppingCartPanelDiffblueTest {
    /**
     * Method under test:
     * {@link ShoppingCartPanel#ShoppingCartPanel(WestminsterShoppingManager)}
     */
    @Test
    public void testNewShoppingCartPanel() {
        // Arrange and Act
        ShoppingCartPanel actualShoppingCartPanel = new ShoppingCartPanel(new WestminsterShoppingManager());

        // Assert
        assertEquals("PanelUI", actualShoppingCartPanel.getUIClassID());
        assertNull(actualShoppingCartPanel.getNextFocusableComponent());
        assertNull(actualShoppingCartPanel.getFocusCycleRootAncestor());
        assertNull(actualShoppingCartPanel.getParent());
        assertNull(actualShoppingCartPanel.getTopLevelAncestor());
        assertNull(actualShoppingCartPanel.getFocusTraversalPolicy());
        assertNull(actualShoppingCartPanel.getGraphics());
        assertNull(actualShoppingCartPanel.getGraphicsConfiguration());
        assertNull(actualShoppingCartPanel.getDropTarget());
        assertNull(actualShoppingCartPanel.getInputContext());
        assertNull(actualShoppingCartPanel.getInputMethodRequests());
        assertNull(actualShoppingCartPanel.getName());
        assertNull(actualShoppingCartPanel.getToolTipText());
        assertNull(actualShoppingCartPanel.getInputVerifier());
        assertNull(actualShoppingCartPanel.getComponentPopupMenu());
        assertNull(actualShoppingCartPanel.getRootPane());
        assertNull(actualShoppingCartPanel.getTransferHandler());
        assertNull(actualShoppingCartPanel.getBorder());
        assertEquals(0, actualShoppingCartPanel.getDebugGraphicsOptions());
        assertEquals(0, actualShoppingCartPanel.getHeight());
        assertEquals(0, actualShoppingCartPanel.getWidth());
        assertEquals(0, actualShoppingCartPanel.getX());
        assertEquals(0, actualShoppingCartPanel.getY());
        assertEquals(0, actualShoppingCartPanel.getComponentListeners().length);
        assertEquals(0, actualShoppingCartPanel.getFocusListeners().length);
        assertEquals(0, actualShoppingCartPanel.getHierarchyBoundsListeners().length);
        assertEquals(0, actualShoppingCartPanel.getHierarchyListeners().length);
        assertEquals(0, actualShoppingCartPanel.getInputMethodListeners().length);
        assertEquals(0, actualShoppingCartPanel.getKeyListeners().length);
        assertEquals(0, actualShoppingCartPanel.getMouseListeners().length);
        assertEquals(0, actualShoppingCartPanel.getMouseMotionListeners().length);
        assertEquals(0, actualShoppingCartPanel.getMouseWheelListeners().length);
        assertEquals(0, actualShoppingCartPanel.getPropertyChangeListeners().length);
        assertEquals(0, actualShoppingCartPanel.getContainerListeners().length);
        assertEquals(0, actualShoppingCartPanel.getAncestorListeners().length);
        assertEquals(0, actualShoppingCartPanel.getRegisteredKeyStrokes().length);
        assertEquals(0, actualShoppingCartPanel.getVetoableChangeListeners().length);
        assertEquals(0.5f, actualShoppingCartPanel.getAlignmentX(), 0.0f);
        assertEquals(0.5f, actualShoppingCartPanel.getAlignmentY(), 0.0f);
        assertEquals(3, actualShoppingCartPanel.getComponentCount());
        assertEquals(3, actualShoppingCartPanel.getComponents().length);
        assertEquals(Component.BaselineResizeBehavior.OTHER, actualShoppingCartPanel.getBaselineResizeBehavior());
        assertFalse(actualShoppingCartPanel.getIgnoreRepaint());
        assertFalse(actualShoppingCartPanel.hasFocus());
        assertFalse(actualShoppingCartPanel.isCursorSet());
        assertFalse(actualShoppingCartPanel.isDisplayable());
        assertFalse(actualShoppingCartPanel.isFocusOwner());
        assertFalse(actualShoppingCartPanel.isLightweight());
        assertFalse(actualShoppingCartPanel.isMaximumSizeSet());
        assertFalse(actualShoppingCartPanel.isMinimumSizeSet());
        assertFalse(actualShoppingCartPanel.isShowing());
        assertFalse(actualShoppingCartPanel.isValid());
        assertFalse(actualShoppingCartPanel.isFocusCycleRoot());
        assertFalse(actualShoppingCartPanel.isFocusTraversalPolicyProvider());
        assertFalse(actualShoppingCartPanel.isFocusTraversalPolicySet());
        assertFalse(actualShoppingCartPanel.getAutoscrolls());
        assertFalse(actualShoppingCartPanel.getInheritsPopupMenu());
        assertFalse(actualShoppingCartPanel.isManagingFocus());
        assertFalse(actualShoppingCartPanel.isPaintingForPrint());
        assertFalse(actualShoppingCartPanel.isPaintingTile());
        assertFalse(actualShoppingCartPanel.isValidateRoot());
        assertTrue(actualShoppingCartPanel.getFocusTraversalKeysEnabled());
        assertTrue(actualShoppingCartPanel.isBackgroundSet());
        assertTrue(actualShoppingCartPanel.isEnabled());
        assertTrue(actualShoppingCartPanel.isFocusable());
        assertTrue(actualShoppingCartPanel.isFontSet());
        assertTrue(actualShoppingCartPanel.isForegroundSet());
        assertTrue(actualShoppingCartPanel.isPreferredSizeSet());
        assertTrue(actualShoppingCartPanel.isVisible());
        assertTrue(actualShoppingCartPanel.getVerifyInputWhenFocusTarget());
        assertTrue(actualShoppingCartPanel.isDoubleBuffered());
        assertTrue(actualShoppingCartPanel.isOpaque());
        assertTrue(actualShoppingCartPanel.isOptimizedDrawingEnabled());
        assertTrue(actualShoppingCartPanel.isRequestFocusEnabled());
        Rectangle boundsResult = actualShoppingCartPanel.bounds();
        assertEquals(boundsResult, actualShoppingCartPanel.getBounds());
        assertEquals(boundsResult, actualShoppingCartPanel.getVisibleRect());
        Dimension expectedSize = actualShoppingCartPanel.size();
        assertEquals(expectedSize, actualShoppingCartPanel.getSize());
    }

    /**
     * Method under test: {@link ShoppingCartPanel#setSelectedProduct(Product)}
     */
    @Test
    public void testSetSelectedProduct() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ShoppingCartPanel.cart
        //     ShoppingCartPanel.cartTable
        //     ShoppingCartPanel.finalTotalLabel
        //     ShoppingCartPanel.firstPurchaseDiscountLabel
        //     ShoppingCartPanel.isFirstPurchase
        //     ShoppingCartPanel.selectedProduct
        //     ShoppingCartPanel.shoppingManager
        //     ShoppingCartPanel.tableModel
        //     ShoppingCartPanel.threeItemsDiscountLabel
        //     ShoppingCartPanel.totalLabel
        //     JComponent.DEBUG_GRAPHICS_LOADED
        //     JComponent.aaHint
        //     JComponent.actionMap
        //     JComponent.alignmentX
        //     JComponent.alignmentY
        //     JComponent.ancestorInputMap
        //     JComponent.autoscrolls
        //     JComponent.border
        //     JComponent.clientProperties
        //     JComponent.componentObtainingGraphicsFrom
        //     JComponent.componentObtainingGraphicsFromLock
        //     JComponent.flags
        //     JComponent.focusInputMap
        //     JComponent.inputVerifier
        //     JComponent.isAlignmentXSet
        //     JComponent.isAlignmentYSet
        //     JComponent.lcdRenderingHint
        //     JComponent.listenerList
        //     JComponent.managingFocusBackwardTraversalKeys
        //     JComponent.managingFocusForwardTraversalKeys
        //     JComponent.paintingChild
        //     JComponent.popupMenu
        //     JComponent.revalidateRunnableScheduled
        //     JComponent.tempRectangles
        //     JComponent.ui
        //     JComponent.verifyInputWhenFocusTarget
        //     JComponent.vetoableChangeSupport
        //     JComponent.windowInputMap
        //     Container.component
        //     Container.containerListener
        //     Container.containerSerializedDataVersion
        //     Container.descendUnconditionallyWhenValidating
        //     Container.descendantsCount
        //     Container.dispatcher
        //     Container.focusCycleRoot
        //     Container.focusTraversalPolicy
        //     Container.focusTraversalPolicyProvider
        //     Container.layoutMgr
        //     Container.listeningBoundsChildren
        //     Container.listeningChildren
        //     Container.modalAppContext
        //     Container.modalComp
        //     Container.numOfHWComponents
        //     Container.numOfLWComponents
        //     Container.preserveBackgroundColor
        //     Container.printing
        //     Container.printingThreads
        //     Component.acc
        //     Component.accessibleContext
        //     Component.appContext
        //     Component.autoFocusTransferOnDisposal
        //     Component.background
        //     Component.backgroundEraseDisabled
        //     Component.boundsOp
        //     Component.bufferStrategy
        //     Component.changeSupport
        //     Component.coalescingEnabled
        //     Component.componentListener
        //     Component.componentOrientation
        //     Component.componentSerializedDataVersion
        //     Component.compoundShape
        //     Component.cursor
        //     Component.dropTarget
        //     Component.enabled
        //     Component.eventCache
        //     Component.eventMask
        //     Component.focusListener
        //     Component.focusTraversalKeys
        //     Component.focusTraversalKeysEnabled
        //     Component.focusable
        //     Component.font
        //     Component.foreground
        //     Component.graphicsConfig
        //     Component.height
        //     Component.hierarchyBoundsListener
        //     Component.hierarchyListener
        //     Component.ignoreRepaint
        //     Component.incRate
        //     Component.inputMethodListener
        //     Component.isAddNotifyComplete
        //     Component.isFocusTraversableOverridden
        //     Component.isInc
        //     Component.isPacked
        //     Component.keyListener
        //     Component.locale
        //     Component.maxSize
        //     Component.maxSizeSet
        //     Component.minSize
        //     Component.minSizeSet
        //     Component.mixingCutoutRegion
        //     Component.mouseListener
        //     Component.mouseMotionListener
        //     Component.mouseWheelListener
        //     Component.name
        //     Component.nameExplicitlySet
        //     Component.newEventsOnly
        //     Component.objectLock
        //     Component.parent
        //     Component.peer
        //     Component.peerFont
        //     Component.popups
        //     Component.prefSize
        //     Component.prefSizeSet
        //     Component.requestFocusController
        //     Component.valid
        //     Component.visible
        //     Component.width
        //     Component.x
        //     Component.y

        // Arrange
        ShoppingCartPanel shoppingCartPanel = new ShoppingCartPanel(new WestminsterShoppingManager());

        // Act
        shoppingCartPanel.setSelectedProduct(new Clothing("42", "Product Name", 1000, 10.0d, "Size", "Color"));
    }

    /**
     * Method under test: {@link ShoppingCartPanel#updateCart()}
     */
    @Test
    public void testUpdateCart() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        (new ShoppingCartPanel(new WestminsterShoppingManager())).updateCart();
    }

    /**
     * Method under test: {@link ShoppingCartPanel#updateCart()}
     */
    @Test
    public void testUpdateCart2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        ShoppingCartPanel shoppingCartPanel = new ShoppingCartPanel(new WestminsterShoppingManager());
        shoppingCartPanel.setSelectedProduct(new Clothing("42", "Product Name", 1000, 10.0d, "Size", "Color"));

        // Act
        shoppingCartPanel.updateCart();
    }
}
