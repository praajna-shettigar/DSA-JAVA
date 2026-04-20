import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Inter {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        Employee e1 = new Employee("1","abc","IT",25000);
        Employee e2 = new Employee("2","abcd","IT",15000);
        Employee e3 = new Employee("3","abce","CS",40000);
        Employee e4 = new Employee("4","abcd","CS",10000);

        Map<String,Employee> maxSalEmp = arrayList.stream().collect(Collectors.groupingBy(e->e.department, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e->e.getSalary())), Optional::get)));
        System.out.println(maxSalEmp);

    }
}
