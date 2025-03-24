import java.util.HashMap;
import java.util.Map;


//determine if the given strings are Isomorphic
//Two String s and t are isoporphic if the character in s can be replaced to get t
public class Isomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("pra","bpb"));
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
