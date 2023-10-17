package oct14.protecteddemo.mgr;

import oct14.protecteddemo.emp.Employee;

public class Manager extends Employee {
    public String title;

    public Manager(int id, String name, String title) {
        super(id, name);
        this.title = title;
    }
    public void test(){

    }



}
