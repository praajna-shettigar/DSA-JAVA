interface Addable{
    int addition(int a,int b);
}

class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return a+b;
    }
}

public class LambdaArguments {
    public static void main(String[] args) {

        Addable add =   (int a, int b) ->  a+b;
        System.out.println(add.addition(3,2));

    }
}
