

//6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinString {
    public static void main(String[] args)
    {
        List<String> listOfStrings = List.of("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));

        System.out.println(joinedString);

        //do the same as above for string
        String name = "praajna";
        String joined = Arrays.stream(name.split("")).collect(Collectors.joining(",", "[","]"));
        System.out.println(joined);
    }
}
