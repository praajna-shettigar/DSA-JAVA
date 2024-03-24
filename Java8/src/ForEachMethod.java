import java.util.Arrays;
import java.util.List;

public class ForEachMethod {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2,3,54,6,7);

        //for each method
        num.forEach(i -> System.out.println(i));


//        for (int i=0;i<num.size();i++){
//            System.out.println(num.get(i));
//        }

//        for(int i:num){
//            System.out.println(i);
//        }


    }
}
