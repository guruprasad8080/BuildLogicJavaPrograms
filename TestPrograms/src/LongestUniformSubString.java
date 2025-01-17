public class LongestUniformSubString {

    public static void main(String[] args) {
        String input = "aaaaaabbcccddddddee";
        String result = findLongestUniformSubstring(input);

        System.out.println("Longest Uniform Substring: \"" + result + "\"");

    }
    public static String findLongestUniformSubstring(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        int maxLength = 1;
        int currentLength = 1;
        char maxChar = str.charAt(0);
        char currentChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentLength++;
            } else {
                currentLength = 1;
                currentChar = str.charAt(i);
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxChar = currentChar;
            }
        }
        String longestUniformSubstring = String.valueOf(maxChar).repeat(maxLength);

        return longestUniformSubstring;
    }
}
