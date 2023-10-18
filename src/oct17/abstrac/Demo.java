package oct17.abstrac;

public class Demo {
    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.makeSound();
        dog.move();

        Animal cat = new Cat();
        cat.move();
        cat.makeSound();

    }
}
/*
abstract

asbtract class - any class which is declared with abstract keyword

--> class has abstract method it should be abstract
--> You can not create object of abstract class
---> it can have both abstract or non abstract methods


Media player example for abstract class

    MediaPlayer   ---> size, capacity
    play(), pause(), stop(), next(), rewind()

    1. Audio media player ----> windows media player
    2. Video Media player -----> playVideo()

    1. Spotify ,   youtube music, VLC media player
    2.  Youtube,  Netflix



 */