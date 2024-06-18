import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isValidAnagram("Anil","Ail"));
    }

    public static boolean isValidAnagram(String s,String t){
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for(char c:s.toCharArray()){
            if(!map1.containsKey(c)){
                map1.put(c,1);
            }else{
                map1.put(c,map1.get(c)+1);
            }
        }

        for(char c:t.toCharArray()){
            if(!map2.containsKey(c)){
                map2.put(c,1);
            }else{
                map2.put(c,map2.get(c)+1);
            }
        }
        return map1.equals(map2);

    }
}
