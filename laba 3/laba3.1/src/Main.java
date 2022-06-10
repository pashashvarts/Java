import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("choose a menu item: ");
            System.out.println("1. add car");
            System.out.println("2. sort car");
            System.out.println("3. color car");
            System.out.println("4. delete car");
            System.out.println("5. output car");
            System.out.println("6. exit");
            choice = scanner.nextInt();


        // вибрати пункт меню за допомогою методу switch case та вивести відповідний текст в консоль
        switch(choice) {
            case 1:
                System.out.println("Item selected 1");
                add.addavto();
                break;
            case 2:
                System.out.println("Item selected 2");
                sort.sortavto();
                break;
            case 3:
                System.out.println("Item selected 3");
                color.colorr();
                break;
            case 4:
            System.out.println("Item selected 4");
            delete.deletecar();
            break;
            case 5:
            System.out.println("Item selected 5");
            output.printTable();
            break;
            case 6:
            System.out.println("Item selected 6");
            System.exit(0);
            break;
            default:
                System.out.println("wrong choice");
                break;
    }
    } while (choice != 6);
}
}