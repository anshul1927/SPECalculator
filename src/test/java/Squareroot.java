import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Squareroot {

    private Calculator calculator;


    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void sqrt()
    {
        assertTrue("testcase 1", 4.0 == calculator.calcsqroot(16.0));
        ;
    }

    @Test(expected = IllegalArgumentException.class)
    public void sqrtNegatve() {
        long f = -1;
        calculator.calcsqroot(-1.0);
    }
}
