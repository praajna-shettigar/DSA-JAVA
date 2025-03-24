public class ImplementStackUsingLinkedList {

    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public static class LLStacck{
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int value = head.val;
            head = head.next;
            size--;
            return value;

        }

        void display(){
            dis(head);
            System.out.println();
        }

        private void dis(Node head){
            if(head==null){
                return;
            }
            Node top = head;
            dis(head.next);
            System.out.print(top.val+ "  ");
        }

        void peek(){
            System.out.println(head.val);
        }
    }


    public static void main(String[] args) {

        LLStacck st = new LLStacck();
        st.pop();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();
        st.push(4);
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();


    }
}
