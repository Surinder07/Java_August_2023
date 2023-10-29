package oct24.exceptions.examples;

public class ExceptionDemo {
    public static void main(String[] args) {

        int[] arr = {2,34,54,675,7};

        try {
            System.out.println(arr[7]);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        // finally will execute always
        finally {
            System.out.println("Inside finally block");
        }


    }
}

//checked         or   unchecked?
// compile time   or   runtime

// Manager -- senior dev - junior dev
//
// Database -- connection --->
//