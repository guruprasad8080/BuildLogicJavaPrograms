import java.util.HashMap;
import java.util.Map;

/*Problem Statement:
Discard the digits and previous character .
if the string found any digit we need to remove the digit and its previous character.
Input:"a1bc2c3ds4"
Output:bd
* */
public class DiscardDigitAndPrevChar {

        public static void main(String[] args) {
            String str="a1bc2c3ds4";
            String result=removeDigitAndPrevChar(str);
            System.out.println(result);
        }

        public static String removeDigitAndPrevChar(String str){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(Character.isDigit(ch)){
                    if(sb.length()>0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                }else{
                    sb.append(ch);
                }
            }
            return sb.toString();
        }
}

