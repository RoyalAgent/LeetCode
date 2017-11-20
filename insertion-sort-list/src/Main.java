
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Main {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode c = head.next;  //未排序游动指针C
        head.next = null;
        ListNode pt, h;   //pt:临时节点指针，h：已排序部分游动指针

        while (c != null) {

            pt = c;
            c = c.next;
            pt.next = null;

            if (head.val > pt.val) { //比较头部
                pt.next = head;
                head = pt;
                continue;
            }

            h = head;
            while (h.next != null) { //比较有序部分
                if (h.next.val > pt.val) {
                    pt.next = h.next;
                    h.next = pt;
                    break;
                }

                h = h.next;
            }

            if (h.next == null) { //追加末尾
                h.next = pt;
            }
        }

        return head;
    }
}


