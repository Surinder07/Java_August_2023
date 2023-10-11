package oct10.oops.superT;

public class Vehicle { // parent
    int fuelCap = 100;
    public void display(){
        System.out.println("Vehicle class Display method ");
    }
}
class Car extends Vehicle{  // child
    int fuelCap = 50;

    public void display(){
        super.display();  //
        System.out.println("Car class display method");
        System.out.println("Fuel Capacity " + this.fuelCap);  // 50
        System.out.println("Vehicle class Fuel Cap : "+ super.fuelCap); // 100
    }
} // super keyword to ref parent class method and parent class variable
class MainK {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}

// this ? which refers to the current class instance
// super ---> super class or parent
// 1. refer parent class method
// 2. refer parent class fields/ variables
// 3. refer to the parent class constructor


//


