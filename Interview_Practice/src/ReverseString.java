public class ReverseString {

    public static void main(String[] args) {
        String str = "Praajna";
        String rev = "";
        for(char a:str.toCharArray()){
            rev = a+rev;
        }
        System.out.println(rev);
    }
}
