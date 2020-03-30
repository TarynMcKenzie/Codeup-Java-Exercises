import java.util.Random;

public class ServerNameGenerator {

    // We are going to build a server name generator.
    // TODO: Create a class inside of src named ServerNameGenerator, and follow the specs below.

    // TODO: 2. Create a method that will return a random element from an array of strings.

    public static String randomReturn(String[] choices) {

        Random rand = new Random(); // create a new instance of random
        String randomWord = choices[rand.nextInt(choices.length)]; // generate a random number within the bounds of the arrays length --> store it into randAdj

        return randomWord;
    }

    // TODO: 3. Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    //Example Output:
    //  Here is your server name:
    //  dedicated-photon


    public static void main(String[] args) {

        // TODO: 1. Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.

        String[] adjectives = new String[10];
        String[] nouns = new String[10];

        adjectives[0] = "ad";
        adjectives[1] = "alive";
        adjectives[2] = "better";
        adjectives[3] = "careful";
        adjectives[4] = "clever";
        adjectives[5] = "dead";
        adjectives[6] = "easy";
        adjectives[7] = "famous";
        adjectives[8] = "gifted";
        adjectives[9] = "hallowed";

        nouns[0] = "problem";
        nouns[1] = "man";
        nouns[2] = "question";
        nouns[3] = "woman";
        nouns[4] = "government";
        nouns[5] = "country";
        nouns[6] = "home";
        nouns[7] = "company";
        nouns[8] = "business";
        nouns[9] = "word";

        System.out.println("Here is your server name: \n" + randomReturn(adjectives) + "-" + randomReturn(nouns));
    }

}
