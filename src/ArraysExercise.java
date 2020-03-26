import java.util.Arrays;

public class ArraysExercise {
    /* ***************************************
                   ARRAY BASICS
     ****************************************/

    // TODO: Create a class inside of src named ArraysExercises. Create a main method for this class to do your work.

    //--------------MAIN------------------
    public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5};

    System.out.println(numbers);
    // What happens when you run the following code? Why is Arrays.toString necessary?
        // It prints out the memory location of the array.
        // System.out.println(Arrays.toString(numbers));

    // TODO: Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
    //       Iterate through the array and print out the name of each person in the array.

        //--------------MAKE NEW INSTANCE ARRAY (PERSONS)------------------
        Person[] persons = new Person[3];

        //--------------NEW INSTANCES ARRAY (PERSON)------------------
        Person casey = new Person("Casey");
        Person vivian = new Person("Vivian");
        Person trant = new Person("Trant");

        //--------------FILL THE NEW INSTANCE ARRAY (PERSONS)------------------
        persons[0]= casey;
        persons[1]= vivian;
        persons[2]= trant;

        //--------------PRINT EACH PERSON------------------
        for (Person eachPerson: persons){
            System.out.println(eachPerson.sayHello());
        }


    // TODO: Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array.
    //       It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.


    }
}
