public class MethodsExercises {

    public static void main(String[] args) {

        /* ***************************************
                   BASIC ARITHMETIC
        ****************************************/

        // TODO: Create four separate methods. Each will perform an arithmetic operation:

            // Addition
            // Subtraction
            // Multiplication
            // Division

            // TODO: Each function needs to take two parameters/arguments so that the operation can be performed.

            // TODO: Test your methods and verify the output.

            // TODO: Add a modulus method that finds the modulus of two numbers.

            // Food for thought: What happens if we try to divide by zero? What should happen?

        // ---------- BONUS ------------

        // TODO: Create your multiplication method without the * operator (Hint: a loop might be helpful).

        // TODO: Do the above with recursion.


        /* ***************************************
                   VALIDATE USER INPUT
        ****************************************/

        // TODO: Create a method that validates that user input is in a certain range

            // The method signature should look like this:
                //public static int getInteger(int min, int max);
            //and is used like this:
                // System.out.print("Enter a number between 1 and 10: ");
                // int userInput = getInteger(1, 10);
            // TODO: If the input is invalid, prompt the user again.
            // Hint: recursion might be helpful here!


        /* ***************************************
                CALCULATE FACTORIAL NUMBER
        ****************************************/

        // TODO: Calculate the factorial of a number.

            // TODO: Prompt the user to enter an integer from 1 to 10.
            // TODO: Display the factorial of the number entered by the user.
            // TODO: Ask if the user wants to continue.
            // TODO: Use a for loop to calculate the factorial.
            // TODO: Assume that the user will enter an integer, but verify it’s between 1 and 10.
            // TODO: Use the long type to store the factorial.
            // TODO: Continue only if the user agrees to.

            // A factorial is a number multiplied by each of the numbers before it.
            // Factorials are denoted by the exclamation point (n!). Ex:

            //        1! = 1               = 1
            //        2! = 1 x 2           = 2
            //        3! = 1 x 2 x 3       = 6
            //        4! = 1 x 2 x 3 x 4   = 24


        // ---------- BONUS ------------

        // TODO: Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!

        // TODO: Use recursion to implement the factorial.


        /* ***************************************
                         DICE ROLL
        ****************************************/

        // TODO: Create an application that simulates dice rolling.

            // TODO: Ask the user to enter the number of sides for a pair of dice.
            // TODO: Prompt the user to roll the dice.
            // TODO: "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
            // TODO: Use static methods to implement the method(s) that generate the random numbers.
            // TODO: Use the .random method of the java.lang.Math class to generate random numbers.



         /* ***************************************
                   Game Development 101
        ****************************************/

        // TODO: You are going to build a high-low guessing game. Create a class named HighLow inside of src.

        // The specs for the game are:

            // Game picks a random number between 1 and 100.
            // Prompts user to guess the number.
            // All user inputs are validated.
            // If user's guess is less than the number, it outputs "HIGHER".
            // If user's guess is more than the number, it outputs "LOWER".
            // If a user guesses the number, the game should declare "GOOD GUESS!"

        // Hints:
            // Use the random method of the java.lang.Math class to generate a random number.


        // ---------- BONUS ------------

        // TODO: Keep track of how many guesses a user makes.
        // TODO: Set an upper limit on the number of guesses.


        /* ***************************************
                  Console Adventure Game!
        ****************************************/

        // TODO: This is a paired exercise, so find yourself a fellow adventurer before getting started!

            // Using what you've learned so far in the Java I module, we're going to create a classic text-based RPG game. These types of online role-playing games date back to the 70's and solely rely on a text-based interface. In this case, we'll be using Java to run this game in our console.

            // The idea is that your game will prompt the user, who will then input answers through the console (using the Scanner class). How the game changes depending on their answer is completely up to you! Below are a list of suggested features to get you started:

            // TODO: Ask if the user is ready to start. If they type in "yes", start the game.
            // TODO: Ask the user for their name. Store this as a variable to personalize the adventure.
                // A classic RPG will have the hero going through different scenarios and battling their enemies.
            // TODO: Display enemy stats and hero stats. Properties and values can be assigned by you.
                // For example: Health, Attack Points, etc.
            // TODO: Decide on what actions your hero can take.
            // TODO: Attack (decreases enemyHealth)
            // TODO: Drink potion (adds to heroHealth)
            // TODO: Run? (ends the game)
            // TODO: Keep asking for user input until the enemyHealth reaches 0, then end the game.


        // ---------- BONUS ------------

        // TODO: Allow the user to specify hero stats and enemy stats.
        // TODO: Automate an enemyAttack after each time the hero takes a turn.
        // TODO: End the game if either heroHealth or enemyHealth drops to 0.
        // TODO: Indicate how many potions your hero starts with. Decrement this number each time 'Use Potion' action is used.

        // Remember that these are only suggestions. Feel free to get creative and have fun!!

    }
}
