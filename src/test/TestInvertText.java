//import org.junit.Test;
//import org.junit.jupiter.api.Assertions;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//public class TestInvertText {
//
//    @Test
//    public void testInvert() throws IOException {
//
//        InvertTextToFile06 invertText = new InvertTextToFile06();
//
//        String filepath = "src/test23";
//        String expected = "kota ma Ala";
//
//        boolean result = invertText.invertFile(filepath);
//
//        Assertions.assertTrue(result);
//
//        String output = new String(Files.readAllBytes(Paths.get(filepath)));
//
//        Assertions.assertEquals(expected, output.trim());
//
//    }
//
//    @Test
//    public void testInvert() throws IOException {
//
//        InvertTextToFile06 invertText = new InvertTextToFile06();
//
//        String inputFilePath = "src/test2";
//        String outputFilePath = "src/test22out";
//        String expected = "kota czarnego ma Ala";
//
//        boolean result = invertText.invertFile(inputFilePath,outputFilePath);
//
//        Assertions.assertTrue(result);
//
//        String output = new String(Files.readAllBytes(Paths.get(outputFilePath)));
//
//        Assertions.assertEquals(expected, output.trim());
//
//    }
//
//}
