/*Given a string s, the objective is to convert it into integer format without utilizing any built-in functions. Refer the below steps to know about atoi() function.

Cases for atoi() conversion:

Skip any leading whitespaces.
Check for a sign (‘+’ or ‘-‘), default to positive if no sign is present.
Read the integer by ignoring leading zeros until a non-digit character is encountered or end of the string is reached. If no digits are present, return 0.
If the integer is greater than 231 – 1, then return 231 – 1 and if the integer is smaller than -231, then return -231.
Examples:
Input: s = "-123"
Output: -123
Explanation: It is possible to convert -123 into an integer so we returned in the form of an integer
Input: s = "  -"
Output: 0
Explanation: No digits are present, therefore the returned answer is 0.
Input: s = " 1231231231311133"
Output: 2147483647
Explanation: The converted number will be greater than 231 – 1, therefore print 231 – 1 = 2147483647.
Input: s = "-999999999999"
Output: -2147483648
Explanation: The converted number is smaller than -231, therefore print -231 = -2147483648.
Input: s = "  -0012gfg4"
Output: -12
Explanation: Nothing is read after -12 as a non-digit character ‘g’ was encountered.*/

public class Atoi {
    public static void main(String[] args) {
        String[] testCases = {
                "-123", "  -", " 1231231231311133", "-999999999999", "  -0012gfg4"
        };

        for (String s : testCases) {
            System.out.println("Input: \"" + s + "\" Output: " + myAtoi(s));
        }
    }

    public static int myAtoi(String s){
        int i=0;
        int n=s.length();
        int sign=1;
        long result=0;
        while(i<n&&s.charAt(i)==' '){
            i++;
        }
        while(i<n&&(s.charAt(i)=='+'||s.charAt(i)=='-')){
            sign=s.charAt(i)=='-'?-1:1;
            i++;
        }

        while(i<n&&s.charAt(i)>='0'&&s.charAt(i)<='9'){
            int digit=s.charAt(i)-'0';
            result=result*10+digit;

            if(sign==1 && result>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            if(sign==-1&& result<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) (sign*result);
    }
}
