package sep19;
import java.util.Scanner;
public class ProblemDowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to print product table");
        int number = scanner.nextInt();
        int i = 1;
        int limit = 10;

        System.out.println(" Multiplication table for 2");
        do{
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result );
            i++;
        }while (i <= limit);

    }
}

//  2 * 1 = 2

