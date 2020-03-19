import java.util.Stack;

/**
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * <p>
 * 请你返回该链表所表示数字的 十进制值 。
 */


class ListNode {
    int val;

    ListNode next = null;

    ListNode(int x) {
        val = x;
    }
}


public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(0);
        ListNode p3 = new ListNode(1);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;

        System.out.println(getDecimalValue(head));
        //want:2
        //System.out.println(1 << 3);

    }

    public static int getDecimalValue(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        int result = 0;
        ListNode p = head.next;
        while (p != null) {
            //System.out.println(p.val);
            stack.push(p.val);
            p = p.next;
        }
        int times = 0;
        while (!stack.empty()) {
            result += (stack.pop() << times);
            times++;
        }

        return result;
    }

}
