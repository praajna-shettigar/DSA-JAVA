public class Findithbit {
    public static void main(String[] args) {
        int num = 10; // 1010
        int k =2;
        if((num & (1<<k)) != 0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
