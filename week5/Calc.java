public class Calc {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calc calculator = new Calc();

        // Adding two integers
        int result1 = calculator.add(5, 8);
        System.out.println("Result of adding two integers: " + result1);

        // Adding three integers
        int result2 = calculator.add(10, 15, 20);
        System.out.println("Result of adding three integers: " + result2);

        // Adding two doubles
        double result3 = calculator.add(3.5, 2.7);
        System.out.println("Result of adding two doubles: " + result3);

        // Adding three doubles
        double result4 = calculator.add(1.1, 2.2, 3.3);
        System.out.println("Result of adding three doubles: " + result4);
    }
}
