import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLec {
    public static void main(String[] args) {

        // *************************************************** //
        // ********* ArrayList and its Methods *************** //
        // *************************************************** //

        // TODO:  1. Initialize an ArrayList of Strings, called roasts
        ArrayList<String> roasts = new ArrayList<>();

            // TODO:  a. add light, medium, medium, dark to the array list, one at a time
            roasts.add("light");
            roasts.add("medium");
            roasts.add("medium");
            roasts.add("dark");

        System.out.println(roasts);

        //  TODO:  2. Check to see if the list contains "dark" , and then "espresso"
        boolean booleanResult;
        booleanResult = roasts.contains("dark");
        System.out.println(booleanResult);

        //  TODO:  3. Find the last index of "medium" in the array
        int intResult;
        intResult = roasts.lastIndexOf("medium");
        System.out.println(intResult);

        //  TODO:  4. Check if the array list is empty
        booleanResult = roasts.isEmpty();
        System.out.println(booleanResult);

        //  TODO:  5. Assign the array list an empty ArrayList object, and then check if empty
        ArrayList<String> empty = new ArrayList<>(); // An Empty array list --> .isEmpty will always return true
        booleanResult = empty.isEmpty(); // Check if the array is empty
        System.out.println(booleanResult);

        //  TODO:  6. Remove the espresso roast
        booleanResult = roasts.remove("espresso");
        System.out.println(booleanResult); //returns false


        //  TODO:  7. Remove the element at index 2
        roasts.remove(2);
        System.out.println(roasts); // medium roast has been removed


        // *************************************************** //
        // ********* Hash Maps and their Methods ************* //
        // *************************************************** //
		
		//  TODO:  1. Create a HashMap called userNames that contains:
        HashMap<String, String> userNames = new HashMap<>();

            userNames.put("Casey", "fridaynext");    // a. first name   b. Github username

        System.out.println(userNames);

        //  TODO:  2. re-initialize the HashMap using the .clear() method
        userNames.clear();
        System.out.println(userNames);

		//  TODO:  3. use the .put() method to add "Casey" -> "fridaynext" back to the map
        userNames.put("Casey", "fridaynext");    // a. first name   b. Github username

		//  TODO:  4. use the .putIfAbsent() method to add
            // a. "Vivian" -> "viviancan"
            // b. "Casey" -> "XpenguinX"

        userNames.putIfAbsent("Vivian", "viviancan");    // a. first name   b. Github username
        userNames.putIfAbsent("Casey", "XpenguinX");    // a. first name   b. Github username

        System.out.println(userNames);

        //  TODO:  5. What happend with the .putIfAbsent()? Did both items get added? Why/why not?
        //  The system checked if the key/value was there --> if there, DONT add key/value --> if not there, ADD key/value

		//  TODO:  6. Use the .remove() method to remove "Casey"
        userNames.remove("Casey");

        System.out.println(userNames); // Casey has been removed

        //  TODO:  7. Use the .replace() method to change Vivian's username to "viviancandev"
        userNames.replace("Vivian", "viviancandev");

        System.out.println(userNames); // Vivian's username was replace using the (key , new value)

        //  TODO:  8. Use the .clear() method to clear the map
        userNames.clear();

        System.out.println(userNames);

        //  TODO:  9. Use the .isEmpty() method to verify that it was cleared
        System.out.println(userNames.isEmpty());

    }
}
