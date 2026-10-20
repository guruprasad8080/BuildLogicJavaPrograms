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
        Character result =str.chars().mapToObj(c->(char)c).filter(c->str.indexOf(c)==str.lastIndexOf(c)).
                                      findFirst().orElse(null);
        System.out.println(result);

        //4.Remove duplicates from a list
        List<Integer> unique=numbers.stream()
                                    .distinct().collect(Collectors.toList());
        System.out.println(unique);

        //5.Sort Employees by salary using comparator + lambda
        List<Employee> employees = Arrays.asList(
                new Employee(6,"Guru", 70000.00,"IT"),
                new Employee(7,"Prasad", 50000.00,"HR"),
                new Employee(8,"Charlie", 90000.00,"Marketing"),
                new Employee(9,"David", 60000.00,"IT"),
                new Employee(1, "Amit", 30000.00,"IT"),
                new Employee(2, "Rahul", 50000.00,"HR"),
                new Employee(3, "Priya", 40000.00,"Admin"),
                new Employee(4, "Sneha", 60000.00,"IT"),
                new Employee(5, "Vijay", 20000.00,"HR")
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
        /*Map<String,Integer> map=list.stream().collect(Collectors.toMap(s->s,String::length));
        System.out.println(map);*/

        //10.Group the Employees by department Using Collectors.groupingBy()
        Map<String,List<Employee>> deptGroup=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        //11.Get employee list who earns more than the average salary
        //calculate avarage salary
        double average=employees.stream()
                                 .mapToDouble(Employee::getSalary)
                                 .average().orElse(0.0);
        System.out.println(average);

        //calculate earn more than the average salary
        List<Employee> moreThanAverage=employees.stream()
                .filter(e->e.getSalary()>average)
                .toList();
        System.out.println(moreThanAverage);

        //12.Store List in Map and Employee Id is Key and Name will be value
        Map<Integer,String> empMap=employees.stream()
                .collect(Collectors.toMap(Employee::getEmpId,Employee::getEmpName));
        System.out.println(empMap);

        //13.Get the Highest salary in Department
        Map<String,Double> highEmp=employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                emp->emp.get().getSalary())));

        System.out.println(highEmp);
    }
}
