import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class output {
    //вивід тексту із файла  в вигляді таблиці
    public static void printTable() {
        String fileName = "src\\avto.txt";
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            int i = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    System.out.printf("%10s", word);
                }
                System.out.println();
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

}
