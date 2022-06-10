import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fileName = "src\\List.txt";// записуємо назву файлу

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {// метод для читання файлу
            int count = 0;
            while (scanner.hasNextLine()) {// сканування поки не закінчиться файл
                int number = scanner.nextInt();
                if (number % 2 != 0) {
                    System.out.print(" " + number );
                    count++;
                }
            }
            System.out.print("\nкількість чисел "+ count);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}