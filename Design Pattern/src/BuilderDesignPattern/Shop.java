package BuilderDesignPattern;

public class Shop {
    public static void main(String[] args) {
        //if we have to create phone object we have to mention the value for every arguments of construtor
        // that is the reason we are making use of one more class PhoneBuilder

        Phone p = new PhoneBuilder().setOS("IOS").setRam(2).getPhone();
        System.out.println(p);
    }
}
