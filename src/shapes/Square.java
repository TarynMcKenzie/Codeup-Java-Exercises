package shapes;

public class Square extends Rectangle {

    // TODO: Create a class named Square, also inside of shapes, that extends Rectangle.
    //       Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.

    public Square(int side) {

        super(side, side); // call the parent constructor --> set the side to the parents length and width expected arguments

    }



    // TODO: In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
        // perimeter = 4 x side
        // area = side ^ 2

    // TODO: Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?
}
