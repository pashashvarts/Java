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
        System.out.print("\n�����: ");
        avto.setMarka(scanner.nextLine());// �������� ������
        System.out.print("\n����: ");
        avto.setKolor  (scanner.nextLine());// �������� ����� �����
        System.out.print("\n����� ����: ");
        avto.setNomer (scanner.nextLine());// �������� ����� �����
        System.out.print("\n�� �������: ");
        avto.setRikVypuska (scanner.nextInt());// �������� ���� ��������� �����
        scanner.nextLine();// ������� �� ����� �����
        System.out.print("\nϲ� ��������: ");
        avto.setVlasyhnik(scanner.nextLine());// �������� �������� �����
        // ����� � ���� ������ �������� � ��������� ������ ����� �� ��������� ������ writeToFile
        fileContent += avto.getMarka() + "  " + avto.getKolor() + "  " + avto.getNomer() + "  " + avto.getRikVypuska() + "  " +   avto.getVlasyhnik() + "\n";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(fileContent);// ����� � ����
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
        System.out.println("The book has been added to the database \n");

    }

}
