import java.io.Serializable;                                /*Import statement of the serializable interface.
                                                              It indicates that instance of this class can be serialized,
                                                              meaning they can be converted into a byte stream for
                                                              storage or transmission.*/

abstract class Product implements Serializable {            /*implements the "serializable" interface,suggesting that
                                                              instance of this class can be serialized.*/
    private String productID;
    private String productName;
    private int availableItems;
    private double price;                                     //declaration of four private instance variables

    public Product() {                                        //default constructor for serialization without that save part not working correctly.
    }

    protected Product(String productID, String productName, int availableItems, double price) { //parameterized constructor
        this.productID = productID;
        this.productName = productName;
        this.availableItems = availableItems;
        this.price = price;
    }

    public String getProductId() {                              //getter method for retrieving the productID

        return this.productID;
    }

    public void setProductID(String productID) {                //setter method for setting the product ID

        this.productID = productID;
    }

    public String getProductName() {                            //getter method for retrieving the product name

        return this.productName;
    }

    public void setProductName(String productName) {            //setter method for setting the product name

        this.productName = productName;
    }

    public int getAvailableItems() {                            //getter method for retrieving the number of available items

        return this.availableItems;
    }

    public void setAvailableItems(int availableItems) {         //setter method for setting the number of available items

        this.availableItems = availableItems;
    }

    public double getPrice() {                                  //getter method for retrieving the price of the product

        return this.price;
    }

    public void setPrice(double price) {                        //setter method for setting the price of the product

        this.price = price;
    }

    public abstract String getProductType();                    //returns a string indicating the type of the product

    public static Product createProduct(String type, String productId, String productName, int availableItems, double price) {
        //declares a static method named 'createProduct' that returns an instance of the 'Product' class
        switch (type.toLowerCase()) {                           //a switch statement based on the lowercase version of the type parameter
            case "clothing":
                return new Clothing(productId, productName, availableItems, price, "Medium", "Blue");
            //type is equal to 'clothing', it creates a new instance of the 'Clothing'
            case "electronics":
                return new Electronics(productId, productName, availableItems, price, "Brand", "1");
                //type is equal to 'electronics', it creates a new instance of the 'Electronics'
            default:
                throw new IllegalArgumentException("Invalid product type: " + type);
                //if the 'type' does not match 'clothing' or 'electronics',it throws an 'IllegalArgumentException' with a message
        }
    }
}
