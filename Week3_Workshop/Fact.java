import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int factorial = 1;

        while (number > 0) {
            factorial *= number;
            number--;
        }

        System.out.println("Factorial: " + factorial);
    }
}
