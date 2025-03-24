import java.util.*;

public class Main {

    public static void main(String[] args) {



        List<Employee> employeeList = new ArrayList<Employee>();
        Employee employee = new Employee("E001","Pradeep","H.R",55);
        employeeList.add(employee);
        employeeList.add(new Employee("E002","Ashok","H.R",12));
        employeeList.add(new Employee("E003","Manoj","H.R",31));
        employeeList.add(new Employee("E004","Pradeep","H.R",15));
        employeeList.add(new Employee("E005","Ashok","H.R",13));

        Map<String,Integer> map = new HashMap<String,Integer>();

        //sorting using comparator
        Comparator<Employee> com = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        employeeList.sort(com);



        //sort based on age
      //  employeeList.sort(Comparator.comparing(a-> a.getAge()));
//        System.out.println("sort");
        for (Employee e :employeeList){
            System.out.println(e.name + " " + e.age);
        }

        for(Employee e: employeeList){
            if(!map.containsKey(e.name)){
                map.put(e.getName(),1);
            }else{
                map.put(e.getName(),map.get(e.getName())+1);
            }
        }
        //System.out.println(map);
    }
}
