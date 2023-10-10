package sep26;

public class StaticTest {
     static int count = 0; // shareable resource among the objects
    // 1

    // shareable resource
    StaticTest(){ // consider this as a special method
        count++;
        System.out.println(count); // 2
    }

    public static void main(String[] args) {
        StaticTest s1 = new StaticTest(); // 1
        StaticTest s2 = new StaticTest(); // 2
    }

}

/*

variables --- > local , instance variables
staic block , static method, static variables

memory



 */