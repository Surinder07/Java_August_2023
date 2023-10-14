package oct10.oops;

public class MainT {
    public static void main(String[] args) {
//String color, String model, int fuelCap, int year, int numOfSeats
        Car car = new Car("White", "Tesla X", 50, 2023, 5);
        car.carDetails();
    }
}


// 5mins

// any class ----<> which has IS-A relationship
//1. Computer is a machine  --  Computer extends Machine
//2. Television is Gadget   ---
//3. Cricket is a sport
//4. Galaxy is Mobile
//5. Tshirt is a cloth
// Apple is a fruit
// Chair is a furniture

// super keyword to ref parent class method and parent class variable