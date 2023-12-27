final class FinalClass {
    final void finalMethod() {
        System.out.println("This is a final method.");
    }
}

class SubClass {
    void finalMethod() {
    }
}

public class Fnl {
    public static void main(String[] args) {
        FinalClass finalObj = new FinalClass();
        finalObj.finalMethod();

        SubClass subObj = new SubClass();
        subObj.finalMethod();
    }
}
