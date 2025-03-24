public class BinarySearchTree {
    public class Node{
        int val;
        Node left;
        Node right;


        public Node(int value){
            this.val = value;
        }

    }
    private Node root;

    public  BinarySearchTree(){

    }

    public void insert(int value){
        root = insert(value,root);
    }

    public Node insert(int value,Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.val){
            node.left = insert(value,node.left);
        }
        if(value > node.val){
            node.right = insert(value,node.right);
        }
        return node;
    }

    public void inOrder(Node node){
        if(node ==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.val);
        inOrder(node.right);
    }

    public void preOrder(Node node){
        if(node ==null){
            return;
        }
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node){
        if(node ==null){
            return;
        }

        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.val);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(2);
        bst.insert(6);
        bst.insert(8);
        bst.insert(4);
        bst.inOrder(bst.root);
    }

}
