import java.util.HashMap;
import java.util.Map;

public class Practice {

        public static String fractionToDecimal(int numerator, int denominator) {
            if (numerator == 0) return "0";

            StringBuilder result = new StringBuilder();
            Map<Long, Integer> remainderMap = new HashMap<>();

            long num = Math.abs((long) numerator);
            long den = Math.abs((long) denominator);

            result.append((numerator < 0 ^ denominator < 0) ? "-" : "");
            result.append(num / den);
            num %= den;

            if (num == 0) return result.toString();

            result.append(".");
            int index = result.length();

            while (num != 0) {
                if (remainderMap.containsKey(num)) {
                    int repeatIndex = remainderMap.get(num);
                    result.insert(repeatIndex, "(");
                    result.append(")");
                    break;
                }
                remainderMap.put(num, index++);
                num *= 10;
                result.append(num / den);
                num %= den;
            }

            if (denominator % 2 == 0) {
                return result.toString().replace("(", "").replace(")", "");
            }

            return result.toString();
        }

        public static void main(String[] args) {
            int[][] testCases = {{1, -2}, {1, 3}, {2, 7}};

            for (int[] testCase : testCases) {
                System.out.println(testCase[0] + "/" + testCase[1] + " = " + fractionToDecimal(testCase[0], testCase[1]));
            }
        }
    }

