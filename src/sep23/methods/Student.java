package sep23.methods;

public class Student {

    //static is keyword ---> which can be used to call class properties with
    // with name of class
    // parameters and argument

      public static String setName(String name){ // parameter
          return "Hello " + name;
    }

    public static void main(String[] args) {  // call a method
                        // arguments
        String result  = setName("Bla Bla");
        System.out.println(result);

    }
}
