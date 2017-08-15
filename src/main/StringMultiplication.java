import java.util.HashMap;
import java.util.Map;

/**
 * @author Jacob Ho
 */
public class StringMultiplication {
    private static final Map<String, Integer> COMPARISON_MAP = new HashMap<>();
    private static final Map<String, Map<String, String>> PRODUCT_MAP = new HashMap<>();
    private static final Map<String, Map<String, String>> SUM_MAP = new HashMap<>();
    private static final Map<String, Map<String, String>> MINUS_MAP = new HashMap<>();

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

    static {
        Map<String, String> map0 = new HashMap<>();
        map0.put("0", "0");
        map0.put("1", "0");
        map0.put("2", "0");
        map0.put("3", "0");
        map0.put("4", "0");
        map0.put("5", "0");
        map0.put("6", "0");
        map0.put("7", "0");
        map0.put("8", "0");
        map0.put("9", "0");
        PRODUCT_MAP.put("0", map0);
        Map<String, String> map1 = new HashMap<>();
        map1.put("0", "0");
        map1.put("1", "1");
        map1.put("2", "2");
        map1.put("3", "3");
        map1.put("4", "4");
        map1.put("5", "5");
        map1.put("6", "6");
        map1.put("7", "7");
        map1.put("8", "8");
        map1.put("9", "9");
        PRODUCT_MAP.put("1", map1);
        Map<String, String> map2 = new HashMap<>();
        map2.put("0", "0");
        map2.put("1", "2");
        map2.put("2", "4");
        map2.put("3", "6");
        map2.put("4", "8");
        map2.put("5", "10");
        map2.put("6", "12");
        map2.put("7", "14");
        map2.put("8", "16");
        map2.put("9", "18");
        PRODUCT_MAP.put("2", map2);
        Map<String, String> map3 = new HashMap<>();
        map3.put("0", "0");
        map3.put("1", "3");
        map3.put("2", "6");
        map3.put("3", "9");
        map3.put("4", "12");
        map3.put("5", "15");
        map3.put("6", "18");
        map3.put("7", "21");
        map3.put("8", "24");
        map3.put("9", "27");
        PRODUCT_MAP.put("3", map3);
        Map<String, String> map4 = new HashMap<>();
        map4.put("0", "0");
        map4.put("1", "4");
        map4.put("2", "8");
        map4.put("3", "12");
        map4.put("4", "16");
        map4.put("5", "20");
        map4.put("6", "24");
        map4.put("7", "28");
        map4.put("8", "32");
        map4.put("9", "36");
        PRODUCT_MAP.put("4", map4);
        Map<String, String> map5 = new HashMap<>();
        map5.put("0", "0");
        map5.put("1", "5");
        map5.put("2", "10");
        map5.put("3", "15");
        map5.put("4", "20");
        map5.put("5", "25");
        map5.put("6", "30");
        map5.put("7", "35");
        map5.put("8", "40");
        map5.put("9", "45");
        PRODUCT_MAP.put("5", map5);
        Map<String, String> map6 = new HashMap<>();
        map6.put("0", "0");
        map6.put("1", "6");
        map6.put("2", "12");
        map6.put("3", "18");
        map6.put("4", "24");
        map6.put("5", "30");
        map6.put("6", "36");
        map6.put("7", "42");
        map6.put("8", "48");
        map6.put("9", "54");
        PRODUCT_MAP.put("6", map6);
        Map<String, String> map7 = new HashMap<>();
        map7.put("0", "0");
        map7.put("1", "7");
        map7.put("2", "14");
        map7.put("3", "21");
        map7.put("4", "28");
        map7.put("5", "35");
        map7.put("6", "42");
        map7.put("7", "49");
        map7.put("8", "56");
        map7.put("9", "63");
        PRODUCT_MAP.put("7", map7);
        Map<String, String> map8 = new HashMap<>();
        map8.put("0", "0");
        map8.put("1", "8");
        map8.put("2", "16");
        map8.put("3", "24");
        map8.put("4", "32");
        map8.put("5", "40");
        map8.put("6", "48");
        map8.put("7", "56");
        map8.put("8", "64");
        map8.put("9", "72");
        PRODUCT_MAP.put("8", map8);
        Map<String, String> map9 = new HashMap<>();
        map9.put("0", "0");
        map9.put("1", "9");
        map9.put("2", "18");
        map9.put("3", "27");
        map9.put("4", "36");
        map9.put("5", "45");
        map9.put("6", "54");
        map9.put("7", "63");
        map9.put("8", "72");
        map9.put("9", "81");
        PRODUCT_MAP.put("9", map9);
    }

