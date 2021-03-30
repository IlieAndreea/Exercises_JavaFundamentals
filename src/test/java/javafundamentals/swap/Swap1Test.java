package javafundamentals.swap;

import org.junit.Test;
import static org.junit.Assert.*;

public class Swap1Test {

    @Test
    public void testSwapMethod() {
        String result = Swap1.swapMethod();
        assertEquals("a = 25 and b = 15", result);
    }
}
