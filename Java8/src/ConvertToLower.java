import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToLower {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("x");

            List<String> arrayList1 = arrayList.stream().distinct().map(y->y.toUpperCase()).collect(Collectors.toList());
        System.out.println(arrayList1);

        //print the above using foreach instead of saving
        arrayList.stream().distinct().map(y->y.toUpperCase()).forEach( x -> System.out.print(x + " "));
    }
}
