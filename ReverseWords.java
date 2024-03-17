public class ReverseWords {
    public static void main(String[] args) {
        String inputString = "Hello World";
        String reversedString = reverseEachWord(inputString);
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseEachWord(String input) {
        String[] words = input.split("\\s+");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedString.append(reversedWord).append(" ");
        }

        return reversedString.toString().trim();
    }
}