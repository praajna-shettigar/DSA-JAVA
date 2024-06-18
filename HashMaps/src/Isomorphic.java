import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static void main(String[] args) {

    }
    public static boolean isIsomorphic(String s, String t){
        Map<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);
            if(map.containsKey(sCh)){
                if(map.get(sCh)!=tCh) {
                    return false;
                }
            }
            else if(map.containsValue(tCh)){
                    return false;
                }else{
                    map.put(sCh,tCh);
                }
            }

        return true;
    }
}
