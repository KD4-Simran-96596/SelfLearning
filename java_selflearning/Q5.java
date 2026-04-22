import java.util.*;

class TextAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your text:");
        String text = sc.nextLine();

        analyzeText(text);
    }

    public static void analyzeText(String text) {
        int vowels = 0, consonants = 0, digits = 0;
        int spaces = 0, specialChars = 0;

        text = text.toLowerCase();

        for (char ch : text.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (isVowel(ch)) vowels++;
                else consonants++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            } else {
                specialChars++;
            }
        }

        int totalChars = text.length();
        int words = countWords(text);

        double vowelPercent = (totalChars == 0) ? 0 :
                (vowels * 100.0) / totalChars;

        // 📊 Output
        System.out.println("\n--- Text Analysis ---");
        System.out.println("Total Characters: " + totalChars);
        System.out.println("Words: " + words);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + specialChars);
        System.out.printf("Vowel Percentage: %.2f%%\n", vowelPercent);
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u';
    }

    private static int countWords(String text) {
        if (text.trim().isEmpty()) return 0;
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
}
