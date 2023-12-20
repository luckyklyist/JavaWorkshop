class Customer {
    private int customerId;
    private String name;
    private BankAccount bankAccount;

    public Customer(int customerId, String name, BankAccount bankAccount) {
        this.customerId = customerId;
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}

class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount() {
        System.out.println("Bank Account created!");
    }

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Bnk {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123456, 1000.0);

        Customer customer1 = new Customer(1, "Hari", account1);

        BankAccount account2 = new BankAccount(654321, 2000.0);
        Customer customer2 = new Customer(2, "Gopal", account2);

        // Demonstrate the use of getters and setters
        System.out.println("Customer 1 ID: " + customer1.getCustomerId());
        System.out.println("Customer 1 Name: " + customer1.getName());
        System.out.println("Customer 1 Account Number: " + customer1.getBankAccount().getAccountNumber());
        System.out.println("Customer 1 Account Balance: " + customer1.getBankAccount().getBalance());

        System.out.println("Customer 2 ID: " + customer2.getCustomerId());
        System.out.println("Customer 2 Name: " + customer2.getName());
        System.out.println("Customer 2 Account Number: " + customer2.getBankAccount().getAccountNumber());
        System.out.println("Customer 2 Account Balance: " + customer2.getBankAccount().getBalance());
    }
}
