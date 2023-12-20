import java.util.Arrays;

public class CheckElem {
    public static void main(String[] args) {
        String[] array = { "apple", "banana", "orange", "grape", "mango" };
        String element = "orange";

        int index = Arrays.asList(array).indexOf(element);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
