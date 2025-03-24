import java.util.List;
import java.util.stream.Collectors;

//Q. Remove duplicates from a list while preserving the order using Java streams:
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = List.of(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> uniqueNumbers = numbersWithDuplicates
                .stream()
                .distinct()
                .toList();
        System.out.println(uniqueNumbers);

//        Q. Remove duplicates from a list and number > 3 while preserving the order using Java streams:
        List<Integer> uniqueNumbers1 = numbersWithDuplicates
                .stream()
                .distinct()
                .filter(a->a>3)
                .toList();
        System.out.println(uniqueNumbers1);
    }
}
