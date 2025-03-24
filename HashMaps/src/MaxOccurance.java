import java.util.HashMap;
import java.util.Map;

public class MaxOccurance {

    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,2,2,2,1};
        int res = occurance(arr);
        System.out.println(res);
    }
    public static int occurance(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else {
                map.put(i,map.get(i)+1);
            }
        }
        System.out.println(map);
        int maxOccurance = 0;
        int ke =0;
        for (Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue() >maxOccurance){
                ke = e.getKey();
                maxOccurance = e.getValue();
            }
        }
        return ke;
    }
}
