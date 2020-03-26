package shapes;

import util.Input;

public class CircleApp {

    // TODO: Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using your Input class,
    //       creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)

    public static void main(String[] args) {


        System.out.println("What is your radius?"); //prompt the user for their radius

        Input input = new Input(); //new instance of input from the Input class

        double userRadius = input.getDouble(1,10); //place the input value into a double variable

        Circle circle1 = new Circle(userRadius); // create new instance of circle with the users input as radius

        circle1.getArea(); // Take the input value and get its area

        circle1.getCircumference(); // Take the input value and get its circumference

    }

    // ---------- BONUS ------------

    // TODO: After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make another.
    //       Continue creating circles and displaying information about them until the user says they do not want to continue.

    // TODO: Before exiting, the program should output the total number of circles created. Use a private static property,
    //       along with a public static method to keep track of and display the total number of circles created.
}
