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


        //--------------CREATE DA STUDENTS------------------
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


        //--------------ADD DA STUDENTS TO HASHMAP------------------
        students.put("SarahBehold", sarah); // Add student Object to the HashMap
        students.put("NoahsArk", noah); // Add student Object to the HashMap
        students.put("SallyPup", sally); // Add student Object to the HashMap
        students.put("StellaGenius", stella); // Add student Object to the HashMap


        //--------------PRINT DA HASHMAP------------------
//        System.out.println(students);



        // TODO: Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about.
            // a. The user should enter a GitHub username (i.e. one of the keys in your map).
            // b. If the given input does not match up with a key in your map, tell the user that no users with that username were found.
            // c. If the given username does exist, display information about that student, including their name and their grades.

        Input input = new Input(); // Create a new instance of the Input class

        System.out.println("Welcome! \nHere are the GitHub usernames of our students: \n" + students.getKey()); // Initial prompt for user




        // TODO: After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.

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

    }

}
