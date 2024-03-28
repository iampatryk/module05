import java.io.*;
import java.util.Scanner;

public class CheckTwoFiles05 {

    public boolean areTextFilesEqual(String filePath1, String filePath2) {

        try (BufferedReader reader1 = new BufferedReader(new FileReader(filePath1));
             BufferedReader reader2 = new BufferedReader(new FileReader(filePath2))) {

            String line1, line2;
            int lineNumber = 1;

            while (true) {
                line1 = reader1.readLine();
                line2 = reader2.readLine();

                // Jeśli jedna z linii jest null, to sprawdzamy czy obie są null
                if (line1 == null || line2 == null) {
                    return line1 == line2;
                    // Zwracamy true, jeśli obie linie są null, w przeciwnym razie false
                }

                lineNumber++;

                if (!line1.equals(line2)) {
                    return false;
                }
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
            return false;
        }
    }
}


// zmienic warunek While(true)
// walidacje czy jest plikiem i czy istnieje


//Napisz program, który sprawdzi, czy 2 pliki tekstowe mają taką samą zawartość:
//public boolean areTextFilesEqual(String filePath1, String filePath2);