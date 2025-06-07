import java.util.*;
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
        List<Integer> unique=numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);

        //5.Sort Employees by salary using comparator + lambda
        List<Employee> employees = Arrays.asList(
                new Employee("Guru", 70000.00,"IT"),
                new Employee("Prasad", 50000.00,"HR"),
                new Employee("Charlie", 90000.00,"Marketing"),
                new Employee("David", 60000.00,"IT")
        );
        // employees.sort(Comparator.comparing(Employee::getSalary));

        //6.Convert a list of strings to uppercase in java
        List<String> list=Arrays.asList("Guru","Prasad","Guru","Raj");
        list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list);

        //7.Sum All the numbers in list using reduce()
        int sum=numbers.stream().reduce(0,Integer::sum);
        System.out.println(sum);

        //8.Join strings into comma-separated value
        String csv=list.stream().collect(Collectors.joining(","));
        System.out.println(csv);

        //9.Convert List<String> to Map<String,Integer>
        Map<String,Integer> map=list.stream().collect(Collectors.toMap(s->s,String::length));
        System.out.println(map);

        //10.Group the Employees by department Using Collectors.groupingBy()
        Map<String,List<Employee>> deptGroup=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
