// TODO: For this exercise, create a directory inside of src named grades. Create the classes defined below inside of grades.
package grades;

import java.lang.reflect.Array;
import java.util.ArrayList;

// TODO: Create a Student class
public class Student {


    // TODO: Create a class named Student.
    //       a. It should have private properties for the student's name, and grades.
    //       b. The grades property should be an ArrayList of integers.
    //       c. The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.
    //       d. The Student class should have the following methods:

    //--------------INITIALIZE------------------
    private String name;
    private ArrayList<Integer> grades; // Variable for an  arrayList that accepts Integers


    //--------------CONSTRUCTOR METHOD (RECTANGLE)------------------
    public Student(String name) {

        this.name = name;
        grades = new ArrayList<>(); // New instance of the grades arrayList

    }


    //--------------GET (NAME)------------------
    public String getName() {

//        System.out.println("Name: " + name);
        return name; // returns the student's name

    }

    //--------------ADD (GRADE)------------------
    public void addGrade(int grade) {

        grades.add(grade); // adds the given grade to the grades property

    }

    //--------------GET (GRADE AVERAGE)------------------
    public double getGradeAverage() {

        int total = 0;

        for (Integer grade : grades) total += grade;

        int average = total / grades.size();

//        System.out.println( name + "'s grade average: " + average);

        return average; // returns the average of the students grades


    }


    // TODO: Test your Student class by adding a main method and creating Student objects.
    public static void main(String[] args) {

        // TODO: Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.

        Student sarah = new Student("Sarah"); // create a new instance of a student named Sarah

        sarah.getName(); // prints Sarah


        // Add sarah's grades to her arrayList, grades
        sarah.addGrade(98);
        sarah.addGrade(66);
        sarah.addGrade(89);


        sarah.getGradeAverage(); // Prints the average grade for sarah
    }

}
