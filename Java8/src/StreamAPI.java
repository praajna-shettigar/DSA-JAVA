import java.util.Arrays;
import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2,3,54,6,7);

//        num.stream()
//                .filter(n->n%2==1)
//                .sorted()
//                .map(n->n*2)
//                .forEach(n-> System.out.println(n));


       int val = num.stream()
                .filter(n->n%2==1)
                .sorted()
                .map(n->n*2)
                .reduce(0,(c,e)->e+c);
        System.out.println(val);
    }
}
