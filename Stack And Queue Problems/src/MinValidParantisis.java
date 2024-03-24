
//leetocde problem 921

import java.util.Stack;

public class MinValidParantisis {

    public static void main(String[] args) {

    }

    public static int minAddToMakeValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch==')'){
                if(!stack.isEmpty() && stack.peek() =='('){
                    stack.pop();
                }else {
                    stack.push(ch);
                }
            }else{
                stack.push('(');
            }
        }
        return stack.size();
    }
}
