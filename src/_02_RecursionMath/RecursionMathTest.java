package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(81, RecursionMath.recursiveMultiplication(9, 9));

        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
        assertEquals(6, RecursionMath.recursiveDivision(12, 2));
        assertEquals(2, RecursionMath.recursiveDivision(24, 12));

    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
        assertEquals(8, RecursionMath.recursivePower(2, 3));
        assertEquals(16, RecursionMath.recursivePower(4, 2));

    	
    	
    	
    }
    
}
