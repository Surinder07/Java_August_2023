package oct3;

public class Main {
    public static void main(String[] args) {

        String s1 = "  Runing   ";
        System.out.println(s1);

        /*System.out.println(s1.length());
        System.out.println(s1.substring(1, 6));
        System.out.println(s1.contains("un"));*/

        System.out.println(s1.trim());

        System.out.println(s1.replace("R", "T"));
        System.out.println(s1.strip());

    }
}
