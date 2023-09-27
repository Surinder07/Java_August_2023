package sep26;

public class StaticTest {
    static int count = 0;

    StaticTest(){
        count ++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticTest s1 = new StaticTest();
        StaticTest s2 = new StaticTest();
        StaticTest s3 = new StaticTest();
        StaticTest s4 = new StaticTest();
        StaticTest s5 = new StaticTest();



    }

}

/*

variables --- > local , instance variables
staic block , static method, static variables

memory



 */