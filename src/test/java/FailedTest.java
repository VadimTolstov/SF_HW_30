
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FailedTest {

    int a = 16;
    int b = 2;

    @Test
    public void testCalculatorAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.minus(a, b);
        assertEquals(4, result);
        int result2 = calculator.divide(a, b);
        assertEquals(7, result2);
    }

}