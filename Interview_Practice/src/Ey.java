import java.util.HashMap;
import java.util.Map;

public class Ey {
    public static void main(String[] args) {
        String s = "abecdraca";
        Map<Character, Integer> hashMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(!hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),1);
            }else{
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            }
        }
        System.out.println(hashMap);

        String res="";
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            res = res + key+value;
        }
        System.out.println(res);
    }
}
