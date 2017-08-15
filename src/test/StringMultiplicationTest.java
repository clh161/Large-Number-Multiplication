import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * @author Jacob Ho
 */
public class StringMultiplicationTest {
    private final int mTestCaseCount = 10000;

    @Test
    public void sum() throws Exception {
        for (int i = 0; i < mTestCaseCount; i++) {
            int a = getRandomIntMax();
            int b = getRandomIntMax();
            String sumSring = StringMultiplication.sum(String.valueOf(a), String.valueOf(b));
            assertEquals(a + "+" + b, String.valueOf(a + b), sumSring);
        }
    }

    @Test
    public void maxOf() throws Exception {
        for (int i = 0; i < mTestCaseCount; i++) {
            int a = getRandomIntMax();
            int b = getRandomIntMax();
            int actualResult = StringMultiplication.maxOf(String.valueOf(a), String.valueOf(b));
            int actualResult2 = StringMultiplication.maxOf(String.valueOf(a), String.valueOf(a));
            int expectResult = -1;
            if (a < b)
                expectResult = 1;
            if (b < a)
                expectResult = 0;
            assertEquals(a + " vs " + b, expectResult, actualResult);
            assertEquals(a + " vs " + a, -1, actualResult2);
        }
    }

    private int getRandomIntMax() {
        Random r = new Random();
        return r.nextBoolean() ? -r.nextInt((int) Math.sqrt(Integer.MAX_VALUE)) : r.nextInt((int) Math.sqrt(Integer.MAX_VALUE));
    }


    @Test
    public void minus() throws Exception {
        Random r = new Random();
        for (int i = 0; i < mTestCaseCount; i++) {
            int a = getRandomIntMax();
            int b = getRandomIntMax();
            String sumSring = StringMultiplication.minus(String.valueOf(a), String.valueOf(b));
            assertEquals(a + "-" + b, String.valueOf(a - b), sumSring);
        }
    }

    @Test
    public void product() throws Exception {
        for (int i = 0; i < mTestCaseCount; i++) {
            int a = getRandomIntMax();
            int b = getRandomIntMax();
            String sumSring = StringMultiplication.product(String.valueOf(a), String.valueOf(b));
            assertEquals(a + " x " + b, String.valueOf(a * b), sumSring);
        }
    }

    @Test
    public void removeZero() throws Exception {
        assertEquals("0", StringMultiplication.removeZero("00000"));
        assertEquals("10", StringMultiplication.removeZero("00010"));
    }

    @Test
    public void productOftenToPower() throws Exception {
        assertEquals("123000", StringMultiplication.productOftenToPower("123", 3));
        assertEquals("10", StringMultiplication.productOftenToPower("1", 1));
    }
}