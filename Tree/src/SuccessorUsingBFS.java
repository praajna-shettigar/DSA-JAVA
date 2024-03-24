import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//asked in google
public class SuccessorUsingBFS {

    public static void main(String[] args) {

    }

    public TreeNode findSuccessor(TreeNode root,int key){
        if(root ==null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            TreeNode currentNode = queue.poll();
            if(currentNode.left !=null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right !=null){
                queue.offer(currentNode.right);
            }
            if(currentNode.val == key){
                break;
            }


        }
        return queue.peek();
    }
}
