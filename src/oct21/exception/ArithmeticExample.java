package oct21.exception;

import java.util.Scanner;

public class ArithmeticExample{
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first num");
        int x = scanner.nextInt();


        System.out.println("Enter the first num");
        int y = scanner.nextInt();

        int div =1;
        try {
             div = x / y;
        }
        catch (ArithmeticException e){

            e.printStackTrace();
            //System.out.println("You should not add denominator as 0");

        }

        System.out.print("Diviison of two nos : ");

        /*
        try{
        // any code which may give you exception

        }
        catch(type of exception ){

        // provide some useful message
        // print a stack trace

        }
         */



    }
}
