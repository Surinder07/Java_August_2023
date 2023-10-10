package oct7.oops.constr;

public class Student {
    int id;
    String name;
    // no default const if you create param const


    // constructor chaining
    // call a constructor
    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    /*  // this keyword -- which ref current class
    public Student(int id){ // 101
        this.id = id; //


    }
    public Student(int id, String name){

    }*/

    public void displayStudent(){
        System.out.println("Student" + " : " +id + " and " +name);
    }

}
