import java.util.Map;

/**
 * @author Jacob Ho
 */
public class StringMultiplication {
    private static final Map<String, Integer> mComparisonMap = new ComparisonMap();
    private static final Map<String, Map<String, String>> mProductMap = new ProductMap();
    private static final Map<String, Map<String, String>> mSumMap = new SumMap();
    private static final Map<String, Map<String, String>> mMinusMap = new MinusMap();

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
            return mProductMap.get(x).get(y);
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

    public static String sum(String x, String y) {
        if (x.length() == 1 && y.length() == 1)
            return mSumMap.get(x).get(y);
        if (x.startsWith("-"))
            return minus(y, x.substring(1));
        if (y.startsWith("-"))
            return minus(x, y.substring(1));
        StringBuilder sb = new StringBuilder();
        boolean hasIncrease = false;
        for (int i = 0; i < Math.max(x.length(), y.length()); i++) {
            if (i < x.length() && i < y.length()) {
                String intX = x.substring(x.length() - i - 1, x.length() - i);
                String intY = y.substring(y.length() - i - 1, y.length() - i);
                String s = sum(intX, intY);
                if (hasIncrease)
                    s = sum(s, "1");
                sb.insert(0, s.substring(s.length() - 1));
                hasIncrease = s.length() > 1;
            } else if (i < x.length()) {
                String intX = x.substring(x.length() - i - 1, x.length() - i);
                if (hasIncrease)
                    intX = sum(intX, "1");
                sb.insert(0, intX.substring(intX.length() - 1));
                hasIncrease = intX.length() > 1;
            } else {
                String intY = y.substring(y.length() - i - 1, y.length() - i);
                if (hasIncrease)
                    intY = sum(intY, "1");
                sb.insert(0, intY.substring(intY.length() - 1));
                hasIncrease = intY.length() > 1;
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
        if (mMinusMap.containsKey(x) && mMinusMap.get(x).containsKey(y))
            return mMinusMap.get(x).get(y);
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
                String intBigger = bigger.substring(bigger.length() - i - 1, bigger.length() - i);
                String intSmaller = smaller.substring(smaller.length() - i - 1, smaller.length() - i);
                String s = minus(intBigger, intSmaller);
                if (hasDecrease)
                    s = minus(s, "1");
                sb.insert(0, s.startsWith("-") ? sum("10", s) : s);
                hasDecrease = s.startsWith("-");
            } else if (i < smaller.length()) {
                String intSmaller = smaller.substring(smaller.length() - i - 1, smaller.length() - i);
                intSmaller = minus("10", intSmaller);
                if (hasDecrease)
                    intSmaller = minus(intSmaller, "1");
                sb.insert(0, intSmaller.startsWith("-") ? sum(intSmaller, "10") : intSmaller);
                hasDecrease = intSmaller.startsWith("-");
            } else {
                String intBigger = bigger.substring(bigger.length() - i - 1, bigger.length() - i);
                if (hasDecrease)
                    intBigger = minus(intBigger, "1");
                if (intBigger.equals("-1")) {
                    intBigger = "9";
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
            if (mComparisonMap.get(ai) < mComparisonMap.get(bi))
                return a.startsWith("-") ? 0 : 1;
            if (mComparisonMap.get(ai) > mComparisonMap.get(bi))
                return a.startsWith("-") ? 1 : 0;

        }
        return -1;
    }

}
