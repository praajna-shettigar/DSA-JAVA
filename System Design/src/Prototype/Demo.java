package Prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("A1");
        bs.loadDate();


        BookShop bs1 =bs.clone();
        //removing from first object
        bs.getBooks().remove(1);
        bs1.setShopName("A2");
        bs1.loadDate();
        System.out.println(bs);
        System.out.println(bs1);
    }


}
