import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class delete {
    public static void deletecar() {

        String fileName = "src\\avto.txt";// назва файлу
        Scanner scanner = new Scanner(System.in);// метод для введення даних
        System.out.print("Enter the nomber a car to delete it from the database:");
        String authors = scanner.nextLine();// введення даних для пошуку рядка в файлі Book Й перезапису рядка в пусте значення
        String fileContent = "";// пусте значення
        try (Scanner search = new Scanner(new FileReader(fileName))) /* метод для читання файлу*/ {
            while (search.hasNextLine()) {// поки не закінчиться файл
                String line = search.nextLine();// зчитування рядка
                String[] tokens = line.split("  ");// розділення рядка на поля
                if (!tokens[2].equals(authors)) {// перевірка на співпадіння даних
                    fileContent += line + "\n";// запис рядка в файл
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(fileContent);
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
        System.out.println("The author has been removed from the database");

    }
}
