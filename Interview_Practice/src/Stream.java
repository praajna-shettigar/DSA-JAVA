//Write program to find the name in list which started with 'A' character
//        using with java 8 feature
//        Input : ["Anurag","Aman","Ram","Raju"]
//        Output : ["Anurag","Aman"]

import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anurag","Aman","Ram","Raju");
        list.stream().filter(name->name.startsWith("A")).forEach(System.out::println);
    }
}
