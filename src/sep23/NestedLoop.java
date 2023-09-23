package sep23;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i <=5; i++) { // i = 1 , 1 <=5 [true]

            for (int j = 0; j<=i  ; j++) { // j = 1 ,  1 <= 1, j = 1
                System.out.print("* "); // print * , 1<=0

            }
            System.out.println();  // print new line
        }
    }
}
/*
outer ---> check the lines
inner -- > how many stars
            *
            * *
            * * *
            * * * *
            * * * * *


* * * * *
* * * *
* * *
* *
*
 */



/*public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i <=5; i++) { // i = 0 , 0 <5 [true], i = 1

            for (int j = 0; j<=i  ; j++) { // j = 0 ,  0 <= 0  , j = 1
                System.out.print(" *"); // print * , 1<=0

            }
            System.out.println();  // print new line
        }
    }
}*/
/*
outer ---> check the lines
inner -- > how many stars
            *
            * *
            * * *
            * * * *
            * * * * *


 */


