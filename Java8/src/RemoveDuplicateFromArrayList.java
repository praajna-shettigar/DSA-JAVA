import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArrayList {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add(null);
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("B");

        List<String> arrayList1 = arrayList.stream().distinct().collect(Collectors.toList());
        System.out.println(arrayList1);

        //print the above using foreach instead of saving
        arrayList.stream().distinct().forEach( x -> System.out.print(x + " "));
    }
}
