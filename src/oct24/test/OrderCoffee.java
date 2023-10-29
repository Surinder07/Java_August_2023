package oct24.test;

public class OrderCoffee {
    public static void main(String[] args) {

        TimHortons coffee = TimHortons.LARGE;
        System.out.println(TimHortons.LARGE);

        switch (coffee){
            case MEDIUM:
                System.out.println("Please get me a medium coffee");
                break;
            case LARGE:
                System.out.println("Please get me a large coffee");
                break;
            case SMALL:
                System.out.println("SMall coffee");
                break;
        }
    }
}
// Days of week
// credit card, master card.

// A
// method -- exception

// B
// @overriden
// method --