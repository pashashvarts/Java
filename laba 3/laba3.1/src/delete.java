import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class delete {
    public static void deletecar() {

        String fileName = "src\\avto.txt";// ����� �����
        Scanner scanner = new Scanner(System.in);// ����� ��� �������� �����
        System.out.print("Enter the nomber a car to delete it from the database:");
        String authors = scanner.nextLine();// �������� ����� ��� ������ ����� � ���� Book � ���������� ����� � ����� ��������
        String fileContent = "";// ����� ��������
        try (Scanner search = new Scanner(new FileReader(fileName))) /* ����� ��� ������� �����*/ {
            while (search.hasNextLine()) {// ���� �� ���������� ����
                String line = search.nextLine();// ���������� �����
                String[] tokens = line.split("  ");// ��������� ����� �� ����
                if (!tokens[2].equals(authors)) {// �������� �� ��������� �����
                    fileContent += line + "\n";// ����� ����� � ����
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
