import java.util.Scanner;

public class ConsoleExercises {

    public static void main (String[] args){

        // TODO: Copy this code into your main method:

        double pi = 3.14159;

        // TODO: Write some Java code that uses the variable pi to output the following: "The value of pi is approximately 3.14."
        // TODO: Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.

//        System.out.printf("The value of pi is approximately %.2f. %n", pi);

          //OR

//        System.out.format("The value of pi is approximately %.2f. %n", pi); // Same output with a different method, formats strings

        // TODO: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        Scanner input = new Scanner(System.in);

//        System.out.println("Please enter an integer");
//
//        int userInterger = input.nextInt();
//
//        System.out.printf("The user entered, %s%n",userInterger);

        // What happens if you input something that is not an integer?
            // A runtime error will occur

        // TODO: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

//        System.out.println("Please enter three words");
//
//        String word1 = input.next();
//        String word2 = input.next();
//        String word3 = input.next();
//
//        System.out.printf("%s%n%s%n%s", word1, word2, word3 );

        // What happens if you enter less than 3 words?
            // The system waits for all three words to be inputed before running the next line

        // What happens if you enter more than 3 words?
            //Only the first three words are use for the next line

        // TODO: Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

//        System.out.println("Please enter a sentence");
//
//        String userSentenceNext = input.next();
//
//        System.out.println(userSentenceNext);

        // Do you capture all of the words?
            //  No, Just the first word is captured

        // TODO: Rewrite the above example using the nextLine method.

//        System.out.println("Please enter a sentence");
//
//        String userSentenceNextLine = input.nextLine();
//
//        System.out.println(userSentenceNextLine);

        // TODO: Calculate the perimeter and area of Codeup's classrooms.

            // TODO: Prompt the user to enter values of length and width of a classroom at Codeup.

                System.out.println("Please enter the length and width of the Codeup classroom");

            // TODO: Use the nextLine method to get user input and [parse](https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt(java.lang.String) the resulting string to a numeric type.

                String classroomLengthWidth = input.nextLine();

                int lengthWidth = Integer.parseInt(classroomLengthWidth);

                //Assume that the rooms are perfect rectangles.
                //Assume that the user will enter valid numeric data for length and width.

            // TODO: Display the area and perimeter of that classroom.
                //The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

                System.out.println(lengthWidth * 2); //Area
                System.out.println((lengthWidth * 2) * 2 ); //Perimeter


        // TODO: Bonuses

            // TODO: Accept decimal entries.

                double length = Integer.parseInt(input.next());
                double width = Integer.parseInt(input.next());

            // TODO: Calculate the volume of the rooms in addition to the area and perimeter.


            // The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method.

            // TODO: Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):

            // scanner.useDelimiter("\n");

            // How does this change the way your program operates?

            // TODO: Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.

    }
}
