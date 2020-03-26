import java.util.Arrays;

public class ArrayMatrixLec {

    /* ***************   ******** ********************* */
    /* ********* **** THE ARRAYS CLASS **** *********** */
    /* **************** 2D ARRAYS ********************* */
    /* ***************   ******** ********************* */

    // TODO: 1. Create an 'Instructor' class that stores an instructor's (Changed this to arrayMatrixLec for future reference)
    //           -- firstName
    //           -- lastName
    //           -- brainWaveFrequency
    //        -- Also, keep a count of the total number of instructors
    //       2. Print to the console when an instructor has been created
    //       3. Create Getters and Setters for names / brainwavefreq
    //       4. Create a method to display instructor stats
    //       5. Initialize an array full of instructor objects
    //       6. Instantiate three instructors (casey,vivian,trant)
    //       7. Set each instructor's BrainWaveFrequency
    //       8. Add those instructors in the Instructor object array
    //       9. Iterate through the Instructor object array, and display each instructor's stats
    //       10. Create an array with only first names in it, and display it to the console
    //       11. Sum the brainwave frequencies, and display the total to the console
    //       12. Sum the brainwave frequencies, and display the total to the console
    //       13. Create a 2D array, and print it to the console, in grid form

    private String firstName;
    private String lastName;
    private int brainWaveFrequency;
    private static int numInstructors = 0; // make static --> when other instructors are created, they can access this value --> increment it


    //--------------CONSTRUCTOR------------------
    public ArrayMatrixLec(String first, String last){ // class constructor
        this.firstName = first;
        this.lastName = last;
        this.brainWaveFrequency = 0; //default value
        numInstructors++; // When adding a new instructor --> add them to the count

        System.out.printf("%s has been added to the matrix array!\n", firstName);
        System.out.printf("instructor count: %s\n", numInstructors);
    }


    //--------------FIRST NAME (GET, SET)------------------
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }


    //--------------LAST NAME (GET, SET)------------------
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }


    //--------------BRAIN WAVE FREQUENCY (GET, SET)------------------
    public int getBrainWaveFrequency() {
        return brainWaveFrequency;
    }

    public void setBrainWaveFrequency(int brainWaveFreq) {
        this.brainWaveFrequency = brainWaveFreq;
    }

    //--------------INSTRUCTOR INFO (DISPLAY)------------------
    public String displayStats(){
        return String.format("%s %s Brainwave frequency: %d", firstName, lastName, brainWaveFrequency);
    }


    //--------------MAIN------------------
    public static void main(String[] args) {

        //--------------FORTUNA TEAM (CONSTANT)------------------
        final int FORTUNA_TEAM = 3;

        //--------------MAKE NEW INSTANCE ARRAY (TEAM)------------------
        ArrayMatrixLec[] team = new ArrayMatrixLec[FORTUNA_TEAM];

        //-------------- NEW INSTANCES ARRAY (INSTRUCTORS)------------------
        ArrayMatrixLec casey = new ArrayMatrixLec("Casey", "Friday");
        ArrayMatrixLec vivian = new ArrayMatrixLec("Vivian", "Canales");
        ArrayMatrixLec trant = new ArrayMatrixLec("Trant", "Batey");

        //--------------FILL THE NEW INSTANCE ARRAY (TEAM)------------------
        team[0] = casey;
        team[1] = vivian;
        team[2] = trant;

        //--------------PRINT INSTRUCTORS------------------
        for (ArrayMatrixLec instructor: team){
            System.out.println(instructor.displayStats());
        }

        //--------------GET INSTRUCTOR'S FIRST NAME------------------
        String[] firstNames = new String[team.length];
        for (int i = 0; i < team.length; i++){
            firstNames[i] = team[i].getFirstName();
        }

        //--------------PRINT INSTRUCTOR'S FIRST NAME------------------
        for (String firstName: firstNames){
            System.out.println(firstName);
        }


        //--------------CHANGE THE INSTRUCTOR NAMES------------------
        Arrays.fill(firstNames, "Haxxors");
        for (String name: firstNames){
            System.out.println(name);
        }

        //--------------PRINT TEAM ARRAY------------------
        System.out.println(Arrays.toString(team));// print out the array --> used for debugging
    }
}
