package oct17.interfac.example;

interface A{


}
interface B{

}
class C implements A, B{

}

public class Test {
    public static void main(String[] args) {
        // parent     = child
        A a = new C();
    }
}
/*

     class or interface

     Calculator      -- calculate()
       Camera        -- clickPictures(), makeVideos()
        Telephone     -- makeCall(), receiveCalls()
          Ipod       -- playSongs()
          Computer   -- SurfInternet()

     Mobile phone == class
     // clicking pictures ...






 */