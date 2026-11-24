import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Programs {
    public static void main(String[] args) {

        //1.Filter Even Number from a list
        List<Integer> numbers= Arrays.asList(2,1,3,4,6,5,7,8,9);
        List<Integer> even=numbers.stream().filter(n->n%2==0).toList();
        System.out.println(even);

        //2.Count Word Frequency in given String
        String text="Hi Guru Hello Guru is Best Guru is great";
        Map<String, Long> wordCount=Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(w->w,Collectors.counting()));
        System.out.println(wordCount);

        //3.Find first non-repeating character
        String str="pappayas";
        Character result =str.chars().mapToObj(c->(char)c)
                .filter(c->str.indexOf(c)==str.lastIndexOf(c))
                        .findFirst().orElse(null);
        System.out.println(result);

        //4.Remove duplicates from a list
        List<Integer> unique=numbers.stream()
                                    .distinct().toList();
        System.out.println(unique);

        //5.Sort Employees by salary using comparator + lambda
        List<Employee> employees = Arrays.asList(
                new Employee(6,"Guru", 70000.00,"IT"),
                new Employee(7,"Prasad", 50000.00,"HR"),
                new Employee(8,"Charlie", 90000.00,"Marketing"),
                new Employee(9,"David", 60000.00,"IT"),
                new Employee(1, "Amit", 30000.00,"IT"),
                new Employee(2, "Asha", 50000.00,"HR"),
                new Employee(3, "Priya", 40000.00,"Admin"),
                new Employee(4, "Sneha", 60000.00,"IT"),
                new Employee(5, "Vijay", 20000.00,"HR")
        );
         employees.sort(Comparator.comparing(Employee::getSalary));

        //6.Convert a list of strings to uppercase in java
        List<String> list=Arrays.asList("Guru","Prasad","Saritha","Raj");
        list.stream().map(String::toUpperCase).toList();
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
        Map<String,List<Employee>> deptGroup=employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(deptGroup);


        //11.Get employee list who earns more than the average salary
        //calculate average salary
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

        //14.Longest word using java 8
        String sentence="This is stream Problem";
        String longestWord=Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(longestWord);

        //15.Find the highest salary in the list of employee
        OptionalDouble highestSalary=employees.stream()
                .mapToDouble(Employee::getSalary)
                .max();
        System.out.println(highestSalary);

        //16.Number of time words occurs in sentence
        String sent="This is my Life and this LIfE is good";
        Map<String,Long> wordCountMap=Arrays.stream(sent.split(" "))
                .collect(Collectors.groupingBy(String::toUpperCase,Collectors.counting()));
        System.out.println(wordCountMap);

        //17.filter the given string array Validate integer
        String[] strArray = {"123", "abc", "456", "def"};
        List<Integer> validIntegers = Arrays.stream(strArray)
                .filter(s -> s.matches("\\d+"))
                .map(Integer::parseInt)
                .toList();
        System.out.println(validIntegers);

        //18.Find the unique character in String
        String nstr="Hello world";
        Map<Character,Long> smap=nstr.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        List<Character> uniqueChars=smap.entrySet().stream()
                .filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(uniqueChars);

        //19. Reverse the String Alphabet order
        String alstr="debac";
        String reverse= Stream.of(alstr.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
        System.out.println(reverse);
        
        //20.Find the Odd number and squre them
        List<Integer> oddSqur=Arrays.asList(1,2,3,4,5);
        List<Integer> resultoddSqur= oddSqur.stream()
                .filter(ele->ele%2!=0)
                .map(ele->ele*ele)
                .toList();
        System.out.println(resultoddSqur);
        
        //21.In the List find the unique element sort the element in reverse order 
        List<Integer> revList=Arrays.asList(1,7,4,2,6,3,4,2,5);
        List<Integer> resultrevList=revList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(resultrevList);

        //22.Find the 2nd and 3rd element in the list .
        List<Integer> value=Arrays.asList(1,2,3,4,5);
        List<Integer>resValue=value.stream().skip(1)
                .limit(2)
                .toList();
        System.out.println(resValue);

        //23.Find the biggest string in the given list
        List<String> strings= Arrays.asList("Guru","Prasad","Saritha","Raj");
        strings.stream()
                .max(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);

        //24.Sort the based on salary then the name for Employee
        employees.stream()
                .sorted((emp1,emp2)->{
                    if(emp1.getSalary()>emp2.getSalary()){
                        return 1;
                    }else if(emp1.getSalary()<emp2.getSalary()){
                        return -1;
                    }else{
                        return emp1.getEmpName().compareTo(emp2.getEmpName());
                    }
                }).toList().forEach(System.out::println);

        //25.count the employee with each department
        Map<String, Long> deptCountEmp = employees.stream()
                .collect(Collectors.groupingBy(ele -> ele.getDepartment(), Collectors.counting()));

        System.out.println(deptCountEmp);

        //26.Average the department salary
        Map<String, Double> deptSalAvg = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(deptSalAvg);

        //27. Find the Highest salary in every Department
        Map<String, Optional<Employee>> highSalEachDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(highSalEachDept);

        //28.Print the all the employee name with comma separated string
        String employeeNames = employees.stream()
                .map(Employee::getEmpName)
                .collect(Collectors.joining(","));
        System.out.println(employeeNames);

        //29.convert single list as multiple list
        List<List<Integer>> listOfLists=Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(3,4,5,6),
                Arrays.asList(7,8,1,2),
                Arrays.asList(9,10,7,8),
                Arrays.asList(11,12,1,2)
        );

        List<Integer> flatListMap = listOfLists.stream()
                .flatMap(innerList -> innerList.stream())
                .distinct()
                .toList();
        System.out.println(flatListMap);

        //30.Print all the employee name should be fast
        employees.parallelStream().
                map(Employee::getEmpName)
                .forEach(System.out::println);
    }
}
