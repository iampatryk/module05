package task5and6;

import java.io.File;
import java.io.IOException;

public class FilesAction {

        public void createFile(String fileName) {

//            String fileName = "newFile01";

            File file = new File("src/" + fileName);

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

}
