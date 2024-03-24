package SubsetSequenceString;

import java.util.ArrayList;
import java.util.List;

public class PhonePattern {

    public static void main(String[] args) {
//        System.out.println(padList("","12"));
          pad("","12");
//        List<String> result = new ArrayList<>();
//        if (digits == null || digits.isEmpty()) {
//            return result; // Return an empty list for an empty input
//        }
//        padList(result, "", digits);
//        return result;
    }

    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';  //this will convert something '2' like 2

        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char)('a'+i);
            pad(p+ch,up.substring(1));
        }
    }


    static ArrayList<String> padList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';  //this will convert something '2' like 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char)('a'+i);
            list.addAll(padList(p+ch,up.substring(1)));
        }

        return list;
    }

    public void padList(List<String> result, String p, String up) {
        if (up.isEmpty()) {
            result.add(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        String[] mappings = {
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        String letters = mappings[digit];

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            padList(result, p + ch, up.substring(1));
        }
    }
}
