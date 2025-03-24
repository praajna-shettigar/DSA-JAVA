import java.util.Stack;

//Convert the prefix expression into postfix expression
public class PrefixToPostFix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> st = new Stack<>();

        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if(ascii>=48 && ascii<=57){
                st.push(ch+"");
            }else{
                String v1 = st.pop();
                String v2 = st.pop();
                String val = v1+v2+ch;
                st.push(val);
            }
        }
        System.out.println(st.peek());
    }
}
