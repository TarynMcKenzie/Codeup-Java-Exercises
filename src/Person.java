public class Person {

    // TODO: Create Person class inside of src that has a private name property that is a string, and the following methods:

    // Initialize Private name property
    private String name;

    // returns the person's name
    public String getName(){
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    // prints a message to the console using the person's name
    public String sayHello() {
        return String.format("%s says hello!", this.name);
    }



    // TODO: The class should have a constructor that accepts a String value and sets the person's name to the passed string.

    // the Person constructor
    public Person(String name) {
        this.name = name;
    }


    // TODO: Create a main method on the class that creates a new Person object and tests the above methods.

    public static void main(String[] args) {

        // TODO: The following code blocks make use of the Person class from the previous exercise.
        //       For each code block, think about what the code will output, then copy the code into IntelliJ and run it to see if it matches your expectations.

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
        // Output :
            // true
            // false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        // Output :
            // true

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        // Output :
            //John
            //John
            //Jane
            //Jane
    }
}
