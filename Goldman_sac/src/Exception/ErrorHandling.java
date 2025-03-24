package Exception;

public class ErrorHandling {
    public static void main(String[] args) {
        method1(1);
    }

    public static void method1(int i) {
        try {
            System.out.println(i);
            method1(i+1);
        }catch (Throwable e){

            System.out.println(e);
        }
    }

//    public static void method2(){
//        System.out.println("Hello method2");
//        method1(10000);
//    }
}
