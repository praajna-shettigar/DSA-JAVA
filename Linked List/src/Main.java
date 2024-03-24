public class Main {
    public static void main(String[] args) {

//        LL list = new LL();
//        list.insertFirst(2);
//        list.insertFirst(12);
//        list.insertFirst(22);
//        list.insertFirst(32);
//        list.insertLast(992);
//        list.insert(100,2);
//        list.display();
//        list.delete(2);
//        list.display();

//        DLL list = new DLL();
//        list.insertFirst(2);
//        list.insertFirst(12);
//        list.insertFirst(22);
//        list.insertLast(100);
//        list.display();
//        list.insert(12,65);
//        list.display();

        CLL list = new CLL();
        list.insert(2);
        list.insert(12);
        list.insert(22);
        list.insert(100);
        list.display();
        list.delete(100);
        list.display();

    }
}
