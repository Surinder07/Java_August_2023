package oct10.oops.superT;

class SmartPhone{
    int memory;

    SmartPhone(){
        System.out.println("Parent class Constructor... ");
    }
    public SmartPhone(int memory) {
        this.memory = memory;
    }

    public void display(){
        System.out.println(memory);
    }
}

class Iphone extends SmartPhone{

    Iphone(){
        super(100);
         // ref current class const
          // available to const by default
        // this() has to be the first statement in the const call
        // super() has to be the first statement in const call
        System.out.println("Child class Constructor...");
    }
}
public class SuperConst {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.display();
        //parent class object class creation running in backgroud.

    }
}
