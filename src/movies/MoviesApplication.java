package movies;

import util.Input;

public class MoviesApplication {

    // TODO: Create a class named MoviesApplication that has a main method.
    public static void main(String[] args) {

        // TODO: Give the user a list of options for viewing all the movies or viewing movies by category.
        // TODO: Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
                // If a category is selected, only movies from that category should be displayed.
                // Your application should continue to run until the user chooses to exit.

                // Sample Output


                // What would you like to do?

//                 0 - exit
//                 1 - view all movies
//                 2 - view movies in the animated category
//                 3 - view movies in the drama category
//                 4 - view movies in the horror category
//                 5 - view movies in the scifi category

                //Enter your choice: 1

                //Frankenstein -- horror
                //Goodfellas -- drama
                //Pulp Fiction -- drama
                //...

        //--------------USER PROMPT------------------
        System.out.println("What would you like to do?" +
                "\t0 - exit\n" +
                "\t1 - view all movies\n" +
                "\t2 - view movies in the animated category\n" +
                "\t3 - view movies in the drama category\n" +
                "\t4 - view movies in the horror category\n" +
                "\t5 - view movies in the scifi category");

        //--------------NEW INPUT INSTANCE------------------
        Input userInput = new Input();

        //--------------CAPTURE USER INPUT------------------
        int validate = userInput.getInt(0, 5);


        //--------------CHECK USER INPUT------------------
        switch (validate){
            case 0:
                System.out.println("exit");
                break;
            case 1:
                System.out.println("View all Movies");
                break;
            case 2:
                System.out.println("View movies in the animated category");
                break;
            case 3:
                System.out.println("View movies in the drama category");
                break;
            case 4:
                System.out.println("View movies in the horror category");
                break;
            case 5:
                System.out.println("View movies int he scifi category");
                break;
            default:
                break;
        }

    }
}
