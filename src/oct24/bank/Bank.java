package oct24.bank;

public class Bank {
    double balance;

    // deposit

    public double deposit(double deposit) {
        balance = balance + deposit;
        return balance;
    }

    //withdraw
    public double withdraw(double withdraw) throws InsufficientBalanceException {
        // check

        if (withdraw > balance) {
            throw new InsufficientBalanceException("You are poor my friend, withdraw less than the balance you have.");

        }
        else{

        }

        balance = balance - withdraw;
        return balance;
        // balance

    }

}
// exceptions in built
// within Java