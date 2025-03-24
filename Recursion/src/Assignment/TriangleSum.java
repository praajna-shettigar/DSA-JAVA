package Assignment;
import java.util.*;

//link : https://www.geeksforgeeks.org/sum-triangle-from-array/

public class TriangleSum {

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        printTriangle(A);
    }

    public static void printTriangle(int[] nums){
        if(nums.length<1){
            return;
        }

        int[] arr = new int[nums.length-1];

        for(int i=0;i<nums.length-1;i++){
            arr[i] = nums[i]+nums[i+1];
        }

        printTriangle(arr);
        System.out.println(Arrays.toString(nums));
    }
}
