import java.util.LinkedHashMap;

public class LongestUniqueSubstring {

    public static void main(String[] args){
        String str="aaaabbbnokkkpppppp";
        char[] charArr=str.toCharArray();
        String longStr=null;
        int str_length=0;

        LinkedHashMap<Character,Integer> charMap=new LinkedHashMap<Character,Integer>();
        for(char c:charArr){
            if(!charMap.containsKey(c)){
                charMap.put(c, charMap.getOrDefault(c,0)+1);
            }else{
                charMap.get(c);
                charMap.clear();
            }
            if(charMap.size()>str_length){
                str_length=charMap.size();
                longStr=charMap.keySet().toString();
            }
        }

        System.out.println("Input String: "+str);
        System.out.println("The Longest subString: "+longStr);
        System.out.println("The Longest Substring length: "+str_length);
    }
}
