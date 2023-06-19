import java.util.Arrays;

//Hacker Rank problem//Two stacks
public class SecondProblem {
    static int SecondProblem(int x,int[] a,int[] b){
        return SecondProblem(x,a,b,0,0)-1;
    }

    //here X is the maximum sum that can be achived
    // a and b will be the two array/stack
    //sum will be the current sum
    //count will be the value that should be returned
    private static int SecondProblem(int x,int[] a,int[] b,int sum,int count){
        if(sum>x){
            return count;
        }

        if(a.length==0||b.length==0){
            return count;
        }

        int ans1 = SecondProblem(x, Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
        int ans2 = SecondProblem(x, a,Arrays.copyOfRange(b,1,b.length),sum+a[0],count+1);

        return Math.max(ans1,ans2);
    }
}
