/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的
 */
public class Solution {

    /***
     * 示例1：
     *
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode p = l1;
        ListNode q = l2;
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        while (p != null && q != null) {
            if (p.val < q.val) {
                temp.next = p;
                temp = temp.next;
                p = p.next;
            } else {
                temp.next = q;
                temp = temp.next;
                q = q.next;
            }
        }
        if (p != null) {
            temp.next = p;
        }
        if (q != null) {
            temp.next = q;
        }
        return head.next;
    }
}
