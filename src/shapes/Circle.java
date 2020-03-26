package shapes;

import org.w3c.dom.ls.LSOutput;
import util.Input;

import java.util.Scanner;

public class Circle {

    // TODO: Inside of src, create a directory named shapes. Inside of shapes, create a class named Circle.
    //       This class should have a private radius property that is set through the constructor, and various methods for getting information about the circle, detailed below.
    //       For the value of pi, use the PI constant of the Math class.
            // The formulas for circumference and area:
                // circumference = 2 x pi x radius
                // area = pi x (radius ^ 2)

    private double radius; // private radius property

    public Circle(double radius){ // New circle constructor

        this.radius = radius; // get the radius?
    }

    public double getArea(){

        double area = Math.PI * (radius * radius); //calculate the area and store value in area

        System.out.println("Area: " + area); // print the area

        return area;
    }

    public double getCircumference(){

        double circumference = 2 * Math.PI * radius;

        System.out.println("Circumference: " + circumference);

        return circumference;
    }


}
