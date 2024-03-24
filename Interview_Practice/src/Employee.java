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
    String designation;
    int age;

    public Employee() {
    }

    public Employee(String id, String name, String designation, int age) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.age = age;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
