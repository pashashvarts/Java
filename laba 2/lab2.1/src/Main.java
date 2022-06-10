import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    int menu;
    Scanner scanner = new Scanner(System.in);
    do {
    System.out.println("\n1. Delete");
    System.out.println("2. Longest word");
    System.out.println("3. Exit");
    System.out.println("Enter menu number");
    menu = scanner.nextInt();

    switch (menu) {
    case 1:
        Delete.delete();
        break;
    case 2:
        Longest_word.Longest_word();
        break;
    case 3:
        System.out.println("Bye");
        break;
    default:
        System.out.println("Enter correct menu number");
        break;
    }
    } while (menu != 3);
    }
}




