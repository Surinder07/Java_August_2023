package oct28;

public class EmployeeMain {
    public static void main(String[] args) {

       /* Employee employee = new Employee("Peter", "peter@gmail.com");
        int email = (int) employee.getEmail();*/

        Employee<Integer, String > employee = new Employee<>(101, "peter@gmail.com");
        String email = employee.getEmail();

        /*

        Student ---> id , name


         */


    }
}
