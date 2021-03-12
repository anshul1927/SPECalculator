import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Factorial {

    private Calculator calculator;


    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void factOne() {
        assertEquals("testcase 1", java.util.Optional.of(120), calculator.calcfact(5));
        ;
    }

    @Test
    public void factTwo() {
        assertFalse("testcase 2", 120 == calculator.calcfact(6));
        ;
    }

    @Test(expected = IllegalArgumentException.class)
    public void factNegatve() {
        long f = -1;
        calculator.calcfact(-1);
    }
}
