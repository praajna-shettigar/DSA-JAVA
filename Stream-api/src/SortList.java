import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,10,12,8, 3,2, 5, 7,4 ,9);

        //sort in assending order
        List<Integer> sortedList = list1.stream().sorted().toList();
        System.out.println(sortedList);

        //sort list in rev order
        List<Integer> sortRevList = list1.stream().sorted((a,b)->b-a).toList();
        System.out.println(sortRevList);
    }
}
