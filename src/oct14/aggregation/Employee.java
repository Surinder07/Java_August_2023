package oct14.aggregation;

public class Employee {
    private int id;
    private String name;
    // first name,  middle name , lastName, preferred name
    private double salary;
    private Address address;

    public Employee(int id, String name, double salary, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}

/*

Complex
Composite
multi valued attribute

 */
