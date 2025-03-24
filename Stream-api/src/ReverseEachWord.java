import java.util.Arrays;
import java.util.stream.Collectors;

//Reverse each word of a string using Java 8 streams?
public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";

        String rev = Arrays.stream(str.split(" ")).
                     map(s->new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
        System.out.println(rev);


    }
}
