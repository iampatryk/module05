import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCheckTwoFiles {

    @Test
    public void testAreTextFilesEqualsReturnTrue() {
        CheckTwoFiles05 checkTwoFiles05 = new CheckTwoFiles05();
        String filePath1 = ("src/test1");
        String filePath2 = ("src/test2out");
        Assertions.assertTrue(checkTwoFiles05.areTextFilesEqual(filePath1,filePath2));
    }
    @Test
    public void testAreTextFilesEqualsReturnFalse() {
        CheckTwoFiles05 checkTwoFiles05 = new CheckTwoFiles05();
        String filePath1 = ("src/test1");
        String filePath2 = ("src/test22out");
        Assertions.assertFalse(checkTwoFiles05.areTextFilesEqual(filePath1,filePath2));
    }

    // mozna jeszcze dopisac testy czy plik jest pusty lub czy plik istnieje jesli tak true jak nie false.





}
