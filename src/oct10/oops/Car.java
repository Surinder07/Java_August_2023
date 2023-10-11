package oct10.oops;

public class Car extends Vehicle{

    private int numOfSeats;

    public Car(String color, String model, int fuelCap, int year, int numOfSeats) {
        super(color, model, fuelCap, year); // ignore
        this.numOfSeats = numOfSeats;
    }

    public void carDetails(){
        printDetails();
        System.out.println("numOfSeats : " + numOfSeats);
    }

}
