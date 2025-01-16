import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EncodeString {

    public static String encodeString(String input) {
        HashMap<String, Integer> substringCount = new HashMap<>();
        StringBuilder encodedString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            String currentSubstring = input.substring(0, i + 1);

            // Increment count in the map
            substringCount.put(currentSubstring, substringCount.getOrDefault(currentSubstring, 0) + 1);

            // If substring already exists, replace with '*'
            if (substringCount.get(currentSubstring) > 1) {
                encodedString.append("*");
            } else {
                encodedString.append(input.charAt(i));
            }
        }

        return encodedString.toString();
    }

    public static void main(String[] args) {
        String input1 = "abcabca";
        String input2 = "ABCABCE";

        System.out.println("Input: " + input1 + " -> Output: " + encodeString(input1));
        System.out.println("Input: " + input2 + " -> Output: " + encodeString(input2));
    }
}
