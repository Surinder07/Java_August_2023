package oct14.polymorph.overriding;

public class Student extends Object{

    String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

// Object    [toString() ---> ]

// Student  [toString() ---> ]
