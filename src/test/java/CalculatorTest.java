import static org.junit.Assert.*;
import org.junit.Test;
import Calculator.Calculator;
public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void squareRootTruePositive() {
        assertEquals("Finding square root number for True positive", 5.0, calculator.squareRoot(25), DELTA);
        assertEquals("Finding square root number for True positive", 3.0, calculator.squareRoot(9), DELTA);
    }

    @Test
    public void squareRootTrueNegative() {
        assertNotEquals("Finding square root number for True Negative", 5.0, calculator.squareRoot(144), DELTA);
        assertNotEquals("Finding square root number for True Negative", 3.0, calculator.squareRoot(1000), DELTA);
    }



}
