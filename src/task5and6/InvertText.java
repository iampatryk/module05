package task5and6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InvertText {

    public void invertTextAndSaveToFile(String inputFile, String outputFile) {

        FilesAction filesAction = new FilesAction();

        StringBuilder invertedText = new StringBuilder();

        try(BufferedReader reader = new BufferedReader(new FileReader("src/" + inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s");
                for (int i = words.length - 1; i >= 0; i --) {
                    invertedText.append(words[i]).append(" ");
                } invertedText.append("\n");
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
            return;
        }
//        filesAction.createFile(outputFile);
        filesAction.saveTextToFile(outputFile, invertedText.toString());
    }
}
