import java.util.Stack;


//asked in accenture
public class ValidParanthisis {
    public static void main(String[] args) {
        System.out.println(isValid("(){[]}"));
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }else{
                if(ch==')'){
                    if(stack.isEmpty() || stack.pop()!='('){
                        return false;
                    }
                }
                if(ch==']'){
                    if(stack.isEmpty() || stack.pop()!='['){
                        return false;
                    }
                }
                if(ch=='}'){
                    if(stack.isEmpty() || stack.pop()!='{'){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
