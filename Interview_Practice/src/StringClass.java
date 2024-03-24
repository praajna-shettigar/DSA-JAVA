public class StringClass {

    public static void main(String[] args) {
        String a = "Praajna";
        String b = "Praajna";
        System.out.println(a==b);

        String str1 = new String("test");
        String str2 = new String("test");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
