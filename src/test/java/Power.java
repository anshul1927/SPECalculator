import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Power {

    private Calculator calculator;


    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void power() {
        assertTrue("testcase 3", 16.0 == calculator.calcpower(4, 2));
        ;
    }
}
