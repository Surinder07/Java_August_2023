package assignments;

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}
class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.eat(); // Accessing the eat method from the Animal class
        // myAnimal.bark(); // This would be a compilation
        // error because bark is not defined in the Animal class.
    }
}