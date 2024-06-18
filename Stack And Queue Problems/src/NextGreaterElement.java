import java.util.Stack;

public class NextGreaterElement {

    public static  int[] nextGreater(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        res[res.length-1] = -1;
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            while (st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else {
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,3,5,8,9};
        int[] res = nextGreater(arr);
        for (int a :res){
            System.out.println(a);
        }
    }
}
