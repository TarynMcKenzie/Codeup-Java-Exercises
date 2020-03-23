import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

    /* ***************************************
                   STRING BASICS
     ****************************************/

    // TODO: 2. Create a class named Bob with a main method for the following exercise.

        // Bob is a lackadaisical teenager. In conversation, his responses are very limited.
            // Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
            // He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
            // He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
            // He answers 'Whatever.' to anything else.


        // TODO: Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
        Scanner input = new Scanner(System.in); //setup scanner for collecting user input

        boolean bobContinue = true;

        while (bobContinue) {

            System.out.print("Ask Bob a question: "); //prompt the user

            String userInput = input.nextLine(); // get the user input --> store it in the variable userInput


            if (userInput.endsWith("?")) { //if the last character of userInput is equal to a ? -->

                System.out.println("Sure.\n");

            } else if (userInput.endsWith("!")) { // if the last character of the userInput is equal to ! -->

                System.out.println("Whoa, chill out!\n");

            } else if (userInput.isBlank()) { //if the userInput is empty -->

                System.out.println("Fine. Be that way!\n");

            } else { // If none of the above are true -->

                System.out.println("Whatever.\n");

            }


        }

        //once finished
        input.close();


    }
}
