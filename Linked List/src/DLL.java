public class DLL {

    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head !=null){
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        //this temp variable is used to traverse till end
        Node temp = head;

        if(head==null){
            node.prev=null;
            head = node;
            node.next=null;
            return;
        }

        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev=temp;
        node.next=null;
    }

    public Node find(int val){
        Node node = head;
        while (node!=null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //insert after the perticular index
    public void insert(int after,int val){
        Node p = find(after);

        if(p==null){
            System.out.println("Does not exist");
            return;
        }

        Node node=new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next !=null){
            node.next.prev = node;
        }
    }

    public void display(){
        Node node = head;
        while (node!=null){
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("END");
    }



    private class Node{
        private int value;
        private Node prev;
        private Node next;

        public Node(int val){
            this.value = val;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
