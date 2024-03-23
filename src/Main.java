import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


//        CreateNewFile02 createNewFile02 = new CreateNewFile02();
//        createNewFile02.createNewFile();
//        createNewFile02.writeUserInputToFile();
//        System.out.println(createNewFile02.readFromFile("src/Task01File/testTask01"));
//        createNewFile02.printFileContentFromInputUser();



        CheckTwoFiles05 checkTwoFiles05 = new CheckTwoFiles05();

        String filePath1 = ("src/test1");
        String filePath2 = ("src/test");

        try {
            if(checkTwoFiles05.areTextFilesEqual(filePath1,filePath2)) {
                System.out.println("Files are the same");
            } else {
                System.out.println("Files aren't the same");
            }
        } catch (IOException ioException) {
            System.out.println("Error I can't read the files..." + ioException.getMessage());
        }

    }
}