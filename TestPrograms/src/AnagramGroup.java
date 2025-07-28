import java.util.*;
import java.util.stream.Collectors;

/* An anagram is a word or phrase formed by rearranging the letters of another word or phrase
*  Ex: "listen"→"silent"
*  Below Program will group such words.
* */
public class AnagramGroup {
    public static void main(String[] args){
        List<String> arrList= Arrays.asList("cat","ot","dog","god","to");
        Set<Set<String>> set=checkAnagramGroup(arrList);
        System.out.println(set);

        // Using Java 8 feature
        Map<String,List<String>> groupAnagram=arrList.stream()
                .collect(Collectors.groupingBy(AnagramGroup::sortedStr));
        groupAnagram.forEach((key,value)->System.out.println(value));
    }

    private static String sortedStr(String str){
        char[] charArray=str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    // Using normal Set
    private static Set<Set<String>> checkAnagramGroup(List<String> words ){
        Map<String,Set<String>> map=new HashMap<>();
        for(String word:words){
            char[] charArray=word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord=new String(charArray);
            map.computeIfAbsent(sortedWord,k->new HashSet<>()).add(word);
        }
        return new HashSet<>(map.values());
    }


}
