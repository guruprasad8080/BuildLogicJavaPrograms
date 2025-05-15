import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Programs {
    public static void main(String[] args) {

        //1.Filter Even Number from a list
        List<Integer> numbers= Arrays.asList(2,1,3,4,6,5,7,8,9);
        List<Integer> even=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(even);

        //2.Count Word Frequency in given String
        String text="Hi Guru Hello Guru is Best Guru is great";
        Map<String, Long> wordCount=Arrays.stream(text.split(" ")).collect(Collectors.groupingBy(w->w,Collectors.counting()));
        System.out.println(wordCount);

        //3.Find first non-repeating character
        String str="pappayas";
        Character result =str.chars().mapToObj(c->(char)c).filter(c->str.indexOf(c)==str.lastIndexOf(c)).findFirst().orElse(null);
        System.out.println(result);

        //4.Remove duplicates from a list
        
    }
}
