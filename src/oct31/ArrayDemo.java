package oct31;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {

        // doubly linkedlist? prev and next , singly linkedList? next
        //parent ref = child object
        List<Integer> arrayList1 = new LinkedList<>();
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        arrayList1.add(40);

        System.out.println(arrayList1);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(50);
        arrayList2.add(60);
        arrayList2.add(70);
        arrayList2.add(80);

        System.out.println( "Array list 2 "+arrayList2);

        arrayList1.addAll(arrayList2);
        System.out.println("Arrayslist combined 1 and 2 "+arrayList1);


        // retreive element of array list
        System.out.println("Element at index 3  : "+arrayList2.get(3));


        System.out.println("Element removed  : "+arrayList1.remove(3));

        arrayList1.clear();
        System.out.println(arrayList1);

        //
        boolean contains = arrayList1.contains(30);
        System.out.println(contains);


    }
}