    static {
        Map<String, String> map0 = new HashMap<>();
        map0.put("0", "0");
        map0.put("1", "1");
        map0.put("2", "2");
        map0.put("3", "3");
        map0.put("4", "4");
        map0.put("5", "5");
        map0.put("6", "6");
        map0.put("7", "7");
        map0.put("8", "8");
        map0.put("9", "9");
        SUM_MAP.put("0", map0);
        Map<String, String> map1 = new HashMap<>();
        map1.put("0", "1");
        map1.put("1", "2");
        map1.put("2", "3");
        map1.put("3", "4");
        map1.put("4", "5");
        map1.put("5", "6");
        map1.put("6", "7");
        map1.put("7", "8");
        map1.put("8", "9");
        map1.put("9", "10");
        SUM_MAP.put("1", map1);
        Map<String, String> map2 = new HashMap<>();
        map2.put("0", "2");
        map2.put("1", "3");
        map2.put("2", "4");
        map2.put("3", "5");
        map2.put("4", "6");
        map2.put("5", "7");
        map2.put("6", "8");
        map2.put("7", "9");
        map2.put("8", "10");
        map2.put("9", "11");
        SUM_MAP.put("2", map2);
        Map<String, String> map3 = new HashMap<>();
        map3.put("0", "3");
        map3.put("1", "4");
        map3.put("2", "5");
        map3.put("3", "6");
        map3.put("4", "7");
        map3.put("5", "8");
        map3.put("6", "9");
        map3.put("7", "10");
        map3.put("8", "11");
        map3.put("9", "12");
        SUM_MAP.put("3", map3);
        Map<String, String> map4 = new HashMap<>();
        map4.put("0", "4");
        map4.put("1", "5");
        map4.put("2", "6");
        map4.put("3", "7");
        map4.put("4", "8");
        map4.put("5", "9");
        map4.put("6", "10");
        map4.put("7", "11");
        map4.put("8", "12");
        map4.put("9", "13");
        SUM_MAP.put("4", map4);
        Map<String, String> map5 = new HashMap<>();
        map5.put("0", "5");
        map5.put("1", "6");
        map5.put("2", "7");
        map5.put("3", "8");
        map5.put("4", "9");
        map5.put("5", "10");
        map5.put("6", "11");
        map5.put("7", "12");
        map5.put("8", "13");
        map5.put("9", "14");
        SUM_MAP.put("5", map5);
        Map<String, String> map6 = new HashMap<>();
        map6.put("0", "6");
        map6.put("1", "7");
        map6.put("2", "8");
        map6.put("3", "9");
        map6.put("4", "10");
        map6.put("5", "11");
        map6.put("6", "12");
        map6.put("7", "13");
        map6.put("8", "14");
        map6.put("9", "15");
        SUM_MAP.put("6", map6);
        Map<String, String> map7 = new HashMap<>();
        map7.put("0", "7");
        map7.put("1", "8");
        map7.put("2", "9");
        map7.put("3", "10");
        map7.put("4", "11");
        map7.put("5", "12");
        map7.put("6", "13");
        map7.put("7", "14");
        map7.put("8", "15");
        map7.put("9", "16");
        SUM_MAP.put("7", map7);
        Map<String, String> map8 = new HashMap<>();
        map8.put("0", "8");
        map8.put("1", "9");
        map8.put("2", "10");
        map8.put("3", "11");
        map8.put("4", "12");
        map8.put("5", "13");
        map8.put("6", "14");
        map8.put("7", "15");
        map8.put("8", "16");
        map8.put("9", "17");
        SUM_MAP.put("8", map8);
        Map<String, String> map9 = new HashMap<>();
        map9.put("0", "9");
        map9.put("1", "10");
        map9.put("2", "11");
        map9.put("3", "12");
        map9.put("4", "13");
        map9.put("5", "14");
        map9.put("6", "15");
        map9.put("7", "16");
        map9.put("8", "17");
        map9.put("9", "18");
        SUM_MAP.put("9", map9);
    }

