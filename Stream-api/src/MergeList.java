import java.util.List;
import java.util.stream.Stream;

//Q. Merge two sorted lists into a single sorted list using Java streams:
public class MergeList {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 3, 5, 7, 9);
        List<Integer> list2 = List.of(2, 4, 6, 8, 10);

        //merge in ascending order
        List<Integer> merge = Stream.concat(list1.stream(),list2.stream()).sorted().toList();
        System.out.println(merge);

        //merge in desending order
        List<Integer> mergeDes = Stream.concat(list1.stream(),list2.stream()).sorted((a,b)-> b-a).toList();
        System.out.println(mergeDes);

    }
}
