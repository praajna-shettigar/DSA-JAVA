import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add(null);
        arrayList.add("C");

        List<String> arrayList1 = arrayList.stream().filter(x -> x!=null).collect(Collectors.toList());
        System.out.println(arrayList1);
    }
}
