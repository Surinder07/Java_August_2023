package oct24;

public class Mouse {
    public static void main(String[] args) {

        // throw --- > throw is explicitly

        int age = 10;
        if(age< 18){
            throw new IllegalArgumentException("Age is less than 18");
        }
    }

    public void set() throws NullPointerException{
        String s = null;
        System.out.println(s.toUpperCase());
    }
}
