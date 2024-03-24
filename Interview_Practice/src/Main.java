import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();
        Employee employee = new Employee("E001","Pradeep","H.R",35);
        employeeList.add(employee);
        employeeList.add(new Employee("E002","Ashok","H.R",35));
        employeeList.add(new Employee("E003","Manoj","H.R",35));
        employeeList.add(new Employee("E004","Pradeep","H.R",35));
        employeeList.add(new Employee("E005","Ashok","H.R",35));

        Map<String,Integer> map = new HashMap<String,Integer>();

        for(Employee e: employeeList){
            if(!map.containsKey(e.name)){
                map.put(e.getName(),1);
            }else{
                map.put(e.getName(),map.get(e.getName())+1);
            }
        }
        System.out.println(map);
    }
}
