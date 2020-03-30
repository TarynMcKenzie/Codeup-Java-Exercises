package movies;

public class Movie {

    // We are going to build an application that keeps track of movies and displays them by category.

    // TODO: Inside of src, create a directory named movies. Create all of the classes described below in this directory.
    // TODO: Create a class named Movie.
    //       It should have private fields for name and category, and a constructor that sets both of these.
    //       Create methods to access these properties and change them (getters and setters).

    //--------------INITIALIZE------------------
    private String name;
    private String category;


    //--------------MOVIE CONSTRUCTOR------------------
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }


    //--------------Get + SET (CATEGORY)------------------
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //--------------Get + SET (Name)------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
