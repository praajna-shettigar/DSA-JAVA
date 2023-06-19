public class DynamicStack extends CustomStack{

    public DynamicStack() {
        super(); //it will call CustomStack()
    }

    public DynamicStack(int size){
        super(size);
    }


    //every other method is same as in the CustomStack
    //only push method work different
    //so we are overriding it
    @Override
    public boolean push(int item) {

        if (isFull()) {
            //double the array size
            int[] temp = new int[data.length * 2];

            //copy all previous items in new
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }
        //insert item
        return super.push(item);

    }

}
