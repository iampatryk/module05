import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class TestInvert {

    @Test
        public void testInvert() throws IOException {

        InvertTextToFile06 invertText = new InvertTextToFile06();

        String inputFilePath = "src/test2";
        String outputFilePath = "src/test22out";
        String expected = "brazowego i kota czarnego ma Ala";

        boolean result = invertText.invertFile(inputFilePath,outputFilePath);

        Assertions.assertTrue(result);

        String output = new String(Files.readAllBytes(Paths.get(outputFilePath)));

        Assertions.assertEquals(expected, output.trim());

    }

}
