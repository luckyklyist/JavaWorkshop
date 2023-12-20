public class MaxVal {
    public static void main(String[] args) {
        double[] numbers = { 1.5, 2.7, 3.9, 4.2, 5.1 };
        double max = numbers[0];

        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The maximum value is: " + max);
    }
}
