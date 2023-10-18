package oct17.interfac.example;

public class Parrot extends Bird implements Fly{

    @Override
    public void flying() {
        System.out.println(" Parrot is flying... ");
    }
}

        /*
     [class]Bird    Fly[Interface]
    extends  |      |   --- implments
             |      |
             Parrot



         */