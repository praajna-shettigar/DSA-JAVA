import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

//find the elemetns who starts with one
public class NumberStratswithOne {
    public static  void main(String[] args) {
       int[] arr = {2,4,13,5,73,12,1,46,81};
     List<String> ar =  Arrays.stream(arr).boxed().map(s->s.toString()).filter(s->s.startsWith("1")).collect(Collectors.toList());
        System.out.println(ar);
    }
}
