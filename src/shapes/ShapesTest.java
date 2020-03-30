package shapes;

public class ShapesTest {

    // TODO: Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method,
    public static void main(String[] args) {

        //--------------TEST RECTANGLE------------------
        // TODO: create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle(5, 4);

        // TODO:  verify that the getPerimeter and getArea methods return 18 and 20, respectively.
        box1.getPerimeter();
        box1.getArea();



        //--------------TEST SQUARE------------------
        // TODO: create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
        Rectangle box2 = new Square(5);

        // TODO: verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        box2.getPerimeter();
        box2.getArea();
    }
}
