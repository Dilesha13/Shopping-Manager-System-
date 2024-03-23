
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ShoppingCartPanel extends JPanel {             //Declaration of instance variables for the ShoppingCartPanel class
    private WestminsterShoppingManager shoppingManager;
    private DefaultTableModel tableModel;
    private JTable cartTable;
    private List<Product> cart;
    private Product selectedProduct;
    private boolean isFirstPurchase = true;
    private JLabel totalLabel;
    private JLabel firstPurchaseDiscountLabel;
    private JLabel threeItemsDiscountLabel;
    private JLabel finalTotalLabel;

    public ShoppingCartPanel(WestminsterShoppingManager shoppingManager) {          //Constructor for the ShoppingCartPanel class, taking a WestminsterShoppingManager as a parameter
        this.shoppingManager = shoppingManager;
        //Setting up the layout and components
        JLabel cartLabel = new JLabel("Shopping Cart");
        String[] columnNames = new String[]{"Product", "Quantity", "Price"};
        this.tableModel = new DefaultTableModel(columnNames, 0);
        this.cartTable = new JTable(this.tableModel);
        JScrollPane cartScrollPane = new JScrollPane(this.cartTable);
        this.totalLabel = new JLabel("Total  -");
        this.firstPurchaseDiscountLabel = new JLabel("First Purchase Discount (10%)  -");
        this.threeItemsDiscountLabel = new JLabel("Three items in the same Category Discount (20%)  -");
        this.finalTotalLabel = new JLabel("Final Total  -");
        this.setLayout(new BorderLayout());
        this.add(cartLabel, "North");
        this.add(cartScrollPane, "Center");
        //Creating and adding labels to the south panel
        JPanel southPanel = new JPanel(new GridLayout(4, 1));
        southPanel.add(this.totalLabel);
        southPanel.add(this.firstPurchaseDiscountLabel);
        southPanel.add(this.threeItemsDiscountLabel);
        southPanel.add(this.finalTotalLabel);
        this.add(southPanel, "South");
        //Setting the preferred size of the panel
        this.setPreferredSize(new Dimension(450, 450));
    }

    //Method to find the row of a product in the table model
    private int findProductRow(Product product) {
        for(int i = 0; i < this.tableModel.getRowCount(); ++i) {
            if (this.tableModel.getValueAt(i, 0).equals(product.getProductName())) {
                return i;
            }
        }

        return -1;
    }

    //Setter method for the selected product
    public void setSelectedProduct(Product product) {

        this.selectedProduct = product;
    }

    //Method to update the cart based on the selected product
    public void updateCart() {
        if (this.selectedProduct != null) {
            int row = this.findProductRow(this.selectedProduct);
            if (row != -1) {
                int quantity = (Integer)this.tableModel.getValueAt(row, 1) + 1;
                double totalPrice = (double)quantity * this.selectedProduct.getPrice();
                this.tableModel.setValueAt(quantity, row, 1);
                this.tableModel.setValueAt(totalPrice, row, 2);
                this.updateLabels();
            } else {
                Object[] rowData = new Object[]{this.selectedProduct.getProductName(), 1, this.selectedProduct.getPrice()};
                this.tableModel.addRow(rowData);
                this.updateLabels();
            }

            this.isFirstPurchase = false;
        }

    }

    //Method to update the labels showing total, discounts, and final total
    private void updateLabels() {
        double fullTotal = this.calculateFullTotal();
        double discountedTotal = this.calculateDiscountedTotal(fullTotal);
        //Setting text for each label
        this.totalLabel.setText("Total  - " + fullTotal);
        JLabel var10000 = this.firstPurchaseDiscountLabel;
        double var10001 = this.calculateFirstPurchaseDiscount(discountedTotal);
        var10000.setText("First Purchase Discount (10%)  - " + var10001);
        double threeItemsDiscount = this.calculateThreeItemsDiscount();
        this.threeItemsDiscountLabel.setText("Three items in the same Category Discount (20%)  - " + threeItemsDiscount);
        double finalTotal = discountedTotal - threeItemsDiscount;
        this.finalTotalLabel.setText("Final Total  - " + finalTotal);
    }

    //Method to calculate the discount for purchasing three items in the same category
    private double calculateThreeItemsDiscount() {
        Map<String, Integer> categoryCountMap = new HashMap();

        //Counting the occurrences of each category in the cart
        for(int i = 0; i < this.tableModel.getRowCount(); ++i) {
            String productName = (String)this.tableModel.getValueAt(i, 0);
            String category = this.getCategoryFromProductName(productName);
            categoryCountMap.put(category, (Integer)categoryCountMap.getOrDefault(category, 0) + 1);
        }

        double threeItemsDiscount = 0.0;
        Iterator var8 = categoryCountMap.keySet().iterator();

        while(var8.hasNext()) {
            String category = (String)var8.next();
            int itemCount = (Integer)categoryCountMap.get(category);
            if (itemCount >= 3) {
                threeItemsDiscount += this.calculateCategoryDiscount(category);
            }
        }

        return threeItemsDiscount;
    }

    //Counting the occurrences of each category in the cart
    private double calculateCategoryDiscount(String category) {
        double categoryDiscount = 0.0;

        for(int i = 0; i < this.tableModel.getRowCount(); ++i) {
            String productName = (String)this.tableModel.getValueAt(i, 0);
            if (this.getCategoryFromProductName(productName).equals(category)) {
                categoryDiscount += 0.2 * (Double)this.tableModel.getValueAt(i, 2);
            }
        }

        return categoryDiscount;
    }

    //Method to extract the category from a product name
    private String getCategoryFromProductName(String productName) {
        String[] parts = productName.split(" ");
        return parts.length > 0 ? parts[0] : "";
    }


    //Method to calculate the total price of items in the cart
    private double calculateFullTotal() {
        double fullTotal = 0.0;

        for(int i = 0; i < this.tableModel.getRowCount(); ++i) {
            double totalPrice = (Double)this.tableModel.getValueAt(i, 2);
            fullTotal += totalPrice;
        }

        return fullTotal;
    }

    //Method to calculate the discounted total based on the first purchase
    private double calculateDiscountedTotal(double fullTotal) {
        return this.isFirstPurchase ? fullTotal * 0.9 : fullTotal;
    }

    //Method to calculate the first purchase discount
    private double calculateFirstPurchaseDiscount(double discountedTotal) {
        return this.isFirstPurchase ? this.calculateFullTotal() * 0.1 : 0.0;
    }
}
