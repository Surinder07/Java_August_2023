package oct24.bank;

import java.time.chrono.IsoChronology;

public class ScotiaBankApp {
    public static void main(String[] args) {

        Bank bank = new Bank();
        double deposit = bank.deposit(1000);
        System.out.println("deposit amout is : "+deposit);

        double withdraw = 0;
        try {
             withdraw = bank.withdraw(1800);
        }
        catch (InsufficientBalanceException e){
            System.out.println(e);
        }
        System.out.println("withdraw " + withdraw);

    }
}
/*
  ---- if age is less than 18 ---
  throw -- not legal drive
  // create a custom exception class
  1. IllegalToDriveException
  2. AgeCriteriaDoNoMatchException




 */