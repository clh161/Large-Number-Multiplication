import java.util.HashMap;
import java.util.Map;

/**
 * @author Jacob Ho
 */
public class StringMultiplication {


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
        StringBuilder sb = new StringBuilder();
        boolean hasDecrease = false;
        for (int i = 0; i < Math.max(x.length(), y.length()); i++) {
            if (i < x.length() && i < y.length()) {
                int intX = Integer.parseInt(x.substring(x.length() - i - 1, x.length() - i));
                int intY = Integer.parseInt(y.substring(y.length() - i - 1, y.length() - i));
                int s = intX - intY;
                if (hasDecrease)
                    s--;
                sb.insert(0, s < 0 ? s + 10 : s);
                hasDecrease = s < 0;
            } else if (i < x.length()) {
                int intX = Integer.parseInt(x.substring(x.length() - i - 1, x.length() - i));
                if (hasDecrease)
                    intX--;
                sb.insert(0, intX < 0 ? intX + 10 : intX);
                hasDecrease = intX < 0;
            } else {
                int intY = Integer.parseInt(y.substring(y.length() - i - 1, y.length() - i));
                intY = 10 - intY;
                if (hasDecrease)
                    intY--;
                sb.insert(0, intY < 0 ? intY + 10 : intY);
                hasDecrease = intY < 0;
            }
        }
        String string = sb.toString();
        while (string.startsWith("0") && string.length() > 1)
            string = string.substring(1, string.length());
        if (hasDecrease)
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
        Map<String, Integer> map = new HashMap<>();
        map.put("0", 0);
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);
        map.put("9", 9);
        for (int i = 0; i < a.length(); i++) {
            String ai = a.substring(i, i + 1);
            if (ai.equals("="))
                continue;
            String bi = b.substring(i, i + 1);
            if (map.get(ai) < map.get(bi))
                return a.startsWith("-") ? 0 : 1;
            if (map.get(ai) > map.get(bi))
                return a.startsWith("-") ? 1 : 0;

        }
        return -1;
    }

}
