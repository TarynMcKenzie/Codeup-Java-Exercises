

//__________________________________EXERCISE 1______________________________________

//  TODO: Inside your project, right click on the src directory and select 'New -> Java Class'.
//  TODO: Name this class HelloWorld.
//  TODO: Create a program that outputs "Hello, World!" to the console.

//        public class HelloWorld {
//            public static void main (String[] args){
//                System.out.print("Hello World!");
//            }
//        }

//  TODO: Run the application using the "Run" menubar item in IntelliJ (Note there are many ways to run a Java file). IntelliJ will first compile your HelloWorld.java file, then execute the compiled code.
        // command + option + r
//  TODO: Look at your project structure. You should notice a new directory named out. This is where IntelliJ puts the compiled Java files, to keep them separate from the source code.

//  TODO: Try renaming the main method. What happens when you try to run the program?
//
//      When main is changed the system runs an error the gives your the expected line syntax :
        //          "Error: Main method not found in class HelloWorld, please define the main method as:
        //          public static void main(String[] args)
        //          or a JavaFX application class must extend javafx.application.Application"

//  TODO: System.out.println is used to output information to the console with a newline. System.out.print can be used to output information without a newline. Refactor your code to use two System.out.print statements without changing the output.
        // println is a new line for each system print output
        // print put each system print output on the same line



// ________________BONUS_________________

//  TODO: Build the project from the command line:

//      TODO: Open a terminal and navigate to your project.

            // taryn.mckenzie@Taryns-MacBook-Pro codeup-java-exercises % ls -ltr
            // output:
                // -rw-r--r--  1 taryn.mckenzie  staff  423 Mar 19 10:00 codeup-java-exercises.iml
                //-rw-r--r--  1 taryn.mckenzie  staff   63 Mar 19 10:35 README.md
                //drwxr-xr-x  3 taryn.mckenzie  staff   96 Mar 19 10:39 out
                //drwxr-xr-x  3 taryn.mckenzie  staff   96 Mar 19 10:50 src

//      TODO: Change directories into the src directory. You should see your HelloWorld.java file here.

            // taryn.mckenzie@Taryns-MacBook-Pro codeup-java-exercises % cd src
            // output:
                //taryn.mckenzie@Taryns-MacBook-Pro src %

//      TODO: Run the following command to compile your Java file

            // taryn.mckenzie@Taryns-MacBook-Pro src % javac HelloWorld.java
            // output:

//      TODO: View the contents of the directory again. You should now see a file named HelloWorld.class (this is the compiled Java bytecode).

            //taryn.mckenzie@Taryns-MacBook-Pro src % ls -ltr
            // output:
                //-rw-r--r--  1 taryn.mckenzie  staff  2205 Mar 19 10:53 HelloWorld.java
                //-rw-r--r--  1 taryn.mckenzie  staff   424 Mar 19 10:54 HelloWorld.class


//      TODO: Run your program with the following command

            // taryn.mckenzie@Taryns-MacBook-Pro src % java HelloWorld
            // output:
                // Hello World!%



//__________________________________EXERCISE 2______________________________________

// TODO: You should complete all of the following inside of your main method from the previous exercise. After each step, compile and run your code.

//        TODO: Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

//                public class HelloWorld {
//                    public static void main (String[] args){
//                        int myFavoriteNumber = 21;
//                        System.out.print(myFavoriteNumber);
//                    }
//                }

//        TODO: Create a String variable named myString and assign a string value to it, then print the variable out to the console.

//                public class HelloWorld {
//                    public static void main (String[] args){
//                        String myString = "Hello"; // double quote is for a string of words
//                        System.out.print(myString);
//                    }
//                }

//        TODO: Change your code to assign a character value to myString. What do you notice?

//                public class HelloWorld {
//                    public static void main (String[] args){
//                        String myString = 'Hello'; //single quote is a character string
//                        System.out.print(myString);
//                    }
//                }

//        TODO: Change your code to assign the value 3.14159 to myString. What happens?

//                public class HelloWorld {
//                    public static void main (String[] args){
//                        String myString = "3.14159";
//                        System.out.print(myString);
//                    }
//                }

//        TODO: Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

