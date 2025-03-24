import java.util.Stack;

public class LargestAreaHistogram {
    public static int largestRectangleArea(int[] height){
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];

        //calculate nse
        nse[n-1] = n;
        st.push(n-1); //index
        for(int i=n-2;i>=0;i--){
            while (st.size()>0 && height[st.peek()]>height[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i] = n;
            }else {
                nse[i] = st.peek();
            }
            st.push(i);
        }
        //empty stack to use in next step
        while (!st.isEmpty()) st.pop();

        //calculate pse
        st.push(0);
        pse[0] = -1;

        for(int i=1;i<n;i++){
            while (st.size()>0 && height[st.peek()]>height[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i] = -1;
            }else {
                pse[i] = st.peek();
            }
            st.push(i);
        }


        //maximum area
        int max = -1;
        for (int i=0;i<n;i++){
            int area = height[i]*(nse[i]-pse[i]-1);
            max = Math.max(max,area);
        }
        return max;

    }
}
