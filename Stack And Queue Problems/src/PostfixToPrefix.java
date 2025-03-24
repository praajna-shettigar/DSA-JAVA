import java.util.Stack;

//convert the postfix expression to prefix expression
public class PostfixToPrefix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
//        res -9/*+5346
        Stack<String> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if(ascii>=48 && ascii<=57){
                st.push(ch+"");
            }else{
                String v2 = st.pop();
                String v1 = st.pop();
                String val = ch+v1+v2;
                st.push(val);
            }
        }
        System.out.println(st.peek());
    }
}
