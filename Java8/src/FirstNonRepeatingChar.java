import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//first the first non-repeatubg char
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "Hello world";

       String v = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(c->c.getValue()==1).findFirst().get().getKey();
        System.out.println(v);

        //occurance of each char
        Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().sorted(Comparator.comparingLong(p->p.getValue()))
                .forEach(t-> System.out.println(t.getKey() + " "+ t.getValue()));

    }

}
