class Personn {
    protected String address;

    public Personn(String address) {
        this.address = address;
    }
}

class Employee extends Personn {
    private String department;

    public Employee(String address, String department) {
        super(address); // Call the Person constructor to initialize address
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Employee Details:");
        System.out.println("Address: " + address); // Accessing protected address from Person
        System.out.println("Department: " + department);
    }
}

public class Person {
    public static void main(String[] args) {
        Employee employee = new Employee("123 Main Street", "IT");
        employee.displayInfo();
    }
}