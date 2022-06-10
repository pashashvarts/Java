import java.util.Scanner;

public class Longest_word {
    public static void Longest_word() {
    String str = "";
    String word = "";
    String longestWord = "";
    int longestWordSize = 0;

        System.out.println("Enter text");
    str = new Scanner(System.in).nextLine();
    String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
        word = words[i];
        if (word.length() > longestWordSize) {
            longestWord = word;
            longestWordSize = word.length();
        }
    }
        System.out.println("The longest word is " + longestWord);
}
}

