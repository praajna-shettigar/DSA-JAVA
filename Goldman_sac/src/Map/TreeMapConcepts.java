package Map;

import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class TreeMapConcepts {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(25,"Praajna");
        map.put(27,"Pavan");
        map.put(68,"Kunal");
        map.put(30,"Abc");
        map.put(43,"Manoj");
        map.put(20,"Pranav");

        System.out.println(map);

        map.forEach((k,v)-> System.out.println("Key - "+k+" value - "+v));

        //first entry
        System.out.println(map.firstEntry());

        //last entry
        System.out.println(map.lastEntry());

        //age less than 30
        List<Integer> ageLessthan30 = map.headMap(30).keySet().stream().toList();
        System.out.println(ageLessthan30);

        //age greater than or equal to 30
        List<Integer> ageGreaterthan30 = map.tailMap(30).keySet().stream().toList();
        System.out.println(ageGreaterthan30);


        TreeMap<Integer,String> map1 = new TreeMap<>(Comparator.reverseOrder());
        map1.put(25,"Praajna");
        map1.put(27,"Pavan");
        map1.put(68,"Kunal");
        map1.put(30,"Abc");
        map1.put(43,"Manoj");
        map1.put(20,"Pranav");
        System.out.println(map1);



    }
}
