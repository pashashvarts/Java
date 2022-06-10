import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort {
    public static void sortavto() throws IOException {
        //сортуваня файллла Book за допомогую sort
        String fileName = "src\\avto.txt";// записуємо назву файлу
        List<String> list = new ArrayList<>();// створюємо масив для збереження даних
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {// метод для читання файлу
            String line;// змінна для збереження даних
            while ((line = reader.readLine()) != null) {// сканування поки не закінчиться файл
                list.add(line);// зчитування рядка
            }
        }
        Collections.sort(list);// сортування масиву
        try (FileWriter writer = new FileWriter(fileName, false)) {// метод для запису файлу в потік виводу в файл
            for (String line : list) { // проходимося по масиву
                writer.write(line + "\n");// записуємо дані в файл
            }
        }
        System.out.println("Car by mark successfully sorted\n");// виведення повідомлення про успішне завершення процесу


    }
}