//                public class HelloWorld {
//                    public static void main (String[] args){
//                        long myNumber;
//                        System.out.print(myNumber);
//                    }
//                }
//
                //Error:(114, 42) java: variable myNumber might not have been initialized

//        TODO: Change your code to assign the value 3.14 to myNumber. What do you notice?

//                public class HelloWorld {
//                    public static void main (String[] args){
//                        long myNumber = 3.14;
//                        System.out.print(myNumber);
//                    }
//                }

                //Error:(124, 41) java: incompatible types: double cannot be converted to java.lang.Long

//        TODO: Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

//                public class HelloWorld {
//                    public static void main (String[] args){
//                        long myNumber = 123L;
//                        System.out.print(myNumber);
//                    }
//                }

//        TODO: Change your code to assign the value 123 to myNumber.

//                public class HelloWorld {
//                    public static void main (String[] args){
//                        long myNumber = 123;
//                        System.out.print(myNumber);
//                    }
//                }

                //Error:(144, 41) java: incompatible types: int cannot be converted to java.lang.Long

//        TODO: Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

            // 3.14 needs to be a float because of the decimal?!?!

//        TODO: Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

//                public class HelloWorld {
//                    public static void main (String[] args){
//                        float myFloatNumber = 3.14f;
//                        System.out.print(myFloatNumber);
//                    }
//                }

//        TODO: Copy and paste the following code blocks one at a time and execute them

//                public class HelloWorld {
//                    public static void main (String[] args){
//
//                //  int x = 5;
//                //  System.out.println(x++);
//                //  System.out.println(x);
//
//                //  int x = 5;
//                //  System.out.println(++x);
//                //  System.out.println(x);
//
//                    }
//                }

//        TODO: What is the difference between the above code blocks? Explain why the code outputs what it does.

                // 1. The incrementation happens after the value of x is printed
                // 2. The incrementation happens before the value of x is printed

//        TODO: Try to create a variable named class. What happens?

//                public class HelloWorld {
//                    public static void main (String[] args){
//                        class operation{
//
//                        };
//                    }
//                }

                //Error: using a reserved keyword

//        TODO: Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//        TODO: Copy and paste the code above and then run it. Does the result match with your expectation?

//                public class HelloWorld {
//                    public static void main (String[] args){
//
//                        String theNumberThree = "three";
//                        Object o = theNumberThree;
//                        int three = (int) o; // runtime error
//
//                    }
//                }

                //Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//	at HelloWorld.main(HelloWorld.java:202)


//        TODO: How is the above example different from the code block below?

//                public class HelloWorld {
//                    public static void main (String[] args){
//
//                         int three = (int) "three"; //compiled time error
//
//                    }
//                }

//        TODO: What are the two different types of errors we are observing?

            //Runtime errors --> can only be seen when run
            //Compiled error --> can be seen when typing the code out

//        TODO: Rewrite the following expressions using the relevant shorthand assignment operators:

                //        int x = 4;
                //        x = x + 5;

                //        x += 5;

                //        int x = 3;
                //        int y = 4;
                //        y = y * x;

                //        y *= x

                //        int x = 10;
                //        int y = 2;
                //        x = x / y;
                //        y = y - x;

                //        x /= y
                //        y -= x


//        TODO: What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
                // Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

                // You run the risk of losing data because the cast is small than what you are trying to catch.



// ________________BONUS_________________

public class HelloWorld {
    public static double preformIndicatedOperation011(String operation, double op1, double op2) {

        double results; //Declare the results variable as a double

        if (operation.equals("ADD")) { // Adding operation
            results = op1 + op2;
        } else if (operation.equals("SUB")) { //Subtracting operation
            results = op1 - op2;
        } else if (operation.equals("MUL")) { //Multiplication operation
            results = op1 * op2;
        } else if (operation.equals("DIV")) { //Division operation
            results = op1 / op2;
        } else{ // If all else fails
            results= 0.0;
        }

        return results;
    }

    public static int getNearestIntegerToRealSum013 (double firstRealAddend, double secondRealAddend){

        int results = (int) firstRealAddend + (int) secondRealAddend; //cast the double types to integer types --> store them in the result variable

        return results;

        //OR

        //return int Math.rint(firstRealAddend + secondRealAddend);

    }


}