package steam;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
    private static Employee[] arrayOfEmps = {
            new Employee(1, "Xuan Nam", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };
    private static List<Employee> empList = Arrays.asList(arrayOfEmps);

    public static void main(String[] args) {
//        forEach
        System.out.println("using forEach");
        empList.stream().forEach(e -> e.salaryIncrement(10.0));
        empList.stream().forEach(e -> System.out.println(e.getSalary()));

//        filter
        System.out.println("using filter");
        List<Employee> employeesWithMoreThan200000Salary = empList
                .stream()
                .filter(c -> c.getSalary() > 200000.0)
                .collect(Collectors.toList());
        employeesWithMoreThan200000Salary.stream().forEach(e -> System.out.println(e.getSalary()));

//        map
        System.out.println("using map");
        List<String> alpha = Arrays.asList("a", "b", "c", "d");
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

//        flatMap
        System.out.println("using flatMap");
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(namesFlatStream.size());

//        peek
        System.out.println("using peek");
        empList.stream()
                .peek(e -> e.salaryIncrement(10.0))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
