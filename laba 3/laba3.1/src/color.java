import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class color {
 // пошук різних кольорів в файлі
    public static void colorr() {
        String fileName = "src\\avto.txt";
        String[] colors = new String[100];
        int i = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.equals("Red")) {
                        colors[i] = "Red";
                        i++;
                    } else if (word.equals("Green")) {
                        colors[i] = "Green";
                        i++;
                    } else if (word.equals("Black")) {
                        colors[i] = "Black";
                        i++;
                    } else if (word.equals("Yellow")) {
                        colors[i] = "Yellow";
                        i++;
                    } else if (word.equals("Blue")) {
                        colors[i] = "Blue";
                        i++;
                    } else if (word.equals("Grey")) {
                        colors[i] = "Grey";
                        i++;
                    } else if (word.equals("Pink")) {
                        colors[i] = "Pink";
                        i++;
                    } else if (word.equals("Purple")) {
                        colors[i] = "Purple";
                        i++;
                    } else if (word.equals("Orange")) {
                        colors[i] = "Orange";
                        i++;
                    } else if (word.equals("White")) {
                        colors[i] = "White";
                        i++;
                    } else if (word.equals("Brown")) {
                        colors[i] = "Brown";
                        i++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
        System.out.println("Кількість кольорів: " + i);
    }

    }

