package oct14.polymorph.overriding;

import oct14.polymorph.overriding.Shape;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // annotation
    @Override
    public double getArea() {
        return length * width;
    }
}
