import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
        System.out.println("testAddTwoPositiveValues() 10 + 5 must be 15");
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
        System.out.println("testAddTwoNegativeValues() -10 + -5 must be -15");
    }

    //Division
    @Test
    public void testDivisionTwoPositiveValues() {
        assertEquals("10 / 5 must be 2", 2, calc.division(10, 5));
        System.out.println("testDivisionTwoPositiveValues() 10 / 5 must be 2");
    }

    @Test
    public void testDivisionTwoNegativeValues() {
        assertEquals("-10 / -5 must be 2", 2, calc.division(-10, -5));
        System.out.println("testDivisionTwoNegativeValues() -10 / -5 must be 2");
    }

    //Subtraction
    @Test
    public void testSubtractionTwoPositiveValues() {
        assertEquals("10 - 5 must be 5", 5, calc.subtraction(10, 5));
        System.out.println("testSubtractionTwoPositiveValues() 10 - 5 must be 5");
    }

    @Test
    public void testSubtractionTwoNegativeValues() { assertEquals("-10 - (-5) must be -5", -5, calc.subtraction(-10, -5));
        System.out.println("testSubtractionTwoNegativeValues() -10 - (-5) must be -5");}

    //Square
    @Test
    public void testSquareTwoPositiveValues() {
        assertEquals("10 * 5 must be 50", 50, calc.square(10, 5));
        System.out.println("testSquareTwoPositiveValues() 10 * 5 must be 50");
    }

    @Test
    public void testSquareTwoNegativeValues() { assertEquals("-10 * (-5) must be 50", 50, calc.square(-10, -5));
        System.out.println(" testSquareTwoNegativeValues() -10 * (-5) must be 50");}

    //Root
    @Test
    public void testRootPositiveValues() {
        assertEquals("root 16 must be 4", 4.0, calc.root(16));
        System.out.println("testRootPositiveValues() root 16 must be 4");
    }

    // @Test
    // public void testRootNegativeValues() { assertEquals("-10 + -5 must be -15", calc.root(-16)); } impossible


    //mXOR
    @Test
    public void testXORPositiveValues() {
        assertEquals("XOR 10 must be 1024.0", 1024.0, calc.mXOR(10));
        System.out.println("testXORPositiveValues() XOR 10 must be 1024.0");
    }

    @Test
    public void testXORNegativeValues() {
        assertEquals("XOR -10 must be 9.765625E-4", 9.765625E-4, calc.mXOR(-10));
        System.out.println("testXORNegativeValues() XOR -10 must be 9.765625E-4");
    }

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}
