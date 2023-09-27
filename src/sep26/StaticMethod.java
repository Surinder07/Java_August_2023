package sep26;

public class StaticMethod {

    // method overload
   // same name -- differn parameters
    public static void main(String[] args) {
        // static belongs to the class rather than instance of class
        StaticMethod.getName("pragra");

    }
    public static void getName(String name){
        System.out.println(name);
    }

// method hiding ?
    // method overloading?
    // same method name and diff parameters
    // can we overload main method??

}
/*

OOP
1. without object, we can not do much
2. main --> starting point of execution


// 4 --? object , memory allocated?
new
 */
