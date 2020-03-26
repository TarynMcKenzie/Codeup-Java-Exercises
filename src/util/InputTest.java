package util;

public class InputTest {

    // TODO: Create another class named util.InputTest that has a static main method that uses all of the methods from the Input class.
    public static void main(String[] args) {

        Input input = new Input(); //new instance of input from the Input class

        input.yesNo(); // Call the yesNo method for the class instance

        input.getInt(1,10); // call the get int method from the input instance

        input.getDouble(1,10); // cal the get double from the input instance

    }
}
