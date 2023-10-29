package oct28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Student {
    public static void main(String[] args) {

        // List ---> ArrayList ,   LinkedList
        // Custom List

        List<Integer>  a1= new ArrayList<>();

        List<Integer>  a2= new LinkedList<>();


       List<Integer>  arrayList = new ArrayList<>(100);
        arrayList.add(10); // 0
        arrayList.add(20);  // 1
        arrayList.add(30); // 2
        arrayList.add(40); // 3
        System.out.println(arrayList + "TEst 1");
        arrayList.add(1,29);
        System.out.println(arrayList + "TEst 2");

       /* System.out.println(arrayList);
        Integer i = arrayList.get(1);
        System.out.println(i);*/


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        linkedList.get(1);
        System.out.println(linkedList);


        //JAVA 8
        // ARRAY SIZE = 0
        /*
        ADD NEW ELEMENT = SIZE 10
        WHEN REACHES 10

        (n + n/2 +1)  = 16

        10 + 10/2 + 1   --->
        n







         */

    }

}
