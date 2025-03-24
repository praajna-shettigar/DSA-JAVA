import java.util.Stack;

//the difference in prefix evaluation is we have to start iterate the string from the end
//and while removing the element v1 should be assigned first
public class PreFixEvaluation {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> st = new Stack<>();

        for(int i=str.length()-1;i>=0;i--){
            char ch =  str.charAt(i);
            int ascii = (int) ch;
            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            }else{

                int v1 = st.pop();
                int v2 = st.pop();
                if(ch=='+') st.push(v1 +v2);
                if(ch=='-') st.push(v1 -v2);
                if(ch=='*') st.push(v1 *v2);
                if(ch=='/') st.push(v1 /v2);
            }
        }
        System.out.println(st.peek());
    }
}
