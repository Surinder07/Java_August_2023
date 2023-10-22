package oct21;



public class EncapDemo {
    public static void main(String[] args) {

        User user = new User("Pragra","12345"); // password set
        //user.userLogin("Pragra","12345");

        //user.username = "Abhishek";
        //user.password = "Iamhacker";

        user.userLogin("Abhishek", "Iamhacker");
        System.out.println("This is the username :" +user.getUsername());
    }
}
/*

Bank --

fields
accountHolderName -- SetName
accountType  -- You should not be able to change
accountNumber  -- get it but not change it
accountBalance  -- can not be modified directly


methods--
withdraw()  -- balance = 100 - 10 , balance 90
deposit() -- balance 90 -- 200 , balance = 290
checkBalance() -- balance 280
statements()  -- print whatever

Inheritance  -- ScotiaBank etc ,



 */