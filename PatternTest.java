// PatternTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PatternTest {

    // Helper method to capture console output
    private String captureOutput(Runnable task) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        task.run();
        System.setOut(originalOut);
        return outputStream.toString().trim();
    }

    @Test
    public void testSquarePattern() {
        String expected = "****\n****\n****\n****";
        assertEquals(expected, captureOutput(() -> Pattern.printSquarePattern(4)));
    }

    @Test
    public void testTrianglePattern() {
        String expected = "****\n***\n**\n*";
        assertEquals(expected, captureOutput(() -> Pattern.printTrianglePattern(4)));
    }

    @Test
    public void testTrianglePatternEvenNum() {
        String expected = "*\n*2\n*2*\n*2*4";
        assertEquals(expected, captureOutput(() -> Pattern.printTrianglePatternEvenNum(4)));
    }

    @Test
    public void testTrianglePatternNum() {
        String expected = "1\n1*\n1*2\n1*2*3";
        assertEquals(expected, captureOutput(() -> Pattern.printTrianglePatternNum(4)));
    }

    @Test
    public void testLeftTrianglePattern() {
        String expected = "    *\n   **\n  ***\n ****\n*****";
        assertEquals(expected, captureOutput(() -> Pattern.printLeftTrianglePattern(5)));
    }

    @Test
    public void testRightDownTrianglePattern() {
        String expected = "****\n ***\n  **\n   *";
        assertEquals(expected, captureOutput(() -> Pattern.printRightDownTrianglePattern(4)));
    }
}
