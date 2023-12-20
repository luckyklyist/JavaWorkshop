public class SumAvg {
    public static void main(String[] args) {
        double[] numbers = { 1.5, 2.7, 3.9, 4.2, 5.6 };

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
