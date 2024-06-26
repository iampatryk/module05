import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class CreateNewFile02 {


    public void createNewFile() {
    // tworzenie pliku o nazwie jaka poda urzytkownik
        Scanner sc = new Scanner(System.in);
        System.out.println("Entry file name: ");
        String nameNewFile = sc.nextLine();

        File file = new File("src/" + nameNewFile);

        try {
            if(file.createNewFile()) {
                System.out.println("Save success!");
            } else {
                System.out.println("Try again!");
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public boolean writeUserInputToFile() {
    // Zapis danych jakie poda urzytkownik do pliku. + BONUS
        Scanner sc = new Scanner(System.in);
        System.out.println("Entry text to save in file: ");
        String textToSave = sc.nextLine();

        File file = new File("src/testFile001.txt");

        try (FileWriter writer = new FileWriter(file); BufferedWriter bufferedWriter = new BufferedWriter(writer);) {

            String[] words = textToSave.split("\\s+");
            int wordsCount = 0;
            for(String word : words) {
                writer.write(word);
                wordsCount++;
                if(wordsCount == 4) {
                    writer.write("\n");
                    wordsCount = 0;
                } else {
                    writer.write(" ");
                }
            }
            bufferedWriter.flush();
            return true;
        } catch (IOException ioException) {
            ioException.printStackTrace();
            return false;
        }
    }

    public String readFromFile(String fileName) {
    // Odczyt danych z pliku.
        String text;

        File file = new File(fileName);
        StringBuilder builder = new StringBuilder();

        try(FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);) {

            text = bufferedReader.readLine();
            while (text != null) {
                builder.append(text);
                text = bufferedReader.readLine();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return builder.toString();
    }

    public void printFileContentFromInputUser() {
    // drukowanie danych z pliku jaki poda uzytkownik
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String fileName = sc.nextLine();

        String fileContent = readFromFile(fileName);

        if(fileContent != null) {
            System.out.println("File content: " + fileContent);
        } else {
            System.out.println("Can't read file...");
        }
    }



//    public void printFileContentFromInput(String fileName) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter file name: ");
//        String fileName = sc.nextLine();
//
//        String fileContent = readFromFile(fileName);
//
//        if(fileContent != null) {
//            System.out.println("File content: " + fileContent);
//        } else {
//            System.out.println("Can't read file...");
//        }
//    }


}





//Napisz metodę, która stworzy nowy plik, o nazwie nadanej przez użytkownika i zapisze do niego treść tekstu, który wprowadzi użytkownik. Jeśli operacja zakończy
//się sukcesem, zwróć true, jeśli nie, zwróć false. Następnie dodaj metodę, która przyjmie w argumencie nazwę pliku (nie musi być podana przez użytkownika) i wydrukuje jego zawartość.
//Metody:
//public boolean writeUserInputToFile();
//public void readFromFile(String fileName);
//Bonus: Przy zapisaniu co 4 słowo wstawiaj znak nowej linii do zapisywanego pliku.