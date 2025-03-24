import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class AmexInterview {
    public static void main(String[] args) {
        int[] arr = {1, 13,14,14,12, 12, 3, 4, 4, 5, 5, 6};

        Set<Integer> set = new LinkedHashSet<>();

        int index =0;
        for(int a : arr){
            if(!set.contains(a)){
                set.add(a);
                arr[index++] = a;
            }
        }

        //same using stream
        Set<Integer> s = new LinkedHashSet<>();
        arr = Arrays.stream(arr).filter(a ->s.add(a)).toArray();
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0,index)));
    }
}
