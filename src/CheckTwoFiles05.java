import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CheckTwoFiles05 {

    public boolean areTextFilesEqual(String filePath1, String filePath2) throws IOException {

        Scanner sc1 = new Scanner(filePath1);
        Scanner sc2 = new Scanner(filePath2);

        while (sc1.hasNextLine() && sc2.hasNextLine()) {
            String line1 = sc1.nextLine();
            String line2 = sc2.nextLine();

            if(!line1.equals(line2)) {
                sc1.close();
                sc2.close();
                return false;
            }
        }

        boolean result = !sc1.hasNextLine() && sc2.hasNextLine();
        sc1.close();
        sc2.close();
        return result;

    }
}



//Napisz program, który sprawdzi, czy 2 pliki tekstowe mają taką samą zawartość:
//public boolean areTextFilesEqual(String filePath1, String filePath2);