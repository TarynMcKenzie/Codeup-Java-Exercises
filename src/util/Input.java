package util;

import java.util.Scanner;

public class Input {


    // TODO: Create a package inside of src named util.
    //       Inside of util, create a class named Input that has a private property named scanner.
    //       When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.

    private Scanner scanner;

    private Scanner scanner() { // private property named scanner
        return scanner =  new Scanner(System.in); // new instance of the Scanner class
    }

    // TODO: The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    boolean yesNo(){
        String scannerInput = scanner.nextLine();
        if (scannerInput.equals('y')) return true;
    }

    // TODO: The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
    int getInt(int min, int max){

    }

    // TODO: The getDouble method should do the same thing, but with decimal numbers.
    double getDouble(double min, double max){
        return min + max;
    }

    // TODO: Create another class named InputTest that has a static main method that uses all of the methods from the Input class.
    public static class InputTest {

        public static void main(String[] args) {

            yesNo();
            getInt();
            getDouble();

        }

    }

}
