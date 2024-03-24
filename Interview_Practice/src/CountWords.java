import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public static void main(String[] args) {
        String str = "Pranas Arun Anil argv Arun Anil";

        Map<String, Integer> map = new HashMap<String,Integer>();

        for(String a: str.split(" ")){
            if(!map.containsKey(a)){
                map.put(a,1);
            }else{
                map.put(a, map.get(a)+1);
            }
        }
        System.out.println(map);

    }
}
