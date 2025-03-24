import java.util.HashSet;
import java.util.Set;

public class FindAllUniqueSubString {
    public static void main(String[] args) {
        String str = "abcabcdef";
        uniqueSubString(str,2);
    }
    public static void uniqueSubString(String str,int n){
        Set<String> set = new HashSet<>();

        for (int i=0;i<=str.length()-n;i++){
            set.add(str.substring(i,i+n));
        }
        System.out.println(set);
    }
}
