package shapes;

public class Square extends Quadrilateral implements Measurable{

//    // TODO: Create a class named Square, also inside of shapes, that extends Rectangle.
//    //       Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
//
//
//    //--------------CONSTRUCTOR METHOD (SQUARE)------------------
//    public Square(int side) {
//
//        super(side, side); // call the parent constructor --> set the side to the parents length and width expected arguments
//
//    }
//
//
//    //--------------OVERRIDING EXERCISE------------------
//    // TODO: In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
//    // perimeter = 4 x side
//    // area = side ^ 2
//
////    @Override // Tell me if I am overriding
//    public int getArea(int side) {
//        int area = side ^ 2;
//        System.out.println("Area: " + area);
//        return area;
//    }
//
////    @Override // Tell me if I am overriding
//    public int getPerimeter(int side) {
//        int perimeter =  4 * side;
//        System.out.println("Perimeter: " + perimeter);
//        return perimeter;
//    }
//
//    // TODO: Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?


    //--------------EXERCISE CONTINUED (INTERFACES AND ABSTRACT CLASSES)------------------
    // TODO: Remove the code from the body of your Rectangle and Square classes.

    // TODO: Change your existing Square class to extend Quadrilateral.
    //       Because the length of all sides of a square are the same, the methods for setting the length and the width should set both protected properties.

    //--------------CONSTRUCTOR METHOD (SQUARE)------------------
    public Square(double side) {

        super(side, side);

    }


    //--------------SET (LENGTH)------------------
    @Override
    protected void setLength(double side) {  // Implementing (Overriding) setLength from Quadrilateral --> anyone can use length if they extend Square
        this.length = side;
    }

    //--------------SET (WIDTH)------------------
    @Override
    protected void setWidth(double side) {  // Implementing (Overriding) setWidth from Quadrilateral --> anyone can use width if they extend Square
        this.width = side;
    }


    //--------------GET (PERIMETER)------------------
    @Override
    public double getPerimeter() { // Implementing (Overriding) getPerimeter from Measurable
        double perimeter = 4 * side;
        System.out.println("Perimeter: " + perimeter);
        return perimeter;
    }

    //--------------GET (AREA)------------------
    @Override
    public double getArea() { // Implementing (Overriding) getArea from Measurable
        double area = side ^ 2;
        System.out.println("Area: " + area);
        return area;
    }

}
