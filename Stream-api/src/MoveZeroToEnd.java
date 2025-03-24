
//Write code to move all zero in the right side of List using java 8 features
//List having positive,negative and zero elements also maintain the order of non-zero element in list

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZeroToEnd {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,0,-3,0,5,-2,0,8,0,-4);

        List<Integer> combined = Stream.concat(numbers.stream().filter(n->n!=0),numbers.stream().filter(n->n==0)).collect(Collectors.toList());
        System.out.println(combined);

    }
}
