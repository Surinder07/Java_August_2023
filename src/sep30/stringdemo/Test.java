package sep30.stringdemo;

public class Test {
    public static void main(String[] args) {
        String s1 = "pragra"; // SCP
        String s3 = "pragra";

        String s2 = new String("pragra"); // Object
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3));  //  true
        System.out.println(s2.toUpperCase());


        // ==
        // .equals ("")

       // System.out.println("S1 "+s1);

       // System.out.println("S2 "+s2);

        // check the content and also check the memory address
        //System.out.println(s1 == s2); // true  /  false /  WIll not work
       // System.out.println(s1==s3);  // true


        //.equals






      //  System.out.println(s1.equals(s2)); //




    }

}
