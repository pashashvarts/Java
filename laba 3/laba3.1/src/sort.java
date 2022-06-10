import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort {
    public static void sortavto() throws IOException {
        //��������� ������� Book �� ��������� sort
        String fileName = "src\\avto.txt";// �������� ����� �����
        List<String> list = new ArrayList<>();// ��������� ����� ��� ���������� �����
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {// ����� ��� ������� �����
            String line;// ����� ��� ���������� �����
            while ((line = reader.readLine()) != null) {// ���������� ���� �� ���������� ����
                list.add(line);// ���������� �����
            }
        }
        Collections.sort(list);// ���������� ������
        try (FileWriter writer = new FileWriter(fileName, false)) {// ����� ��� ������ ����� � ���� ������ � ����
            for (String line : list) { // ����������� �� ������
                writer.write(line + "\n");// �������� ��� � ����
            }
        }
        System.out.println("Car by mark successfully sorted\n");// ��������� ����������� ��� ������ ���������� �������


    }
}