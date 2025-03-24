package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ChcekedExcep {
    public static void main(String[] args)  {

//        FileReader fileReader = new FileReader("abv.txt");

        try {
            FileReader fileReader = new FileReader("abv.txt");

        }catch (FileNotFoundException a){
            System.out.println(a);
        }

//        test();

    }

//    public static void test()  {
//        throw new ArithmeticException();
//    }
}
