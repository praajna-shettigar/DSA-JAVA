import java.util.*;

public class FirstNonRepetingChar {
    public static void main(String[] args) {
          String str = "abbcdacd";
        System.out.println(firstNonRepetingChar(str));
    }

    public static char firstNonRepetingChar(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }

        if(map.size()==0){
            return '1';
        }
        for (Map.Entry<Character,Integer> var : map.entrySet()){
            if(var.getValue()==1){
                return var.getKey();

            }
        }
        return '1';

    }
}
