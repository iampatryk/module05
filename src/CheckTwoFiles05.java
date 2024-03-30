import java.io.*;
import java.util.Scanner;

public class CheckTwoFiles05 {

    public boolean areTextFilesEqual(String filePath1, String filePath2) {

        File file1 = new File(filePath1);
        File file2 = new File(filePath2);
        if(!file1.exists() || !file2.exists()) {
            System.out.println("File not exists. ");
            return false;
        }

        try (BufferedReader reader1 = new BufferedReader(new FileReader(filePath1));
             BufferedReader reader2 = new BufferedReader(new FileReader(filePath2))) {

            String line1 = reader1.readLine();
            String line2 = reader2.readLine();

            while (line1 !=null && line2 !=null) {
                if (!line1.equals(line2)) {
                    return false;
                }
                line1 = reader1.readLine();
                line2 = reader2.readLine();
            }
            return line1 == null && line2 == null;

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