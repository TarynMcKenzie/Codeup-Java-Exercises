package grades;

import util.Input;

import java.util.HashMap;

// TODO: Create a class named GradesApplication with a main method.
public class GradesApplication {

    public static void main(String[] args) {

        // TODO: Inside the main method, create a HashMap named students.
        //  a. It should have keys that are strings that represent github usernames, and values that are Student objects.

        HashMap<String, Student> students = new HashMap<>(); // Creates a new instance of HashMap for students

        //  TODO: Create at least 4 student objects with at least 3 grades each, and add them to the map.
        // Be creative! Make up GitHub usernames and grades for your student objects.


        //--------------CREATE STUDENTS------------------
        Student sarah = new Student("Sarah"); // Create new Student object

        // Add sarah's grades to her arrayList, grades
        sarah.addGrade(98);
        sarah.addGrade(66);
        sarah.addGrade(89);

//        sarah.getGradeAverage();

        Student noah = new Student("Noah"); // Create new Student object

        // Add noah's grades to her arrayList, grades
        noah.addGrade(98);
        noah.addGrade(99);
        noah.addGrade(100);

//        noah.getGradeAverage();

        Student sally = new Student("Sally"); // Create new Student object

        // Add sally's grades to her arrayList, grades
        sally.addGrade(50);
        sally.addGrade(33);
        sally.addGrade(45);

//        sally.getGradeAverage();

        Student stella = new Student("Stella"); // Create new Student object

        // Add stella's grades to her arrayList, grades
        stella.addGrade(100);
        stella.addGrade(100);
        stella.addGrade(100);

//        stella.getGradeAverage();


        //--------------ADD STUDENTS TO HASHMAP------------------
        students.put("SarahBehold", sarah); // Add student Object to the HashMap
        students.put("NoahsArk", noah); // Add student Object to the HashMap
        students.put("SallyPup", sally); // Add student Object to the HashMap
        students.put("StellaGenius", stella); // Add student Object to the HashMap


        //--------------PRINT HASHMAP------------------
//        System.out.println(students);


        // TODO: Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about.
        //       a. The user should enter a GitHub username (i.e. one of the keys in your map).
        //       b. If the given input does not match up with a key in your map, tell the user that no users with that username were found.
        //       c. If the given username does exist, display information about that student, including their name and their grades.
        //       d. After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.

            // Example output:


            // Welcome!
            // Here are the GitHub usernames of our students:
            // |zgulde| |ryanorsinger| |jreich5| |fmendozaro| |MontealegreLuis|

            // What student would you like to see more information on?
            // > pizza

            // Sorry, no student found with the GitHub username of "pizza".
            // Would you like to see another student?
            // > y

            // What student would you like to see more information on?
            // > zgulde

            // Name: Zach - GitHub Username: zgulde
            // Current Average: 87.4

            // Would you like to see another student?
            // > no

            // Goodbye, and have a wonderful day!

        Input input = new Input(); // Create a new instance of the Input class


        //--------------INITIAL GREETING------------------
        System.out.println("Welcome! \nHere are the GitHub usernames of our students: "); // User greeting

        String[] userList = students.keySet().toArray(new String[0]); // get user keys from HashMap --> convert to String --> Store in String Array variable, userList

        for (String user : userList) { // Loop (enhanced for) through the userList Array -->

            System.out.print("|" + user + "| "); // print the userList items

        }

        System.out.println("| all | \n"); // print the last option, all


        //--------------USER INFORMATION RETURN------------------

        do {

            System.out.println("\nWhat student would you like information on?"); // Initial user prompt -->

            String userInput = input.getString(); // Store user input into userInput -->

            Student target = students.get(userInput); // get the key/value based on the string input -->


            if (userInput.equalsIgnoreCase(String.valueOf(userList))) { // If the user entered a valid response -->

                System.out.println(

                        "\nName: " + target.getName() + " - Github Username: " + userInput +
                                "\nCurrent Average: " + target.getGradeAverage() + "\n"

                ); // Give the user the information they requested

            } else { // If the user has NOT entered a valid response -->

                System.out.println("\nSorry, no student found with the GitHub username of \"" + userInput + "\"\nWould you like to see another student?");

            }

        } while (input.yesNo()); // Run the loop once --> if true --> run loop , if false --> end code



    }

}
