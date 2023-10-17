package oct14.aggregation;

import java.sql.Date;

public class Demo {
    public static void main(String[] args) {
        // Object Address

    /*    Address address =
                new Address("Matheson", "Toronto","Ontario","CA","L4HTD6");
*/

        // java.util.Date
        Employee employee =
                new Employee(101, "Bhupain",
                        100000,
                        new Address("Matheson", "Toronto","Ontario","CA","L4HTD6"));
        System.out.println(employee);
    }


}
/*

IS- A
Has - A
 */
