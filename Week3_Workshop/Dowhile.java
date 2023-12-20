import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.print("Enter a number (0 to exit): ");
            userInput = scanner.nextInt();
        } while (userInput != 0);

        System.out.println("Exiting the program.");
    }
}
