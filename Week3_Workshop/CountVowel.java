public class CountVowel {
    public static void main(String[] args) {
        char[] characters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
        int vowelCount = 0;

        for (char ch : characters) {
            if (isVowel(ch)) {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
