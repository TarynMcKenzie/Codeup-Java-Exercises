package shapes;


// TODO: Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements Measurable.
public abstract class Quadrilateral extends Shape implements Measurable {

    //TODO: This class should have:
    //      1. protected properties for length and width.
    //      2. a constructor that accepts two numbers for the length and width and sets those properties.
    //      3. methods for getting the length and width.
    //      4. abstract methods for setting the length and width.


    //--------------INITIALIZE------------------
    protected double length; // anyone can use length if they extend Quadrilateral
    protected double width; // anyone can use width if they extend Quadrilateral


    //--------------CONSTRUCTOR METHOD (QUADRILATERAL)------------------
    public Quadrilateral(double length, double width) {

        this.length = length;
        this.width = width;

    }


    //--------------GET AND SET (LENGTH)------------------
    public double getLength() {
        return length;
    }

    abstract void setLength(double length); // declaring setLength without implementation


    //--------------GET AND SET (WIDTH)------------------
    public double getWidth() {
        return width;
    }

    abstract void setWidth(double width); // declaring setWidth without implementation


}