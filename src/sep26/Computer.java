package sep26;

public class Computer {
    // member variables and methods

    String color;
    int ram;

    void calculate(){
        System.out.println("Computer is calculating.. ");
    }
    void surfInternet(){
        System.out.println("Opening the internet");
    }

    public static void main(String[] args) {

        // new is used to allocate the memory-
        Computer computer = new Computer();
        computer.color = "Blue";
        computer.ram = 512;

        computer.calculate();
        computer.surfInternet();

    }

}
