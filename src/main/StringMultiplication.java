import java.util.HashMap;
import java.util.Map;

/**
 * @author Jacob Ho
 */
public class StringMultiplication {
    public static final Map<String, Integer> COMPARISON_MAP = new HashMap<>();

    static {
        COMPARISON_MAP.put("0", 0);
        COMPARISON_MAP.put("1", 1);
        COMPARISON_MAP.put("2", 2);
        COMPARISON_MAP.put("3", 3);
        COMPARISON_MAP.put("4", 4);
        COMPARISON_MAP.put("5", 5);
        COMPARISON_MAP.put("6", 6);
        COMPARISON_MAP.put("7", 7);
        COMPARISON_MAP.put("8", 8);
        COMPARISON_MAP.put("9", 9);
    }

    private StringMultiplication() {
    }

    public static String sum(String x, String y) {
        StringBuilder sb = new StringBuilder();
        boolean hasIncrease = false;
        for (int i = 0; i < Math.max(x.length(), y.length()); i++) {
            if (i < x.length() && i < y.length()) {
                int intX = Integer.parseInt(x.substring(x.length() - i - 1, x.length() - i));
                int intY = Integer.parseInt(y.substring(y.length() - i - 1, y.length() - i));
                int s = intX + intY;
                if (hasIncrease)
                    s++;
                sb.insert(0, s % 10);
                hasIncrease = s > 9;
            } else if (i < x.length()) {
                int intX = Integer.parseInt(x.substring(x.length() - i - 1, x.length() - i));
                if (hasIncrease)
                    intX++;
                sb.insert(0, intX % 10);
                hasIncrease = intX > 9;
            } else {
                int intY = Integer.parseInt(y.substring(y.length() - i - 1, y.length() - i));
                if (hasIncrease)
                    intY++;
                sb.insert(0, intY % 10);
                hasIncrease = intY > 9;
            }
        }
        if (hasIncrease)
            sb.insert(0, 1);
        return sb.toString();
    }

    public static String minus(String x, String y) {
        if (x.startsWith("-") && y.startsWith("-"))
            return "-" + sum(x.replace("-", ""), y.replace("-", ""));
        if (y.startsWith("-"))
            return sum(x, y.replace("-", ""));
        if (x.startsWith("-"))
            return "-" + sum(x.replace("-", ""), y);
        //Cases for two positive
        int max = maxOf(x, y);
        if (max == -1)
            return "0";
        String bigger = x;
        String smaller = y;
        if (max == 1) {
            bigger = y;
            smaller = x;
        }
        StringBuilder sb = new StringBuilder();
        boolean hasDecrease = false;
        for (int i = 0; i < Math.max(bigger.length(), smaller.length()); i++) {
            if (i < bigger.length() && i < smaller.length()) {
                int intBigger = Integer.parseInt(bigger.substring(bigger.length() - i - 1, bigger.length() - i));
                int intSmaller = Integer.parseInt(smaller.substring(smaller.length() - i - 1, smaller.length() - i));
                int s = intBigger - intSmaller;
                if (hasDecrease)
                    s--;
                sb.insert(0, s < 0 ? s + 10 : s);
                hasDecrease = s < 0;
            } else if (i < smaller.length()) {
                int intSmaller = Integer.parseInt(smaller.substring(smaller.length() - i - 1, smaller.length() - i));
                intSmaller = 10 - intSmaller;
                if (hasDecrease)
                    intSmaller--;
                sb.insert(0, intSmaller < 0 ? intSmaller + 10 : intSmaller);
                hasDecrease = intSmaller < 0;
            } else {
                int intBigger = Integer.parseInt(bigger.substring(bigger.length() - i - 1, bigger.length() - i));
                if (hasDecrease)
                    intBigger--;
                if (intBigger == -1) {
                    intBigger = 9;
                    hasDecrease = true;
                } else {
                    hasDecrease = false;
                }
                sb.insert(0, intBigger);
            }
        }
        String string = sb.toString();
        while (string.startsWith("0") && string.length() > 1)
            string = string.substring(1, string.length());
        if (max == 1)
            string = "-" + string;
        return string;
    }

    public static int maxOf(String a, String b) {
        //compare +/-
        if (a.startsWith("-") && !b.startsWith("-"))
            return 1;
        if (!a.startsWith("-") && b.startsWith("-"))
            return 0;
        //Cases for either both + or -
        //Compare length
        if (a.length() > b.length())
            return a.startsWith("-") ? 1 : 0;
        if (a.length() < b.length())
            return a.startsWith("-") ? 0 : 1;
        //Cases for either both + or - and same length
        for (int i = 0; i < a.length(); i++) {
            String ai = a.substring(i, i + 1);
            if (ai.equals("="))
                continue;
            String bi = b.substring(i, i + 1);
            if (COMPARISON_MAP.get(ai) < COMPARISON_MAP.get(bi))
                return a.startsWith("-") ? 0 : 1;
            if (COMPARISON_MAP.get(ai) > COMPARISON_MAP.get(bi))
                return a.startsWith("-") ? 1 : 0;

        }
        return -1;
    }

}
