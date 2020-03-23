import java.util.Scanner;

public class ControlFlowExercises {

    public static void main (String[] args){

        /* ***************************************
                         WHILE LOOPS
        ****************************************/

        // TODO: Create an integer variable i with a value of 5.

//        int i = 5;

        // TODO: Create a while loop that runs so long as i is less than or equal to 15
        // Each loop iteration, output the current value of i, then increment i by one.
        // Your output should look like this: 5 6 7 8 9 10 11 12 13 14 15

//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }

         /* ***************************************
                        DO WHILE LOOPS
        ****************************************/

        // TODO: Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int i = 0;

//        do{
//            System.out.println(i);
//            i += 2;
//
//        } while(i <= 100 );
//

        // TODO: Alter your loop to count backwards by 5's from 100 to -10.

//        int i = 100;
//
//        do{
//            System.out.println(i);
//            i -= 5;
//
//        } while(i >= -10);


        // TODO: Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.

        // Output should equal:

            //        2
            //        4
            //        16
            //        256
            //        65536

//        float i = 2;

//        do{
//            String str = String.format("%.0f", i);
//            i = i * i;
//            System.out.println(str);
//
//        } while(i < 1000000);

         /* ***************************************
                         FOR LOOPS
        ****************************************/

        // TODO: Refactor the previous two exercises to use a for loop instead.

//        for (float i = 2; i < 1000000; i *= i){
//
//            String str = String.format("%.0f", i);
//            System.out.println(str);
//
//        };

        /* ***************************************
                         FIZZBUZZ
        ****************************************/

        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

        // TODO: Write a program that prints the numbers from 1 to 100.
            // For multiples of three: print “Fizz” instead of the number.
            // For the multiples of five: print “Buzz”.
            // For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for (int i = 0; i <= 100; i++){
//
//            if( i % 15 == 0 && i != 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0 && i != 0){
//                System.out.println("Buzz");
//            } else if(i % 3 == 0 && i != 0){
//                System.out.println("Fizz");
//            }else{
//                System.out.println(i);
//            }
//        }

        // TODO: Display a table of powers.

            Scanner input = new Scanner(System.in);

            // TODO: Prompt the user to enter an integer.

//                System.out.println("Enter a number");

            // TODO: Display a table of squares and cubes from 1 to the value entered.

                // Ask if the user wants to continue. -->
                // Only continue if the user agrees to -->
                // Assume that the user will enter valid data.-->

                // Example Output:

                    // What number would you like to go up to? 5

                    //Here is your table!

                    //                number | squared | cubed
                    //                ------ | ------- | -----
                    //                1      | 1       | 1
                    //                2      | 4       | 8
                    //                3      | 9       | 27
                    //                4      | 16      | 64
                    //                5      | 25      | 125


                    //                int userInterger = input.nextInt();
                    //
                    //                System.out.printf("number | squared | cubed %n------ | ------- | -----%n");
                    //
                    //                for (int i = 1; i <= userInterger; i ++){
                    //
                    //                    int squared = i * i;
                    //                    int cubed = i * squared;
                    //                    {
                    //                        System.out.println(i+"\t   | "+squared+"\t\t | "+cubed);
                    //                    }
                    //
                    //                }

//
//            System.out.println("Do you want to continue? [y/N]");
//
//
//            String userConfirm = input.next();
//
//            Boolean confirm = userConfirm.equals("y");
//
//
//            while(confirm){
//
//                System.out.println("What number would you like to go up to?");
//
//                int userInterger = input.nextInt();
//
//                System.out.println("Here is your table!");
//                System.out.printf("number | squared | cubed %n------ | ------- | -----%n");
//
//                for (int i = 1; i <= userInterger; i ++){
//
//                    int squared = i * i;
//                    int cubed = i * squared;
//                    {
//                        System.out.println(i+"\t   | "+squared+"\t\t | "+cubed);
//                    }
//
//                }
//            }



        // TODO: Convert given number grades into letter grades.

            // TODO: Prompt the user for a numerical grade from 0 to 100.
            // TODO: Display the corresponding letter grade.
            // TODO: Prompt the user to continue.
                // Assume that the user will enter valid integers for the grades.
                // The application should only continue if the user agrees to.

                // Grade Ranges:
                //
                //        A : 100 - 88
                //        B : 87 - 80
                //        C : 79 - 67
                //        D : 66 - 60
                //        F : 59 - 0

//            Scanner input = new Scanner(System.in); //Take in a value from the system
//
//
//                 System.out.println("What is your numerical grade?"); //Ask the user for their grade
//
//                 int userGrade = input.nextInt(); // store the scanner value to a integer variable
//
//
//                int quotient = userGrade / 10;
//                int remainder = quotient % 10;
//
//                switch (quotient) { //based on the numerical grade value --> do the corresponding task
//                    case 10:
//                    case 9:
//                        System.out.println("A");
//                        break;
//                    case 8:
//                        System.out.println("B");
//                        break;
//                    case 7:
//                        System.out.println("C");
//                        break;
//                    case 6:
//                        System.out.println("D");
//                        break;
//                    case 5:
//                    case 1:
//                    case 4:
//                    case 3:
//                    case 2:
//                        System.out.println("F");
//                        break;
//                    default:
//                        System.out.println("Try again");
//                        break;
//                }


        /* ***************************************
                         BONUS
        ****************************************/

        // TODO: Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).


    }
}
