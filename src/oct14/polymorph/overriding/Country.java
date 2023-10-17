package oct14.polymorph.overriding;

public class Country {
    private  String name;
    private final double area;

    public Country(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public void showDetails(){
        name = "test";

        System.out.println(name);
        System.out.println(area);
    }
}

class Canada extends Country{

    public Canada(String name, double area) {
        super(name, area);
    }

    @Override
    public void showDetails() {
        super.showDetails();
    }
}

class MainT{
    public static void main(String[] args) {
        Canada canada = new Canada("Canada", 20000);
        canada.showDetails();
    }
}
/*

final -- Class -- can not inherit
final -- Method -- canot be overriden
final --variable -- cannot change
 */