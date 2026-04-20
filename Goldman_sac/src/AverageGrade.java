import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageGrade {
    public static void main(String[] args) {
        String ss[][] = {
                {"Bobby","87"},
                {"Charles","100"},
                {"Eric","64"},
                {"Charles","22"}
        };
        averageGrade(ss);
    }

    public static void averageGrade(String[][] ss){

        Map<String, ArrayList<Integer>> map= new HashMap<>();

        String str = Arrays.stream(ss).collect(Collectors.groupingBy(s->s[0],Collectors.averagingInt(s->Integer.parseInt(s[1]))))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println("VAlue " + str);

        for(int i=0;i< ss.length;i++){
            String name = ss[i][0];
            int num = Integer.parseInt(ss[i][1]);
            map.putIfAbsent(name,new ArrayList<>());
            map.get(name).add(num);
        }
        System.out.println(map);
        int avg = 0;
        for (Map.Entry<String, ArrayList<Integer>> ma : map.entrySet()){
           int count = ma.getValue().size();
           int sum =0;
           for (Integer in : ma.getValue()){
               sum += in;
           }
           avg = Math.max(avg,sum/count);
        }
        System.out.println(avg);
    }
}
