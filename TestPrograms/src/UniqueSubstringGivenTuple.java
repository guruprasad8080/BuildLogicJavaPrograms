import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*Problem Statement:
Unique substring based on the given tuple size
Input:"abcabcdef" tuple = 2
output:[ab,bc,ca,cd,de,ef]
* */
public class UniqueSubstringGivenTuple {

    public static void main(String[] args) {
        String str="abcabcdef";
        int n=2;
        uniqueSubString(str,n);
    }

    public static void uniqueSubString(String str,int n){
        Set<String> set=new LinkedHashSet<>();
        for(int i=0;i<=str.length()-n;i++){  //we need to restrict the string length - n
            set.add(str.substring(i,i+n));
        }
        System.out.println(set);
    }
}
