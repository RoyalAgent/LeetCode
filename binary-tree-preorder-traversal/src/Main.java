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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        test(root,list);
        return list;
    }

    public void test(TreeNode node,ArrayList<Integer> list){
        list.add(node.val);
        if(node.left != null){
            test(node.left,list);
        }
        if(node.right != null){
            test(node.right,list);
        }
    }
}
