import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChar {

    public static void main(String[] args){
        String str="papaya";
        Map<Character,Integer> charMap=new LinkedHashMap<>();
        for(char c:str.toCharArray()){
            charMap.put(c,charMap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:charMap.entrySet()){
            if(entry.getValue()==1){
                System.out.println("Value:- "+entry.getKey());
                break;
            }
        }
    }
}
