package oct24.exceptions;

import java.util.Scanner;

public class resources {
    // try with resources
    // open database connection ---
    // Scanner === scanner object scanner.close();

    public static void main(String[] args) {
        System.gc();
       /* String name = "Asher";
        name = null;*/
        // open a resource -- its going to close as well
        // File f = new File()
        // f.close()
        try(Scanner scanner = new Scanner(System.in)) {
            String name = scanner.next();
            System.out.println(name.toUpperCase());
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }

    }
    // db connections
    //files
    //scanner objects
}

// Garbage collections :
// https://www.freecodecamp.org/news/garbage-collection-in-java-what-is-gc-and-how-it-works-in-the-jvm/