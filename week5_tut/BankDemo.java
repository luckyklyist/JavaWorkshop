// Define the abstract class Bank
abstract class Bank {
    private int balance = 0;

    abstract void deposit(int amount);

    void getBalance() {
        System.out.println("Balance: $" + balance);
    }

    void performDeposit(int amount) {
        balance += amount;
    }
}

class BankA extends Bank {
    @Override
    void deposit(int amount) {
        System.out.println("This is the first subclass");
        performDeposit(amount);
    }
}

class BankB extends Bank {
    @Override
    void deposit(int amount) {
        System.out.println("This is the second subclass");
        performDeposit(amount);
    }
}

class BankC extends Bank {
    @Override
    void deposit(int amount) {
        System.out.println("This is the third subclass");
        performDeposit(amount);
    }
}

public class BankDemo {
    public static void main(String[] args) {

        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        bankA.deposit(100);
        bankB.deposit(150);
        bankC.deposit(200);

        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();
    }
}
