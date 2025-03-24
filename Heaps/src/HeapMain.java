public class HeapMain {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(34);
        heap.insert(54);
        heap.insert(12);
        heap.insert(23);
        heap.insert(39);
        System.out.println(heap.remove());
    }
}
