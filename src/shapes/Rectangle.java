package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    // TODO: Inside of your shapes directory, create a class named Rectangle.
    //       It should have protected properties for both length and width.
    //       Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.

    // TODO: Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
    // perimeter = 2 x length + 2 x width
    // area = length x width


//    //--------------INITIALIZE------------------
//    private int length;
//    private int width;
//
//
//    //--------------RECTANGLE CONSTRUCTOR------------------
//    public Rectangle(int length,int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    //--------------GET (AREA)------------------
//    public int getArea() {
//        int area = length * width;
//        System.out.println("Area: " + area);
//        return area;
//    }
//
//    //--------------GET (PERIMETER)------------------
//    public int getPerimeter() {
//        int perimeter = (( 2 * length) + (2 * width));
//        System.out.println("Perimeter: " + perimeter);
//        return perimeter;
//    }


    //--------------EXERCISE CONTINUED (INTERFACES AND ABSTRACT CLASSES)------------------
    // TODO: Remove the code from the body of your Rectangle and Square classes.

    // TODO: Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
    //       IntelliJ can automatically create the skeleton of all the methods that need to be implemented.


    //--------------CONSTRUCTOR METHOD (RECTANGLE)------------------
    public Rectangle(double length, double width) {

        super(length, width);

    }


    //--------------SET (LENGTH)------------------
    @Override
    public void setLength(double length) { // Implementing (Overriding) setLength from Quadrilateral
        this.length = length;
    }

    //--------------SET (WIDTH)------------------
    @Override
    public void setWidth(double width) { // Implementing (Overriding) setWidth from Quadrilateral
        this.width = width;
    }


    //--------------GET (PERIMETER)------------------
    @Override
    public double getPerimeter() { // Implementing (Overriding) getPerimeter from Measurable
        double perimeter = ((2 * length) + (2 * width));
        System.out.println("Perimeter: " + perimeter);
        return perimeter;
    }


    //--------------GET (AREA)------------------
    @Override
    public double getArea() { // Implementing (Overriding) getArea from Measurable
        double area = length * width;
        System.out.println("Area: " + area);
        return area;
    }


}
