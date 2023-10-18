package oct17.interfac.example;

public class InterDemo {
    public static void main(String[] args) {

        Parrot parrot = new Parrot();
        parrot.eat();
        parrot.flying();

    }
}


        /*eat()      eat()
     [class]Bird    Fly[Interface]
    extends  |      |   --- implments
             |      |


          Parrot



          A      INTERFACE
          |
          B      CLASS

          |
          C

          A a = new B();


         */