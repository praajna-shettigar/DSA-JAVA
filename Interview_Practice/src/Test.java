import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
//        Given an integer array nums and an integer k,
//        return the k most frequent elements. You may return the answer in any order.
//        nums = [1,1,1,2,2,3], k = 2
         // 1 - 3, 2 - 2,

        int[] nums = {1,1,2,2,2,3,3,3,3,4,4,4,4,4};
        int k = 2;

        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for(int key:map.keySet()){
            pq.offer(key);
            if(pq.size()>k){
                pq.poll();
            }
        }

        int[] result = new int[k];

        int i=0;
        while (!pq.isEmpty()){
            result[i++] = pq.poll();
        }

        System.out.println(Arrays.toString(result));



    }
    
}
