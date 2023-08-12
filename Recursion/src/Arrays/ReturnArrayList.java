package Arrays;

import java.util.ArrayList;


//return all the element that are equal to target in the list
public class ReturnArrayList {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,5,6,9,10};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex1(arr,4,0);
        System.out.println(ans);
    }

    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(arr[index]);
        }
        return  findAllIndex(arr,target,index+1,list);
    }

    //this function will return the index of target element with passing list in the argument
    static ArrayList<Integer> findAllIndex1(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index==arr.length){
            return list;
        }
//        this will contain answer for that function call only
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex1(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

}
