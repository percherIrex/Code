/**
 * 237. 删除链表中的节点
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int x) {
        val = x;
    }
}



public class Solution {

    ListNode head = new ListNode(-1);

    public static void main(String[] args) {

        //ListNode head = new ListNode(-1);
        //head.next
        ListNode p1 = new ListNode(4);
        ListNode p2 = new ListNode(5);
        ListNode p3 = new ListNode(1);
        ListNode p4 = new ListNode(9);


    }

    /***
     * 输入: head = [4,5,1,9], node = 5
     * 输出: [4,1,9]
     * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
     * 示例 2:
     *
     * 输入: head = [4,5,1,9], node = 1
     * 输出: [4,5,9]
     * 解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
     */

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
