
//  TODO: Inside your project, right click on the src directory and select 'New -> Java Class'.
//  TODO: Name this class HelloWorld.
//  TODO: Create a program that outputs "Hello, World!" to the console.

        public class HelloWorld {
            public static void main (String[] args){
                System.out.print("Hello World!");
            }
        }

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
