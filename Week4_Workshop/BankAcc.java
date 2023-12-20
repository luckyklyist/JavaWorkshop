class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;
    private String accountHolderAddress;

    // Parameterized constructor
    public BankAccount(int accountNumber, double balance, String accountHolderName, String accountHolderAddress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
    }

    // No-argument constructor
    public BankAccount() {
        System.out.println("User created!");
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void depositMoney(double amount) {
        balance += amount;
        System.out.println("Amount deposited. Current balance: " + balance);
    }

    // Method to withdraw money
    public void withdrawMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class Lamp {
    private boolean isOn;

    // Method to turn on the light
    public void turnOn() {
        isOn = true;
        System.out.println("Light turned on.");
    }

    // Method to turn off the light
    public void turnOff() {
        isOn = false;
        System.out.println("Light turned off.");
    }
}

class Box {
    private double width;
    private double height;
    private double depth;

    // Constructor for a cube
    public Box(double length) {
        this.width = length;
        this.height = length;
        this.depth = length;
    }

    // Constructor for a cuboid
    public Box(double length, double breadth, double height) {
        this.width = length;
        this.height = breadth;
        this.depth = height;
    }

    // No-argument constructor
    public Box() {
        this.width = 10;
        this.height = 8;
        this.depth = 12;
    }

    // Method to get the volume
    public double getVolume() {
        return width * height * depth;
    }
}

class Address {
    private String street;
    private String city;
    private String zipCode;

    // Getter method for street
    public String getStreet() {
        return street;
    }

    // Getter method for city
    public String getCity() {
        return city;
    }

    // Getter method for zipCode
    public String getZipCode() {
        return zipCode;
    }
}

class Customer {
    private int customerId;
    private String name;

    // Parameterized constructor
    public Customer(int customerId, String name, BankAccount bankAccount) {
        this.customerId = customerId;
        this.name = name;
        this.bankAccount = bankAccount;
    }

    // Getter method for customerId
    public int getCustomerId() {
        return customerId;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for bankAccount
    public BankAccount getBankAccount() {
        return bankAccount;
    }
}

// Creating objects and demonstrating the use of getters and setters
BankAccount bankAccount = new BankAccount(123456789, 1000.0, "John Doe", "123 Main St");
System.out.println("Account Holder Name: " + bankAccount.getAccountHolderName());
System.out.println("Account Balance: " + bankAccount.getBalance());

Lamp lamp = new Lamp();
lamp.turnOn();
lamp.turnOff();

Box cube = new Box(5.0);
System.out.println("Cube Volume: " + cube.getVolume());

Box cuboid = new Box(10.0, 8.0, 12.0);
System.out.println("Cuboid Volume: " + cuboid.getVolume());

Box box = new Box();
System.out.println("Box Volume: " + box.getVolume());

Address address = new Address();
System.out.println("Street: " + address.getStreet());
System.out.println("City: " + address.getCity());
System.out.println("Zip Code: " + address.getZipCode());

Customer customer = new Customer(1, "Jane Smith", bankAccount);
System.out.println("Customer ID: " + customer.getCustomerId());
System.out.println("Customer Name: " + customer.getName());
System.out.println("Customer Account Balance: " + customer.getBankAccount().getBalance());
