import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Reverse_word_Test{

    @Test
    public void testReverseString() {
        String reversedStr = Reverse_word.reverseString("Hello");
        assertEquals("olleH", reversedStr);
    }
}