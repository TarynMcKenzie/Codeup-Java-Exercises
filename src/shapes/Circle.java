package shapes;

import org.w3c.dom.ls.LSOutput;

public class Circle {

    // TODO: Inside of src, create a directory named shapes. Inside of shapes, create a class named Circle.
    //       This class should have a private radius property that is set through the constructor, and various methods for getting information about the circle, detailed below.

    public Circle(double radius);
    public double getArea();
    public double getCircumference();

    public static class CircleApp{

        // TODO: Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using your Input class,
        //       creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)
        //       For the value of pi, use the PI constant of the Math class.
        //       The formulas for circumference and area:
                    // circumference = 2 x pi x radius
                    // area = pi x (radius ^ 2)


        // ---------- BONUS ------------

        // TODO: After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make another.
        //       Continue creating circles and displaying information about them until the user says they do not want to continue.

        // TODO: Before exiting, the program should output the total number of circles created. Use a private static property,
        //       along with a public static method to keep track of and display the total number of circles created.
     }
}
