/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）
 */
public class Solution {

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode p = head;
        int total = 0;
        while(p!=null){
            total++;
            stack.push(p.val);
            p = p.next;
        }
        int[] result = new int[total];
        for(int i=0;i<total;i++){
            result[i] = stack.pop();
        }
        return result;
    }
}
