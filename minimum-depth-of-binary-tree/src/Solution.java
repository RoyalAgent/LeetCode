
public class Solution {
    public int run(TreeNode root) {
        MinDepth minDepth = new MinDepth();
        return minDepth.minDepth(root);
    }
}

//定义树的结构
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class MinDepth{
    public int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        if(root.left == null){
            return minDepth(root.right)+1;
        }
        if(root.right == null){
            return minDepth(root.left)+1;
        }
        else{
            return Math.min(minDepth(root.left),minDepth(root.right))+1;
        }
    }
}