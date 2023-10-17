package oct14.polymorph.overriding;

public class AreaMain {
    public static void main(String[] args) {

        // Parent class       child class
        Shape rectangle = new Rectangle(2,3);
        System.out.println("rect area  : "+rectangle.getArea());

        Shape square = new Square(5);
        System.out.println("square area : "+square.getArea());

        Shape redRec = new RedRectangle(10,20);


        //   Bank class ---> rate of intrst(),
        // 3 banks
        // diff rate of interest [for mortgage]/ auto loan / personal loan

        // main class -- print with object do Upcasting

        // Bank scotiabank = new ScotiaBank();


    }
}

/*
Upcasting
         Shape  [getArea()] -- 0.0 [Parent]
        |    |
Rectangle   Square  [Child ]
2,3          4
= 6          16
 */

// Shape s      =         new Square();
// Square s      =        new Square();
// Stack                    Heap

