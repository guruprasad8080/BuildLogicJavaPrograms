package dsainterviewquestion150.string;

public class FindFirstNonRepeatingCharString {
    public static void main(String[] args) {
        String str = "swiss";
        char result = firstNonRepeatingChar(str);
        // Alternatively, you can use the LinkedHashMap approach
         firstNonRepeatingCharUsingLinkedHashMap(str);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("All characters are repeating.");
        }
    }

    public static char firstNonRepeatingChar(String str) {
        int[] charCount = new int[256]; // Assuming ASCII character set

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        // Find the first non-repeating character
        for (char c : str.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }

        return '\0'; // Return null character if all characters are repeating
    }

    public static void firstNonRepeatingCharUsingLinkedHashMap(String str) {
        java.util.Map<Character, Integer> charMap = new java.util.LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        for (java.util.Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Value:- "+entry.getKey());
                break;
            }
        }
    }


}
