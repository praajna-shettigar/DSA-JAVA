package BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        phoneBuilder.setOs("IOS");
        phoneBuilder.setProcessor("xyz");
        Phone phone = phoneBuilder.build();
        System.out.println(phone);

    }
}
