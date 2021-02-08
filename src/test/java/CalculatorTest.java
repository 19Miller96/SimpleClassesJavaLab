import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void subtract() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void multiply() {
        assertEquals(10, calculator.multiply(10, 1));
    }

    @Test
    public void divide() {
        assertEquals(10.00, calculator.divide(100.00, 10.00), 0.0);
    }

}
