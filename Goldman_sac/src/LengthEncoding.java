public class LengthEncoding {
    public static void main(String[] args) {
        String str = "aaabbcccdaa";
        String res = "";

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int count = 1;
            while(count<str.length() && i+1<str.length()&& str.charAt(i+1)==ch){
                count++;
                i++;
            }
            res = res +ch+ count;
        }
        System.out.println(res);
        System.out.println(decoding(res));
    }

    public static String decoding(String str){
        String encoding = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            i++;
            int num = Character.getNumericValue(str.charAt(i));

            while(num>0){
                encoding += ch;
                num--;
            }

        }
        return encoding;
    }
}
