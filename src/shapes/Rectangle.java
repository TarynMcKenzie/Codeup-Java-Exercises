package shapes;

public class Rectangle {

    // TODO: Inside of your shapes directory, create a class named Rectangle.
    //       It should have protected properties for both length and width.
    //       Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.

    // TODO: Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
            // perimeter = 2 x length + 2 x width
            // area = length x width


    //--------------INITIALIZE------------------
    private int length;
    private int width;


    //--------------MOVIE CONSTRUCTOR------------------
    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    //--------------GET (AREA)------------------
    public int getArea() {
        int area = length * width;
        System.out.println("Area: " + area);
        return area;
    }

    //--------------GET (PERIMETER)------------------
    public int getPerimeter() {
        int perimeter = (( 2 * length) + (2 * width));
        System.out.println("Perimeter: " + perimeter);
        return perimeter;
    }

}
