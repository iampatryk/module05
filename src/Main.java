import task5and6.FilesAction;
import task5and6.InvertText;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


//        ListingAllFilesInAFolder01 taks01 = new ListingAllFilesInAFolder01();
//        taks01.printDirectory("src/");
//
//
//
//        CreateNewFile02 createNewFile02 = new CreateNewFile02();
//        createNewFile02.createNewFile();
//        createNewFile02.writeUserInputToFile();
//        System.out.println(createNewFile02.readFromFile("src/Task01File/testTask01"));
//        createNewFile02.printFileContentFromInputUser();
//
//
//
//        CheckTwoFiles05 checkTwoFiles05 = new CheckTwoFiles05();
//
//        String filePath1 = ("src/test2");
//        String filePath2 = ("src/test22out");
//
//        if (checkTwoFiles05.areTextFilesEqual(filePath1, filePath2)) {
//            System.out.println("Zawartość obu plików jest identyczna.");
//        } else {
//            System.out.println("Pliki różnią się co najmniej w jednym miejscu.");
//        }
//
//

//        InvertTextToFile06 task06 = new InvertTextToFile06();
//
//        String filePath = "src/test2";
//        if(task06.invertFile(filePath)) {
//            System.out.println("File reverse correct.");
//        } else {
//            System.out.println("Error, try again. ");
//        }



//        InvertTextToFile06 task06 = new InvertTextToFile06();
//
//        String inputFilePath = "src/test2";
//        String outputFilePath = "src/test22out";
//        if(task06.invertFile(inputFilePath,outputFilePath)) {
//            System.out.println("File reverse correct.");
//        } else {
//            System.out.println("Error, try again. ");
//        }



//        Rectangle rectangle = new Rectangle(7,8);
//        System.out.println(rectangle.calculateArea());
//
//        Triangle triangle = new Triangle(3,6);
//        System.out.println(triangle.calculateArea());
//
//        Hexagon hexagon = new Hexagon(4);
//        System.out.println(hexagon.calculateArea());
//
//        Square04 dimRectangle = new Square04(5,5);
//        System.out.println("Diameter of Rectangle: " + dimRectangle.calculateDiameter());


        // TASKS 5 & 6
//        FilesAction filesAction = new FilesAction();
//        filesAction.createFile("newFile02");
//        filesAction.saveTextToFile("newFile01","Ala ma czarnego kota.");
//        String fileName = "src/newFile01";
//        filesAction.fileReader(fileName);

        InvertText invertText = new InvertText();
        invertText.invertTextAndSaveToFile("newFile01","newFile03");






    }
}