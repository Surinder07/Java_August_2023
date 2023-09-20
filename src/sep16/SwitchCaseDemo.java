package sep16;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        System.out.println("Welcome to my calculator");
        System.out.println("Press 1 for addition ");
        System.out.println("Press 2 for subraction ");
        System.out.println("Press 3 for mul");
        System.out.println("Press 4 for divison");
        System.out.println("Press 5 for modulation");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input to select option ");
        //int input = scanner.nextInt(); // 3
        //char input  =  scanner.next().charAt(0);
        int input = scanner.nextInt();
       switch (input){
           case 1 :
               System.out.println("Enter the input for sum");
               int sumInput = scanner.nextInt();

               if(sumInput == 1 ){


               }


               break;
           case 2:
               System.out.println("Hello on 2");
               break;
           case 3:
               System.out.println("Hello on 3");
               break;
           case 4:
               System.out.println("Hello on 4");
               break;
           case 5:
               System.out.println("Hello on 5");
               break;
           default:
               System.out.println("Wrong input...");
       }




    }
}
