import java.util.Arrays;

//find the string with the highest length
public class LongestStringInArray {
    public static void main(String[] args) {
        String[] strArray = {"java","techie","springboot","microservice"};

        String longestString = Arrays.stream(strArray).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).stream().findFirst().get();
        System.out.println(longestString);
    }
}
