public class Sum2D {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
