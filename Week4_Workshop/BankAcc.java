import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    private String accountHolderAddress;

    // Constructor to initialize attributes
    public BankAccount(String accountNumber, double balance, String accountHolderName, String accountHolderAddress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
    }

    // Method to deposit money
    public void depositMoney(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". Current Balance: $" + balance);
    }

    // Method to withdraw money
    public void withdrawMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". Current Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

public class BankAcc {
    public static void main(String[] args) {
        // Creating an object of BankAccount class and initializing attributes
        BankAccount myAccount = new BankAccount("123456789", 1000.0, "John Doe", "123 Main St");

        // Performing operations
        myAccount.depositMoney(500.0);
        myAccount.withdrawMoney(200.0);
        myAccount.withdrawMoney(800.0); // This will fail due to insufficient funds
    }
}
