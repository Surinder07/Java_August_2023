package sep16;

public class Test {
    public static void main(String[] args) {


        /*

        //  make a cal


           Grade --->
           marks --> 0-40 --> fail
           marks 40-60 ---> B grade
           marks 60-80 ---> B + grade
           marks 80-90 -- > A grade
           marks 90- 99 -- > A + grade
           marks more than 99 --> Your are Alien.
         */
        int x = 10;
        int y = 20;
        // it will check syntax
        if(x < 10){
            System.out.println("X is greater");
        }
        else if (x == 10) {

            System.out.println("X is smaller");
        }
        else if(x > 10 && x <20){
            System.out.println("X is equal to 10 ");
        }
        else if(x >=20 && x < 30){
            System.out.println("X is equal to 10 ");
        }
        else if(x <= 10){
            System.out.println("X is equal to 10 ");
        }

         else{
            System.out.println("Number not found..");
        }
    }
}

// javac Test.Java  -- Compiling
// java Test  - running