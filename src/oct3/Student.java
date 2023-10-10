package oct3;

public class Student{
    String name;
    String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //overrde toString()   --> gives string represenation of object
    // what it does     , why it does
    // what it does  rather why it does
    @Override
    public String toString() {
        return "abc{" +
                "NAdfsaME='" + email + '\'' +
                ", EdsadMAIL='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("Amit", "amit@gmail.com");
        System.out.println(student);
    }
}
