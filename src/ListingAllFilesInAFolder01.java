import java.io.File;

public class ListingAllFilesInAFolder01 {

    public void printDirectory(String directoryPath) {

//        File folder = new File(directoryPath);
//        for(File file : folder.listFiles()) {
//            System.out.println(file.getName());
//        }

//        File directory = new File(directoryPath);
//        File[] files = directory.listFiles();
//
//        if(files != null) {
//            for(File file : files) {
//                if(file.isFile()) {
//                    System.out.println("File: " + file.getName());
//                } else if(file.isDirectory()) {
//                    System.out.println("Directory: + " + file.getName());
//                }
//            }
//        } else {
//            System.out.println("Can't find file: " + directoryPath);
//        }

//        File folder = new File(directoryPath);
//
//        if(folder.exists() && folder.isDirectory()) {
//            File[] files = folder.listFiles();
//            System.out.println("Files in directory: " + folder.getAbsolutePath());
//
//            if(files != null) {
//                for(File file : files) {
//                    System.out.println(file.getName());
//                }
//            } else {
//                System.out.println("Directory is empty.");
//            }
//        } else {
//            System.out.println("Can't find, try again.");
//        }
    }
}
