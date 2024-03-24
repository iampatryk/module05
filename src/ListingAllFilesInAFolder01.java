import java.io.File;

public class ListingAllFilesInAFolder01 {

    public void printDirectory(String directoryPath) {
        // create object for directory
        File directory = new File(directoryPath);
        // check if directory exist and if is directory
        if(directory.exists() && directory.isDirectory()) {
            // load list files of directory
            File[] files = directory.listFiles();
            // Iterate files and print names
            for(File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Entered directory doesn't exist. ");
        }

    }
}

