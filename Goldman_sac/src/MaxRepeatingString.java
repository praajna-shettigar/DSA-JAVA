

//given a string find the start index and count of character repeating maximum times(continuous)

public class MaxRepeatingString {
    public static void main(String[] args) {
        String str = "aaabbbbbbbbcAAA";
        int start = 0;
        int count =0;
        int index = 0;
        while(index<str.length()){
            char ch = str.charAt(index);

            int innerCount = 0;
            while (index<str.length() && str.charAt(index)==ch){
                index++;
                innerCount++;
            }
            if(innerCount>count){
                count = innerCount;
                start = index-count;
            }

        }
        System.out.println("Start Index : " + start + " count "+count);
    }
}
