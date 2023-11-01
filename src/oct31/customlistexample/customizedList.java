package oct31.customlistexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class customizedList {
    public static void main(String[] args) {

        List<Employee> list = new LinkedList<>();
        list.add(new Employee("Asher",200, "Mexico"));
        list.add(new Employee("farid",100, "China"));
        list.add(new Employee("Iqbal",103, "US"));
        list.add(new Employee("Abhishek",20, "Canada"));
        list.add(new Employee("Sahil",200, "India"));
        System.out.println(list);

        // primitves --- int , float double
        // wrapper class -- Intger , Float, Double
        // create a custom list of students
        // name , age
        //   age = 20 , 40, 23, 53 ,23 45, 55, 40
        // find the students with age over 40

        //   student.getAge> 40

        // 1 create student class - name and age , getter setter
        // create custom list with Student
        // loop over it ... if (student.getAge> 40) : print student 







    }
}

