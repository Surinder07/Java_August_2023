package oct21.exception;

public class NullPointerEx {
    public static void main(String[] args) {

        //Exception
        String s = "Test";
        s = null;

        try {
            System.out.println(s.toUpperCase());
            System.out.println(2/0);  // arithmetic
            System.out.println("Test1");
            System.out.println(s.toUpperCase());  // null pointer

         }
        catch (Exception  e){

        }


        System.out.println("Test");

    }



}
/*



Tech manager    [task 1]    Excepiton


Senior dev   [Task 1 ]


Junior dev  [Task 1 ] --login


create array oof size 5
insert 6 elements



 */