package oct14.protecteddemo;

import oct14.protecteddemo.emp.Employee;
import oct14.protecteddemo.mgr.Manager;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(101,"Peter");

        Manager manager = new Manager(10,"Test", "Test");
        manager.title = "Manager";



    }
}
