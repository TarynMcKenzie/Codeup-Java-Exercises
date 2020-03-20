import java.util.Scanner;

public class ConsoleExercises {

    public static void main (String[] args){

        // TODO: Copy this code into your main method:

        double pi = 3.14159;

        // TODO: Write some Java code that uses the variable pi to output the following: "The value of pi is approximately 3.14."
        // TODO: Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.

//        System.out.printf("The value of pi is approximately %.2f. %n", pi);


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

    }
}
