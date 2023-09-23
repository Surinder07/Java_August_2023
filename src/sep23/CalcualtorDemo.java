package sep23;

import java.util.Scanner;

public class CalcualtorDemo {
    public static void main(String[] args) {

        char choice;

        do {


            System.out.println("Welcome to Xyz Comms");
            System.out.println("1. Press 1 for English");
            System.out.println("2. Press 2 for French");
            System.out.println("3. Press 3 for Spanish");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your option : ");
            int input = scanner.nextInt();

            switch (input) {

                case 1:
                    System.out.println("English");
                    break;
                case 2:
                    System.out.println("French");
                    break;
                case 3:
                    System.out.println("Spanish");
                    break;
                default:
                    System.out.println("wrong input ");
            }
            System.out.println(" Do you want to continue ? Prees Y or N");
            choice = scanner.next().charAt(0);
        }while (choice != 'N');
    }
}
