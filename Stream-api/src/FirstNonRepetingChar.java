import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

//write a program to find first non-repeting element from the string
public class FirstNonRepetingChar {
    public static void main(String[] args) {
        String str = "ilovejavatechie";

        String firstNonRep = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).
                entrySet()
                .stream()
                .filter(s->s.getValue()==1)
                .findFirst().get().getKey();
        System.out.println(firstNonRep);

    }
}
