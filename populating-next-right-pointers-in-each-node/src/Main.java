
/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */

import java.util.*;

public class Main {
    if(root == null) {
        return ;
    }
    Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
    List<TreeLinkNode> list = new ArrayList<TreeLinkNode>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()) {
        TreeLinkNode node = queue.poll();
        if(node == null) {
            for(int i = 0; i < list.size() - 1; i++) {
                list.get(i).next = list.get(i + 1);
            }
            list.clear();
            if(queue.isEmpty()) {
                break;
            }
            queue.add(null);
        } else {
            list.add(node);
            if(node.left != null) {
                queue.add(node.left);
            }
            if(node.right != null) {
                queue.add(node.right);
            }
        }
    }
}
