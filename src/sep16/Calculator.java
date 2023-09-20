package sep16;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Welcome to my calculator");
        System.out.println("Press 1 for addition ");
        System.out.println("Press 2 for subraction ");
        System.out.println("Press 3 for subraction");
        System.out.println("Press 4 for subraction");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input ");
        int input = scanner.nextInt();

        if(input == 1 && input > 1){
            System.out.println("Enter the first number");
            int num1 = scanner.nextInt();

            System.out.println("Enter the second number");
            int num2 = scanner.nextInt();

            System.out.println(" CALCULATING SUM ");
            int sum = num1 + num2;
            System.out.println("Sum of "+num1 + " and " + num2 + " is " + sum);

        } else if (input == 2) {
            System.out.println("Enter the first number");
            int num1 = scanner.nextInt();

            System.out.println("Enter the second number");
            int num2 = scanner.nextInt();

            System.out.println(" CALCULATING SUBTRACTION ");
            int subtraction = num1 - num2;
            System.out.println("Sum of "+num1 + " and " + num2 + " is " + subtraction);

        } else if (input == 3) {
            // multiplication
        }
        else{
            System.out.println("Wrong input ");
        }

    }
}
