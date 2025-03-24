import java.util.HashMap;
import java.util.Map;

public class SubArraySumUsingMap {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        System.out.println("Output: " + subArray(array, 6));  // Output: 2
        System.out.println("Output: " + subArray(array, 12));
    }

    private static int subArray(int[] array, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        map.put(0, 1);
        for(int i=0;i<array.length;i++){
            sum += array[i];

            if(map.containsKey(sum-target)){
                count += map.get(sum-target);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count == 0 ? -1 : count;
    }
}
