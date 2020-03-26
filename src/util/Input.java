package util;

import java.util.Scanner;

public class Input {


    // TODO: Create a package inside of src named util.
    //       Inside of util, create a class named Input that has a private property named scanner.
    //       When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.

    private static Scanner scanner;

    public Input(){ // New input class
        scanner =  new Scanner(System.in); // new instance of the Scanner class
    }

    // TODO: The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public boolean yesNo(){

        System.out.println("Enter yes or no"); // Prompt user

        String scannerInput = scanner.nextLine(); // place the scanner input into a string variable


        if (scannerInput.toLowerCase().contains("y")){ // check the string input for a y
            System.out.println("true");
            return true;
        } else { //check the string input for anything else, other than a y
            System.out.println("false");
            return false;
        }

    }

    // TODO: The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
    public int getInt(int min, int max){

        int value = 0; // Initialize the value

        while(value < min || value > max){ //if value is less than the min param and the value is greater than the max param -->

            System.out.println("Enter a number between 1 and 10: ");

            int scannerInput = scanner.nextInt(); // place the scanner input into a int variable

            value = scannerInput; // replace the value with the user input.
        }

        return value;
    }

    // TODO: The getDouble method should do the same thing, but with decimal numbers.
    public double getDouble(double min, double max){

        double value = 0; // Initialize the value

        while(value < min || value > max){ //if value is less than the min param and the value is greater than the max param -->

            System.out.println("Enter a decimal number between 1 and 10: ");

            double scannerInput = scanner.nextDouble(); // place the scanner input into a int variable

            value = scannerInput; // replace the value with the user input.
        }

        return value;

    }


}
