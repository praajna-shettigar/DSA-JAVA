import java.util.HashMap;
import java.util.HashSet;

public class HashMaps {

    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        map.put("Praajna",50);
        map.put("Pranav",43);
        map.put("Punith",53);
        System.out.println(map.get("Praajna"));
        System.out.println(map.getOrDefault("Pranav",99));
        System.out.println(map.containsKey("Praajna"));
        System.out.println(map);

        System.out.println("-----------------hashSet-----------------------");

        HashSet<Integer> set = new HashSet<>();
        set.add(32);
        set.add(42);
        set.add(35);
        set.add(33);
        set.add(99);

        System.out.println(set);


    }
}
