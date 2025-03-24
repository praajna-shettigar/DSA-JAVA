import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


//How do you extract duplicate elements from an array?
public class ExtractDuplicate {
    public static void main(String[] args)
    {
        List<Integer> listOfIntegers = List.of(111, 222, 333, 111, 555, 333, 777, 222);

        Set<Integer> uniqueElements = new HashSet<>();

        Set<Integer> duplicateElements = listOfIntegers.stream().filter(i -> ! uniqueElements.add(i)).collect(Collectors.toSet());

        System.out.println(duplicateElements);
    }
}
