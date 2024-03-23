import java.io.Serializable;                                /*Import statement of the serializable interface.
                                                              It indicates that instance of this class can be serialized,
                                                              meaning they can be converted into a byte stream for
                                                              storage or transmission.*/

public class Electronics extends Product implements Serializable {      /*"Electronics" inherits the properties and
                                                                           behavior of "Product" and can be serialized.*/
    private String brand;
    private String warrantyPeriod;            //declaration of two private instance veriables

    public Electronics() {                    //default constructor for serialization without that save part not working correctly.
    }

    public Electronics(String productID, String productName, int availableItems, double price, String brand, String warrantyPeriod) {
                                                //parameterized constructor  for the Electronics class
        super(productID, productName, availableItems, price);   //calls the constructor of the superclass(Product)
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getProductType() {            //implementation of the "getProductType" method declared in the superclass

        return "Electronics ";
    }

    public String getBrand() {                  //getter method for retrieving the brand of the electronic product

        return this.brand;
    }

    public void setBrand(String brand) {        //setter method for setting the brand of the electronic product

        this.brand = brand;
    }

    public String getwarrantyPeriod() {         //getter method for retrieving the warranty period of the electronic product

        return this.warrantyPeriod;
    }

    public void setwarrantyPeriod(String warrantyPeriod) {  //setter method for setting the warranty period of the electronic product

        this.warrantyPeriod = warrantyPeriod;
    }
}
