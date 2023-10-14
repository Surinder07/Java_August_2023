package oct10.oops;

public class Car extends Vehicle{

    private int numOfSeats;

    public Car(String color, String model, int fuelCap, int year, int numOfSeats) {
        super(color, model, fuelCap, year);
        this.numOfSeats = numOfSeats;
    }

    public void carDetails(){
        printDetails();
        System.out.println("numOfSeats : " + numOfSeats);
    }

}

// create a parent class
/*
Paren --- Furniture
// 2 numberOfLegs,
   create 2 const --  1 default const and 1 param
child --- chair
create 2 const --  1 default const and 1 param

try using this and super keyword
to call one constructor from another

1. super keyword to ref parent variable
2. use super keyword to call parent class method.
 */