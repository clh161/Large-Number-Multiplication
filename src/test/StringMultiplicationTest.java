import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * @author Jacob Ho
 */
public class StringMultiplicationTest {
    @Test
    public void sum() throws Exception {
        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            int a = getRandomIntMax();
            int b = getRandomIntMax();
            String sumSring = StringMultiplication.sum(String.valueOf(a), String.valueOf(b));
            assertEquals(a + "+" + b, String.valueOf(a + b), sumSring);
        }
    }


    private int getRandomIntMax() {
        Random r = new Random();
        return r.nextInt((int) Math.sqrt(Integer.MAX_VALUE));
    }

}