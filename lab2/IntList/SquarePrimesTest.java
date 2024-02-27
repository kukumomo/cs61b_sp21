package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePirmes_zero(){
        IntList lst = IntList.of(0, 2, 1, 7, 9, 11);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("0 -> 4 -> 1 -> 49 -> 9 -> 121", lst.toString());
        //assertTrue(changed);
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimes_multiOne(){
        IntList lst = IntList.of(0, 1, 0, 1, 1);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("0 -> 1 -> 0 -> 1 -> 1", lst.toString());
        assertFalse(changed);
    }
}
