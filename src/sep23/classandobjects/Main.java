package sep23.classandobjects;

public class Main {
    public static void main(String[] args) {

        // created object of calculator
        Calculator calculator = new Calculator();
        int sum = calculator.sum(10, 20);

        calculator.sum(10, 20, 30);
        System.out.println(sum);


    }
}
