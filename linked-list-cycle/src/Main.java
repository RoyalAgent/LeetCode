
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 *     ListNode() {
 *
 *     }
 * }
 */

public class Main {
    public boolean hasCycle(ListNode head) {
        Boolean status = false;
        if((head == null) || (head.next == null)){
            status = false;
        }else{
            ListNode fast = head;
            ListNode slow = head;
            while ((fast.next.next != null) && (fast.next != null)){
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow){
                    status = true;
                    break;
                }
            }
        }
        return status;
    }
}

