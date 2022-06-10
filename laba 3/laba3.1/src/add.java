import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class add {
    public static void addavto() {

        Avto avto = new Avto();//

        String fileName = "src\\avto.txt";
        String fileContent = "";
        Scanner scanner =  new Scanner(System.in);


        System.out.print("\nEnter the book to add it to the database:");
        System.out.print("\nМарка: ");
        avto.setMarka(scanner.nextLine());// введення автора
        System.out.print("\nКолір: ");
        avto.setKolor  (scanner.nextLine());// введення назви книги
        System.out.print("\nНомер авто: ");
        avto.setNomer (scanner.nextLine());// введення жанру книги
        System.out.print("\nрік випуску: ");
        avto.setRikVypuska (scanner.nextInt());// введення року публікації книги
        scanner.nextLine();// перехід на новий рядок
        System.out.print("\nПІБ власника: ");
        avto.setVlasyhnik(scanner.nextLine());// введення наявності книги
        // запис в файл нового значення з введеними даними книги за допомогою методу writeToFile
        fileContent += avto.getMarka() + "  " + avto.getKolor() + "  " + avto.getNomer() + "  " + avto.getRikVypuska() + "  " +   avto.getVlasyhnik() + "\n";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(fileContent);// запис в файл
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
        System.out.println("The book has been added to the database \n");

    }

}
