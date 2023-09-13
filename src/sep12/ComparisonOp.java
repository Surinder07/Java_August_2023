package sep12;

public class ComparisonOp {
    public static void main(String[] args) {
        int x = 10;
        int y = 11;
        int a = 20;
        int b = 15;
                      //   true               false
        boolean result = x > y      ||      a >b;
        System.out.println(result);

        boolean result1 = !(x <= y      ||      a >b); // true
        boolean result2 = x != y      &&      a <b; // false
        boolean result3 = x >= y      ||      a >=b; // true
        boolean result4 = x <= y      &&      a ==b; // false
        // Logical     AND &&, OR ||, NOT  !
        // AND operator
        //   true      true   ---> true
        // true       false    --> false
        // false      true    --> false
        // false     false    --> false

        // OR operator
        //  true      true   ---> true
        // true       false    --> true
        // false      true    --> true
        // false     false    --> false
// git /github -- create an account in github
    }
}
