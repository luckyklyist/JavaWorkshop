import java.util.Scanner;

public class SignupApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userData;
        boolean signupSuccessful = false;

        do {
            System.out.println("Enter your full name:");
            userData = new String[] { scanner.nextLine() };

            System.out.println("Enter your contact number (10 digits starting with 0):");
            userData = addToArray(userData, scanner.nextLine());

            System.out.println("Enter your date of birth (DD/MM/YYYY or MM/DD/YYYY):");
            userData = addToArray(userData, scanner.nextLine());

            System.out.println("Enter your password (alphabet + @ or & + numeric):");
            userData = addToArray(userData, scanner.nextLine());

            System.out.println("Confirm your password:");
            userData = addToArray(userData, scanner.nextLine());

            if (isValidInput(userData)) {
                signupSuccessful = true;
                System.out.println("Signup process completed successfully!");
                // Save user data in an appropriate data structure (e.g., arrays)
                // You can implement this part based on your needs.
            } else {
                System.out.println("Signup failed. Please check the provided information and try again.");
            }

        } while (!signupSuccessful);

        scanner.close();
    }

    private static String[] addToArray(String[] array, String value) {
        String[] newArray = new String[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = value;
        return newArray;
    }

    private static boolean isValidInput(String[] userData) {
        if (userData.length != 5) {
            System.out.println("All fields are required. Please provide all information.");
            return false;
        }

        String fullName = userData[0];
        String contactNumber = userData[1];
        String dob = userData[2];
        String password = userData[3];
        String confirmPassword = userData[4];

        if (fullName.length() <= 4) {
            System.out.println("Full name must be longer than 4 characters.");
            return false;
        }

        if (!contactNumber.matches("0\\d{9}")) {
            System.out.println("Invalid contact number. It should start with 0 and have 10 digits.");
            return false;
        }

        if (!dob.matches("(\\d{2}/\\d{2}/\\d{4})|(\\d{2}/\\d{2}/\\d{4})")) {
            System.out.println("Invalid date of birth. Use the format DD/MM/YYYY or MM/DD/YYYY.");
            return false;
        }

        if (!password.matches("[a-zA-Z]+[@&][0-9]+")) {
            System.out.println(
                    "Invalid password. It should start with alphabets, followed by @ or & and end with numeric.");
            return false;
        }

        if (!password.equals(confirmPassword)) {
            System.out.println("Password confirmation does not match the initial password.");
            return false;
        }

        // Calculate age based on the year in the date of birth
        int birthYear = Integer.parseInt(dob.split("/")[2]);
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int age = currentYear - birthYear;

        if (age < 21) {
            System.out.println("You must be at least 21 years old to sign up.");
            return false;
        }

        return true;
    }
}
