import java.io.*;

public class InvertTextToFile06 {
    public boolean invertFile(String inputFilePath, String outputFilePath) {
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            //Odczytywanie zawartosci pliku:
            String readLine = reader.readLine();
            StringBuilder content = new StringBuilder();
            while (readLine != null) {
                content.append(readLine).append("\n");
                readLine = reader.readLine();
            }
            // odwracanie tekstu
            String[] words = content.toString().trim().split("\\s+");
            StringBuilder reversedContent = new StringBuilder();
            for(int i = words.length - 1; i >= 0; i--) {
                reversedContent.append(words[i]).append(" ");
            }
            //zapis pliku
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write(reversedContent.toString().trim());
            writer.close();
            return true;

        } catch (IOException ioException) {
            ioException.printStackTrace();
            return false;
        }
    }

//
//    public boolean invertFile(String filepath) {
//        // Otwieranie pliku do odczytu przy uzyciu try a w nim Buffer...
//        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
//            //Odczytywanie zawartosci pliku:
//            String readLine = reader.readLine();
//            StringBuilder content = new StringBuilder();
//            while (readLine != null) {
//                content.append(readLine).append("\n");
//                readLine = reader.readLine();
//            }
//            // odwracanie tekstu
//            String[] words = content.toString().trim().split("\\s+");
//            StringBuilder reversedContent = new StringBuilder();
//            for(int i = words.length - 1; i >= 0; i--) {
//                reversedContent.append(words[i]).append(" ");
//            }
//            //zapis pliku
//            BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
//            writer.write(reversedContent.toString().trim());
//            writer.close();
//            return true;
//
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//            return false;
//        }
//

//    }

    // wykorzystac kod z poprzednich metod .


    // Ale jest jeszcze inna sprawa mozna zapisywac tez odwrocony tekst do innego pliku:


}


//   Napisz program, który przyjmie ścieżkę do pliku, a następnie wczyta jego zawartość i zapisze do nowego pliku jego zawartość w odwróconej kolejności
//   (np. plik 1 ma zawartość “Ala ma kota.”, wynikiem metody będzie powstanie pliku, który zawiera w sobie “.kota ma Ala”). W przypadku sukcesu zwróć true,
//    w przypadku niepowodzenia zwróć false:
//    public boolean invertFile(String filepath)
//    [BONUS] Napisz test do ćwiczenia 6 tworząc pliki w strukturze projektu (czyli w plikach projektu, np. tworząc nowy folder). Przetestuj, czy jeśli operacja
//    zakończy się powodzeniem, zawartość wytworzonego pliku jest zgodna z oczekiwaniami.