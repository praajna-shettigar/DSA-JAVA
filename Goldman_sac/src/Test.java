import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String,Integer> treeMap =new TreeMap<>();
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(null);
        System.out.println(hashSet);

    }
}
