package grades;

import util.Input;

import java.util.HashMap;

// TODO: Create a class named GradesApplication with a main method.
public class GradesApplication {

    public static void main(String[] args) {

        // TODO: Inside the main method, create a HashMap named students.
        //  a. It should have keys that are strings that represent github usernames, and values that are Student objects.

        HashMap<String, Student> students = new HashMap<>(); // Creates a new instance (instantiate) of HashMap for students

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


            if (students.containsKey(userInput)) { // If the user entered a valid response -->

                System.out.println(

                        "\nName: " + target.getName() + " - Github Username: " + userInput +
                                "\nCurrent Average: " + target.getGradeAverage() + "\n"

                ); // Give the user the information they requested

                System.out.print("\nWould you like to continue?");

            } else { // If the user has NOT entered a valid response -->

                System.out.println("\nSorry, no student found with the GitHub username of \"" + userInput + "\"\nWould you like to see another student?");

            }

        } while (input.yesNo()); // Run the loop once --> if true --> run loop , if false --> end code



        /* ***************************************
                        BONUS
        ****************************************/

        // TODO: 1. Display all of the student's grades in addition to the grade average.

        // TODO: 2. Allow the user to view all of the grades for all of the students.

        // TODO: 3. Modify your CLI to provide an option to view the overall class average.

        // TODO: 4. Modify your CLI to provide an option to print a csv report of all the students.

            // Example Output


            // name,github_username,average
            // Zach,zgulde,81.2
            // Ryan,ryanorsinger,88.3
            // Fernando,fmendozaro,90.4
            //...

        // TODO: 5. Add an attendance property to your Student objects. It should be a HashMap. The keys should be strings representing the date, in the format "2017-10-02", and the values should be Strings that are one of:

            // "A": Absent
            // "P": Present

        // TODO: 6. Add a method named recordAttendance(String date, String value) that adds records to the HashMap this method should make sure value is an an acceptable string.

        // TODO: 7. Create an instance method on your Student class to calculate a student's attendance percentage -- (Total Days - Absences) / Total Days.
        // TODO: 8. Add the attendance information to the output of your command line interface, this should require only a small change.
        // TODO: 9. Create an instance method on Student that finds the specific days a student was absent. This method should return a List of Strings, where each string is the date of the absence.



        /* ***************************************
                        BONUS
        ****************************************/

        // TODO: 1. Create a grocery list command line application. You will use your input class from previous exercises.

            // a. A user should be prompted if they would like to create a grocery list.
            // b. If they pick yes, they will be prompted if they would like to enter a new item.
            // c. If the users picks yes, they should be given the following three prompts:
                // 1. Given an ordered list of grocery categories to choose from, select the category.
                // 2. Enter name of the item.
                // 3.  Enter how many of the item.
            // d. The user will then be given the choice to finalize the list or add an additional item.
            // e. Once the user finalizes the list, they will be presented with a complete list organized alphabetically and grouped by category, and including quantity.
            // f. For an extra bonus, allow users to filter the results by only one category of items at a time.
            // g. For a super gold star bonus, allow users to edit the list items.

        // Consider before coding how the data should be organized. Using ArrayLists and HashMaps will be helpful.

    }

}
