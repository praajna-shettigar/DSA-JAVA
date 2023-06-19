//check for only unique number present in the array
public class CheckSingleElement {
    public static void main(String[] args) {
        int[] arr = {2,3,5,3,2,4,1,6,5,4,6,7,7};
        System.out.println(chek(arr));
    }

    private static int chek(int[] arr) {
        int uniq = 0;
        for(int n: arr){
            uniq = uniq ^ n;
        }
        return uniq;
    }
}
