package oct10.oops;

public class Animal { // parent
    void sleep(){
        System.out.println("Animal is sleeping");
    }
    void run(){
        System.out.println("Animal is running ");
    }
}
class Cat extends Animal{ // child
    void eat(){
        System.out.println("Cat is eating... ");
    }
}
class Main1 {
    public static void main(String[] args) {
       Cat cat = new Cat(); // child class Object
        cat.eat();  // in child class
        cat.sleep(); // Animal class / Super
        cat.run();
        /*Animal animal = new Animal();
        animal.sleep();

        Cat cat = new Cat();
        cat.eat();*/


    }
}
