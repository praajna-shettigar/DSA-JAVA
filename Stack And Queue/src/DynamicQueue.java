public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if (isFull()) {
            //double the array size
            int[] temp = new int[data.length * 2];

            //copy all previous items in new
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front+0)% data.length];
            }
            front = 0;
            end = data.length;

            data = temp;
        }



        return super.insert(item);
    }
}
