class Parents {
    private String privateVar = "I am private!";
    protected String protectedVar = "I am protected!";
    public String publicVar = "I am public!";
}

class Child extends Parents {
    void demonstrateAccess() {
        // Uncommenting the line below will result in an error
        // System.out.println(privateVar);

        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}

public class Parent {
    public static void main(String[] args) {
        Child childInstance = new Child();
        childInstance.demonstrateAccess();
    }
}
