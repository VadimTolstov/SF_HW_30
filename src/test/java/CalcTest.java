import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    int a = 2;
    int b = 2;

    @Test
    public void testCalculatorAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);
        assertEquals(4, result);
        int result2 = calculator.minus(a, b);
        assertEquals(0, result2);
    }

    @Test
    public void testCalculatorMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(a, b);
        assertEquals(4, result);
    }

    @Test
    public void testCalculatorDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(a, b);
        assertEquals(1, result);
    }
}