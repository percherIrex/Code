/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class Solution {

    /***
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     */

    public ListNode reverseList(ListNode head) {
        //用栈超时，考虑头插法
        ListNode result = new ListNode(-1);
        ListNode p = head;
        while(p!=null){
            ListNode h = new ListNode(p.val);
            //System.out.println(h.val);
            h.next = result.next;
            result.next = h;
            p = p.next;
        }
        /*
        while(!stack.empty()){
            h.next = stack.pop();
            h = h.next;
        }*/
        return result.next;
    }
}
