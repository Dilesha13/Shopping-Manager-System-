
import java.io.Serializable;                                /*Import statement of the serializable interface.
                                                              It indicates that instance of this class can be serialized,
                                                              meaning they can be converted into a byte stream for
                                                              storage or transmission.*/

class Clothing extends Product implements Serializable {    /*that "clothing" inherits the properties and behavior of
                                                              "Product" and can be serialized.*/
    private String size;
    private String color;                                   // declare two private instance variables

    public Clothing() {                                     //default constructor for serialization without that save part not working correctly
    }

    public Clothing(String productId, String productName, int availableItems, double price, String size, String color) {
                                                            //parameterized constructor  for the clothing class
        super(productId, productName, availableItems, price);       //call the constructor of the superclass('Product')
        this.size = size;
        this.color = color;
    }

    public String getProductType() {                         //implementation of the getProductType method declared in th superclass(Product)

        return "Clothing ";
    }

    public String getSize() {                               //getter method for retrieving the size of the clothing

        return this.size;
    }

    public void setSize(String size) {                      //setter method for setting the size of the clothing

        this.size = size;
    }

    public String getColor() {                              //getter method for retrieving the color of the clothing

        return this.color;
    }

    public void setColor(String color) {                    //setter method for setting the color of the clothing

        this.color = color;
    }
}
