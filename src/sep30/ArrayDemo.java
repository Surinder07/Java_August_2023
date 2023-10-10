package sep30;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements in array : ");
        // for loop --->
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

       /* for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }*/

        // enhanced for loop, forEach loop
        for (int element : arr) {
            System.out.println(element);
        }

        // enhanced for loop
        // for each loop

    }
}
