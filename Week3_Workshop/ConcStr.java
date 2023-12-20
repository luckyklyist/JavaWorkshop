public class ConcStr {
    public static void main(String[] args) {
        String[] strings = { "Hello", " ", "World", "!" };
        String result = "";

        for (String str : strings) {
            result += str;
        }

        System.out.println(result);
    }
}
