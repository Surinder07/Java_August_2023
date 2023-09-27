package sep26;

public class StaticDemo {
    // static block will execute first
    // executed by the JVM when the class is loaded.
    // even before the main   method

    {
        System.out.println("Hello inside the block");
    }

    static {
        System.out.println("inside upper static block "); // 1
    }
    public static void main(String[] args) {
        System.out.println("Inside main method... "); // 3
        StaticDemo staticDemo =  new StaticDemo();
    }



}
// StaticDemo.java ---> StaticDemo.class [byte code ]
/*
static variable

static method

static block

 */

