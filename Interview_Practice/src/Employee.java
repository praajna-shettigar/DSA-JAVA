//Quetion
//        Write a code to print duplicate employee namw count from EmployeeList
//        Example:
//        ("E001","Pradeep","H.R",35)
//        ("E002","Ashok","H.R",35)
//        ("E003","Manoj","H.R",35)
//        ("E004","Pradeep","H.R",35)
//        ("E005","Ashoke","H.R",35)

public class Employee {

    String id;
    String name;
    String department;
    int salary;

    public Employee() {
    }

    public Employee(String id, String name,  String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
