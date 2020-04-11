package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    /* ***************************************
       Object Oriented Programming Exercise
     ****************************************/
    // TODO: Create a package inside of src named util.
    //       Inside of util, create a class named Input that has a private property named scanner.
    //       When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.


    /* ***************************************
      Exceptions and Error Handling Exercise
     ****************************************/
    // TODO: Your getInt and getDouble methods should make sure that the value returned from the method is actually an int or a double.
    //       You can do this by replacing the use of the Scanner nextInt() and nextDouble() methods with the existing getString() method you created in a previous exercise
    //       using the following methods to convert the returned String into the desired datatype:

    // Integer.valueOf(String s);
    // Double.valueOf(String s);

    // Note:  these methods will throw a NumberFormatException if the given input cannot be parsed as an int or double.
    //        Your methods on the Input class should handle these exceptions, you can use a try-catch for this.


    private static Scanner scanner;

    public Input() { // New input constructor

        scanner = new Scanner(System.in); // place the scanner input

    }

    // TODO: The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public boolean yesNo() {

        System.out.print("[Y/N]\n"); // Prompt user

        String scannerInput = scanner.nextLine(); // place the scanner input into a string variable


        if (scannerInput.toLowerCase().contains("y")) { // check the string input for a y
//            System.out.println("true");
            return true;
        } else { //check the string input for anything else, other than a y
//            System.out.println("false");
            System.out.println("\nGoodbye, and have a wonderful day!");
            return false;
        }

    }

    // TODO: The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
    public int getInt(int min, int max) {

        int value = 0; // Initialize the value
        String scannerInput; // A variable to store the user input

        System.out.println("Enter a number between 1 and 10: "); // Prompt the user
        scannerInput = scanner.nextLine(); // Get the users response to prompt into the scannerInput variable

        try { // If the input passes -->

            value = Integer.parseInt(scannerInput); //parse the input --> store in value variable

        } catch (Exception exception) { // If the input fails -->

            exception.printStackTrace(); // Display the errors (red text in console)
            System.out.println("This is not an integer");// Print if not an integer
            value = getInt(min, max); // Set the value to recursively call this method

        }

        if (value < min || value > max) { // If the min and max are within the bounds -->

            value = getInt(min,max); //parse the input --> store in value variable
        }

        return value;
    }


    // TODO: The getDouble method should do the same thing, but with decimal numbers.
    public double getDouble(double min, double max) {

        double value = 0; // Initialize the value
        String scannerInput; // A variable to store the user input

        System.out.println("Enter a number between 1 and 10: "); // Prompt the user
        scannerInput = scanner.nextLine(); // Get the users response to prompt into the scannerInput variable

        try { // If the input passes -->

                value = Integer.parseInt(scannerInput); //parse the input --> store in value variable

        } catch (Exception exception) { // If the input fails -->

            exception.printStackTrace(); // Display the errors (red text in console)
            System.out.println("This is not an integer");//Print if not an integer
            value = getDouble(min, max); // Set the value to recursively call this method

        }
        if (value <= min || value >= max) { // If the min and max are within the bounds -->

            value = getDouble(min,max); //parse the input --> store in value variable
        }

        return value;

    }


    public String getString() {

        String scannerInput = scanner.nextLine(); // place the scanner input into a string variable
        return scannerInput;

    }


}
