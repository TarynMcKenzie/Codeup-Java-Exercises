import java.util.Random;

public class ArrayLec {
    // Let's have some fun with arrays!

    public static void main(String[] args) {

        /* ***************   ******** ********************* */
        /* ******** WORKING WITH ARRAY ELEMENTS *********** */
        /* ************* ITERATING ARRAYS ***************** */
        /* ***************   ******** ********************* */

        // TODO: 1. Declare an int array called numbers without populating it
        //       2. Declare a String array called words with a length of 10
        //       3. Initialize an int array called temps with the 'array initializer syntax'

        int[] numbers; // Initiate a integer array
        String[] words = new String [10]; // Initiate a string array called words
        int[] temps = {34, 31,56, 89, 75}; //temps.length = 5;

        // TODO: 1. Using a for loop, iterate through the temps array and print each temp on a new line
        //       2. Using an advanced for, iterate through the temps array and print each temp on a new line
        //       3. Re-assign the third element with a temp of 38
        //       4. Print "Updated third temp: 38" to the console, using printf

        for(int i = 0; i < temps.length; i++){ //loop through the temps in the temp array --> spit out the temp for each item
            System.out.println("Basic for loop: " + temps[i]);
        }

        // plural == array
        // singular == item in array
        for (int temp : temps) { // enhance: loop through the temps in the temp array --> spit out the temp for each item
            System.out.println("Enhanced for loop: " + temp);
        }

        temps[2] = 38; //reassign the temp value for the third item in array

        System.out.printf("Updated third temp: %d\n" , temps[2]);

        // TODO: 1. Create a string called 'horns', populated with 4 values, using array initializer syntax
        //       2. Print a random element to the screen, saying "_random_ is the best manufacturer!"

        String[] horns = {"Yamaha", "Conn", "Schmid", "Holton"}; // create a string array with horn manufacturers
        Random rand = new Random(); // create a new instance of random
        int randInt = rand.nextInt(horns.length); // generate a random number within the bounds of the arrays length --> store it into randInt
        System.out.println(horns[randInt] + " is the best manufacturer"); // print out a random item from the horns array


    }
}