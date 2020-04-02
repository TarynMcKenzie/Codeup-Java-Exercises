package annotationsExamples;

import java.util.ArrayList;
import java.util.List;

public class AnnotationsLecture {
    public static int someNum = 3;

    public static void main(String[] args) {

        Child child1 = new Child();
        child1.sayHello();

        //TODO TOGETHER: Call deprecated method & no comment
        child1.deprecatedMethod(); //IntelliJ tells us that the method is deprecated with strikethrough

        //TODO TOGETHER: Call deprecated method with comment

        // With the comment, Intellij gives us the new method provided in the comments as a replacement
        child1.imAMethod();

        //TODO TOGETHER:Call sayHello without @Override
        child1.sayHello(); //Method runs

        //TODO TOGETHER: Comment out annotation and change Parent sayHello no sayHelloParent

        //The method gets a runtime error : Error:(5, 5) java: method does not override or implement a method from a supertype

    }

    //TODO Together: explore analyze > inspect code
    //TODO Together: Use @SuppressWarnings

    @SuppressWarnings("deprecation rawtypes unused") // use "all" to suppress all warnings

    public static void doRiskyThings(){
        Child riskyChild = new Child();
        riskyChild.oldMethod(); //static access & deprecation

        int a = (int) 2;
        List l = new ArrayList(); // raw use warning
        l.add("test"); // unchecked warning
        int three = 3; // unused warning

        System.out.println(l);
        AnnotationsLecture al = new AnnotationsLecture();
        System.out.println(al.someNum); // static-access warning

        String someName = "Fred"; // unused


        // Notice these warnings are still present!
        if (true) {
            ;
        }

        Boolean test = true; //
        if (test) {
            System.out.println("TRUE!");
        }
    }

}
