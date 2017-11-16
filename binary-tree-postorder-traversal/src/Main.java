
import java.util.ArrayList;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Main {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> treeList = new ArrayList<>();
        PostOrder postOrder = new PostOrder();
        if(root == null){
            return treeList;
        }
        else{
            postOrder.getPostOrder(root,treeList);
        }
        return treeList;
    }
}

class PostOrder{
    public void getPostOrder(TreeNode node,ArrayList<Integer> list){
        if(node.left != null){
            getPostOrder(node.left,list);
        }
        if(node.right != null){
            getPostOrder(node.right,list);
        }
        list.add(node.val);
    }
}

