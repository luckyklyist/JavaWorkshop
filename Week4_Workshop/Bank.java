public class Bank {

    private String accountNumber;
    private double balance;

    public Bank(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public Bank() {
        System.out.println("Bank created!");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        Bank myBank = new Bank("123456789", 100000.0);
        System.out.println("Account Number: " + myBank.getAccountNumber() + ", Balance: $" + myBank.getBalance());
    }
}
