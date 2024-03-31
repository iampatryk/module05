package task5and6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class FilesAction {

        public void createFile(String fileName) {

            File file = new File("src/" + fileName);

            try {
                if(file.createNewFile()) {
                    System.out.println("Save success!");
                } else {
                    System.out.println("Try again!");
                }
            } catch (FileAlreadyExistsException existsException) {
                System.out.println("File with this name already exist, Your text will be save to this file. ");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

        public void saveTextToFile(String fileName, String newText) {

            try(FileWriter fileWriter = new FileWriter("src/" + fileName);) {
                fileWriter.write(newText);
                fileWriter.close();
                System.out.println("Text save successfully!");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }

}
