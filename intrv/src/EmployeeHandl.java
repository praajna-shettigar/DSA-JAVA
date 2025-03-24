import java.util.ArrayList;
import java.util.List;

public class EmployeeHandl {
    public static void main(String[] args){
        System.out.println("start");

        Employee employee = new Employee("Praajna",25,"male",25000);
        Employee employee1 = new Employee("arun",25,"male",18000);
        Employee employee2 = new Employee("Rach",25,"female",40000);
        Employee employee3 = new Employee("nagu",25,"female",1000);

        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        list.stream();

        //select sum(salary) from employee
        //group by gender
        //where age>25

    }

}
