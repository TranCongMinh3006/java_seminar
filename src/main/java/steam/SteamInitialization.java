package steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SteamInitialization {
    private static Employee[] arrayOfEmps = {
            new Employee(1, "Xuan Nam idol", 100000.0),
            new Employee(2, "Huu Vinh", 200000.0),
            new Employee(3, "Viet Tien", 300000.0)
    };
    private static List<Employee> empList = Arrays.asList(arrayOfEmps);

    public static void main(String[] args) {
//        obtain a stream from an existing array:
        Stream<Employee> steam1 = Stream.of(arrayOfEmps);

//        obtain a stream from an existing list
        Stream<Employee> steam2 = empList.stream();

//        create a stream from individual objects using Stream.of():
        Stream<Employee> steam3 = Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);

//         using Stream.builder()
        Stream.Builder<Employee> empStreamBuilder = Stream.builder();
        empStreamBuilder.accept(arrayOfEmps[0]);
        empStreamBuilder.accept(arrayOfEmps[1]);
        empStreamBuilder.accept(arrayOfEmps[2]);
        Stream<Employee> steam4 = empStreamBuilder.build();
    }
}
