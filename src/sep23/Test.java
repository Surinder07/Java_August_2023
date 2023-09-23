package sep23;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = scanner.nextInt();
        System.out.println((number % 2 == 0)? "Even": "Odd");


        // check number is negative or postiive

         // condition ? execute this line : execute this line


                       // condition       // true               // false
        //String result = (number % 2 == 0) ? "this number is even" : "This number id odd";

        //System.out.println(result);

        /*String result = ((number%2 ==0))? "even":"odd";
        System.out.println(result);
        */


    }
}
