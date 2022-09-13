package steam;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Employee {
    private Integer Id;
    private String name;
    private Double salary;

    public void salaryIncrement(Double increatedSalary) {
        this.salary += increatedSalary;
    }
}
