package oct10.oops;

public class Vehicle {
    private String color;
    private String model;
    private int fuelCap;
    private int year;

    public Vehicle(String color, String model, int fuelCap, int year){
        this.color = color;
        this.model = model;
        this.fuelCap = fuelCap;
        this.year = year;
    }

    public void printDetails(){
        System.out.println("Color : " + color);
        System.out.println("Model  : " + model);
        System.out.println("fuel Cap  : " + fuelCap);
        System.out.println("year : " + year);
    }
}

//
