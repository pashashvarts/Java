// видалити всі слова із тексту що складаються з латинських букв а не латинських букв і вивести їх на екран

import java.util.Scanner;

public class Delete {
    public static void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("[а-я=А-Я]+")) {
                System.out.print(words[i] + " ");
            }
        }
    }
}