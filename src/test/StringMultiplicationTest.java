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
        Random r = new Random();
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
        return r.nextInt((int) Math.sqrt(Integer.MAX_VALUE));
    }

}