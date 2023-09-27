package sep26;

public class VariablesDemo {
    // Local variable
    // instance variable
    //static variable

    int num; // instance variable
    // which belongs to the instance/object of the class

    public void getName(String email){
        String name = "pragra"; // local variable
        System.out.println(name);
        System.out.println(email);
        System.out.println(num);
    }
    // scope ? --> local variable are only accessed within this method
    public void setName(){
        System.out.println(num);
    }

    public static void main(String[] args) {
        VariablesDemo v = new VariablesDemo();

        v.getName("email@rmail.com");

    }
}
