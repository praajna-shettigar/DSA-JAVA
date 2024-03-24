import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SumUsingReduce {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(8);

        int sum = list.stream().reduce(0,(a, b)->a+b);

        int prod = list.stream().reduce(1,(a,b)->a*b);

        System.out.println(sum);
        System.out.println(prod);

    }
}
