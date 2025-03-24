package FactortyDesignPattern;

public class FactoryMain {
    public static void main(String[] args) {
//        OS obj = new Android();  //instead of this make use of OperatingSystemFactiry class
//        obj.spec();
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Closed");
        obj.spec();
    }
}
