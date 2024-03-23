

import java.util.InputMismatchException;        //to handle input errors
import java.util.Scanner;                       //to take input from user

public class Main {                             //declaration of the "Main" class
    public Main() {
    }

    private static void openGui(WestminsterShoppingManager shoppingManager) {   /*definition of a private static method "openGui"
                                                                                  that takes a "WestminsterShoppingManager" parameter */
        new MyFrame(shoppingManager);           //opens a GUI using a "MyFrame" instance
    }

    public static void main(String[] args) {
        WestminsterShoppingManager shoppingManager = new WestminsterShoppingManager();  // create of an instance of "WestminsterShoppingManager"
        Scanner scanner = new Scanner(System.in);           //create of a "scanner" object to read input from the console

        int choice;                             //create integer variable to store the user's menu choice
        do {
            shoppingManager.displayMenu();      //call to the "displayMenu" method of "shoppingManager" to show the menu options to the user

            try {                               //start try block to handle potential exceptions
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();     //get input from user
                scanner.nextLine();
                switch (choice) {
                    case 0:
                        shoppingManager.saveProductsToFile();
                        System.out.println("Exiting...Have a good day!");
                        break;
                    case 1:
                        shoppingManager.addProductFromConsole(scanner);
                        break;
                    case 2:
                        shoppingManager.deleteProductFromConsole(scanner);
                        break;
                    case 3:
                        shoppingManager.printProductList();
                        break;
                    case 4:
                        shoppingManager.saveProductsToFile();
                        break;
                    case 5:
                        shoppingManager.loadProductsFromFile();
                        break;
                    case 6:
                        openGui(shoppingManager);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        System.out.println();
                }
            } catch (InputMismatchException var5) {     //catch block for handle "InputMismatchException"
                System.err.println("Invalid input. Please enter a valid integer.");     //prints an error message
                System.out.println();
                scanner.nextLine();
                choice = -1;                        // sets chice to -1 and prompts the user again
            }
        } while(choice != 0);                      //end of the do-while loop

        scanner.close();                          // close scanner class
    }
}