    static {
        Map<String, String> map0 = new HashMap<>();
        map0.put("0", "0");
        map0.put("1", "-1");
        map0.put("2", "-2");
        map0.put("3", "-3");
        map0.put("4", "-4");
        map0.put("5", "-5");
        map0.put("6", "-6");
        map0.put("7", "-7");
        map0.put("8", "-8");
        map0.put("9", "-9");
        MINUS_MAP.put("0", map0);
        Map<String, String> map1 = new HashMap<>();
        map1.put("0", "1");
        map1.put("1", "0");
        map1.put("2", "-1");
        map1.put("3", "-2");
        map1.put("4", "-3");
        map1.put("5", "-4");
        map1.put("6", "-5");
        map1.put("7", "-6");
        map1.put("8", "-7");
        map1.put("9", "-8");
        MINUS_MAP.put("1", map1);
        Map<String, String> map2 = new HashMap<>();
        map2.put("0", "2");
        map2.put("1", "1");
        map2.put("2", "0");
        map2.put("3", "-1");
        map2.put("4", "-2");
        map2.put("5", "-3");
        map2.put("6", "-4");
        map2.put("7", "-5");
        map2.put("8", "-6");
        map2.put("9", "-7");
        MINUS_MAP.put("2", map2);
        Map<String, String> map3 = new HashMap<>();
        map3.put("0", "3");
        map3.put("1", "2");
        map3.put("2", "1");
        map3.put("3", "0");
        map3.put("4", "-1");
        map3.put("5", "-2");
        map3.put("6", "-3");
        map3.put("7", "-4");
        map3.put("8", "-5");
        map3.put("9", "-6");
        MINUS_MAP.put("3", map3);
        Map<String, String> map4 = new HashMap<>();
        map4.put("0", "4");
        map4.put("1", "3");
        map4.put("2", "2");
        map4.put("3", "1");
        map4.put("4", "0");
        map4.put("5", "-1");
        map4.put("6", "-2");
        map4.put("7", "-3");
        map4.put("8", "-4");
        map4.put("9", "-5");
        MINUS_MAP.put("4", map4);
        Map<String, String> map5 = new HashMap<>();
        map5.put("0", "5");
        map5.put("1", "4");
        map5.put("2", "3");
        map5.put("3", "2");
        map5.put("4", "1");
        map5.put("5", "0");
        map5.put("6", "-1");
        map5.put("7", "-2");
        map5.put("8", "-3");
        map5.put("9", "-4");
        MINUS_MAP.put("5", map5);
        Map<String, String> map6 = new HashMap<>();
        map6.put("0", "6");
        map6.put("1", "5");
        map6.put("2", "4");
        map6.put("3", "3");
        map6.put("4", "2");
        map6.put("5", "1");
        map6.put("6", "0");
        map6.put("7", "-1");
        map6.put("8", "-2");
        map6.put("9", "-3");
        MINUS_MAP.put("6", map6);
        Map<String, String> map7 = new HashMap<>();
        map7.put("0", "7");
        map7.put("1", "6");
        map7.put("2", "5");
        map7.put("3", "4");
        map7.put("4", "3");
        map7.put("5", "2");
        map7.put("6", "1");
        map7.put("7", "0");
        map7.put("8", "-1");
        map7.put("9", "-2");
        MINUS_MAP.put("7", map7);
        Map<String, String> map8 = new HashMap<>();
        map8.put("0", "8");
        map8.put("1", "7");
        map8.put("2", "6");
        map8.put("3", "5");
        map8.put("4", "4");
        map8.put("5", "3");
        map8.put("6", "2");
        map8.put("7", "1");
        map8.put("8", "0");
        map8.put("9", "-1");
        MINUS_MAP.put("8", map8);
        Map<String, String> map9 = new HashMap<>();
        map9.put("0", "9");
        map9.put("1", "8");
        map9.put("2", "7");
        map9.put("3", "6");
        map9.put("4", "5");
        map9.put("5", "4");
        map9.put("6", "3");
        map9.put("7", "2");
        map9.put("8", "1");
        map9.put("9", "0");
        MINUS_MAP.put("9", map9);
    }

    private StringMultiplication() {
    }

    public static String product(String x, String y) {
        boolean isXNegative = x.startsWith("-");
        boolean isYNegative = y.startsWith("-");
        if (isXNegative)
            x = x.substring(1);
        if (isYNegative)
            y = y.substring(1);
        if (x.equals("0") || y.equals("0"))
            return "0";
        if (x.length() == 1 && y.length() == 1) {
            return PRODUCT_MAP.get(x).get(y);
        }
        int power = (x.length() > y.length() ? x.length() : y.length()) / 2;
        String a, b, c, d;
        if (x.length() > power) {
            a = x.substring(0, x.length() - power);
            b = x.substring(x.length() - power);
        } else {
            a = "0";
            b = x;
        }
        if (y.length() > power) {
            c = y.substring(0, y.length() - power);
            d = y.substring(y.length() - power);
        } else {
            c = "0";
            d = removeZero(y);
        }
        a = removeZero(a);
        b = removeZero(b);
        c = removeZero(c);
        d = removeZero(d);

        String ac = product(a, c);
        String bd = product(b, d);
        String produceOfSum = product(sum(a, b), sum(c, d));
        String difference = minus(minus(produceOfSum, ac), bd);
        String result = sum(sum(productOftenToPower(ac, power * 2), bd), productOftenToPower(difference, power));
        return isXNegative == isYNegative ? removeZero(result) : "-" + removeZero(result);
    }

    public static String removeZero(String s) {
        while (s.startsWith("0")) {
            s = s.substring(1);
        }
        if (s.isEmpty())
            return "0";
        return s;
    }

    public static String productOftenToPower(String c, int p) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        for (int i = 0; i < p; i++) {
            stringBuilder.append(0);
        }
        return stringBuilder.toString();
    }

    public static String tenToPower(int p) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);
        for (int i = 0; i < p; i++) {
            stringBuilder.append(0);
        }
        return stringBuilder.toString();
    }

    public static String sum(String x, String y) {
        if (x.startsWith("-"))
            return minus(y, x.substring(1));
        if (y.startsWith("-"))
            return minus(x, y.substring(1));
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
            if (ai.equals("-"))
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
