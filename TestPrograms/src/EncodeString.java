import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EncodeString {

    public static String encodeString(String input) {
        int len=input.length();
        for(int i=1;i<=len/2;i++){
            String substring=input.substring(0,i);
            StringBuilder repPattern=new StringBuilder();
             while(repPattern.length()<len){
                 repPattern.append(substring);
             }

             if(repPattern.substring(0,len).equals(input)){
                 return substring+"*"+input.charAt(len-1);
             }
        }
        return input;
    }

    public static void main(String[] args) {
        String input1 = "abcabca";
        String input2 = "ABCABCE";

        System.out.println("Input: " + input1 + " -> Output: " + encodeString(input1));
        System.out.println("Input: " + input2 + " -> Output: " + encodeString(input2));
    }
}
