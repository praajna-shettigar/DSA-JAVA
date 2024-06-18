import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        map.put("Praajna",50);
        map.put("Pranav",43);
        map.put("Punith",53);
        System.out.println(map.get("Praajna"));
        System.out.println(map.getOrDefault("Pranav",99));
        System.out.println(map.containsKey("Praajna"));
        //putIfAbsent will add values only if map doesn't contains the value
        map.putIfAbsent("Avi",100);
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        //print key and value
        System.out.println(map.entrySet());

        //Traversing all the elements of map - multiple methods
        for (String key: map.keySet()){
            System.out.printf("Value of %s is %d\n",key,map.get(key));
        }

        for(Map.Entry<String, Integer> e:map.entrySet()){
            System.out.println(e.getKey() + "  -  " + e.getValue());
        }

        for(var e:map.entrySet()){
            System.out.println(e.getKey() + "  ---  " + e.getValue());
        }



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
