package Exception;

public class Excep {
    public static void main(String[] args) {
        int num1[] = {10,20,30,40};
        int num2[] = {10,20,0,40};
        for (int i = 0; i < num1.length; i++) {
            divide(num1[i],num2[i]);
        }
//        Student student = new Student();
//        System.out.println(student);

    }

    public static void divide(int a,int b){
        try {// Custom Checked Exception
            class MyCustomException extends Exception {
                public MyCustomException(String message) {
                    super(message);
                }
            }

            System.out.println(a/b);;
        }
        catch (ArithmeticException | NullPointerException p){
            System.out.println(p);
        }
//        catch (NullPointerException e){
//            System.out.println(e);
////            return -1;
//        }
        catch (Exception e){
            System.out.println(e);
//            return -1;

        }
    }


}
