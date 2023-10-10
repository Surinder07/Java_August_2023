package oct7.oops.constr;

public class Laptop {
    int hdd; // 100
    String brand; // DELL

    Laptop(){
        System.out.println("Default Laptop");
    }

    Laptop(int hdd){ // param const
        this.hdd = hdd;
    }

    public Laptop(int hdd, String brand) {
        this(hdd); // this will call default const
        this.hdd = 100;
        this.brand = brand;
    }

    public void display(){
        System.out.println(hdd); //100
        System.out.println(brand); // DELL
    }
}

// this keyword ?
// to refer the current class variable
// super -- inheritance
// this()

//OP : Default Laptop