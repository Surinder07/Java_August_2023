package oct7.oops;

public class Main {
    public static void main(String[] args) {

        // Object 1
        Car pragraCar = new Car();  // object
        pragraCar.fuelCapl = 50;
        pragraCar.topSpeed = 250;
        pragraCar.totalSeats = 7;
        pragraCar.manufacturer = "pragra";
        pragraCar.showCar();

        // obj
        Car tesla = new Car();
        tesla.topSpeed = 200;
        tesla.fuelCapl = 600;
        tesla.totalSeats = 5;
        tesla.manufacturer = "Tesla";
        tesla.showCar();

        // call to  method in the class
    }
}


    // Object
    // className ref = new ClassName();
    // new --> assign memory to the object


// car  -- object refrence


// stack          heap
// car   --------> new Car();