interface Bankk {
    void deposit(double amount);

    void withdraw(double amount);
}

class NepalBank implements Bankk {
    private double balance = 0;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: $" + balance);
    }
}

public class Bank {
    public static void main(String[] args) {

        NepalBank myBank = new NepalBank();

        myBank.deposit(1000);
        myBank.checkBalance();

        myBank.withdraw(500);
        myBank.checkBalance();

        myBank.withdraw(700);

    }
}
