import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateAndNullValuesFromArraylist {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add(null);
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add(null);
        arrayList.add("C");

        List<String> arrayList1 = arrayList.stream().distinct().filter(x->x!=null).collect(Collectors.toList());
        System.out.println(arrayList1);

        //print the above using foreach instead of saving
        arrayList.stream().distinct().filter(x->x!=null).forEach( x -> System.out.print(x + " "));
    }
}
