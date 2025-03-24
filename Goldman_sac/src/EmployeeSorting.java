import java.util.*;
//sort the employee based on salary and name;
class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

class EmployeeSorter implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        // Sort by salary (ascending)
        if(e1.salary!=e2.salary){
            return Integer.compare(e1.salary,e2.salary);
        }
        return e1.name.compareTo(e2.name);
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 45000));
        employees.add(new Employee("Charlie", 50000));
        employees.add(new Employee("David", 60000));
        employees.add(new Employee("Eve", 45000));

        // Sort the list using custom comparator
        Collections.sort(employees, new EmployeeSorter());

        // Print sorted employees
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
