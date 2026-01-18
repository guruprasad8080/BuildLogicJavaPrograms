public class LongestPalindrome {

    private static String longestPalindrome(String s){
        if(s==null || s.length()<1) return "";
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            int len1=expandFromCenter(s,i,i);
            int len2=expandFromCenter(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    private static int expandFromCenter(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }


    public static void main(String[] args) {
        // Test cases
        String test1 = "babad";
        System.out.println("Input: " + test1);
        System.out.println("Output: " + longestPalindrome(test1));
        System.out.println();

        String test2 = "cbbd";
        System.out.println("Input: " + test2);
        System.out.println("Output: " + longestPalindrome(test2));
        System.out.println();

        // Additional test cases
        String test3 = "a";
        System.out.println("Input: " + test3);
        System.out.println("Output: " + longestPalindrome(test3));
        System.out.println();

        String test4 = "racecar";
        System.out.println("Input: " + test4);
        System.out.println("Output: " + longestPalindrome(test4));
        System.out.println();

        String test5 = "noon";
        System.out.println("Input: " + test5);
        System.out.println("Output: " + longestPalindrome(test5));
    }
}
