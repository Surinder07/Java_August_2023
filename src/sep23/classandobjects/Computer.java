package sep23.classandobjects;

import java.util.Scanner;

public class Computer {

    // void -- no return value
    public void calculate(){
        System.out.println("Computer is calculating... ");
    }

    public static void main(String[] args) {
        // to create an object
        Computer c = new Computer();
        c.calculate();

        Scanner scanner = new Scanner(System.in);
        scanner.next(); // access method inside scanner class


    }
}
// Mobile  --> public void call() { sout"calling"
// -- creat object of Mobile
// call in the main method