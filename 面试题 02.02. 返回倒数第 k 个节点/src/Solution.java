/**
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值
 */
public class Solution {

    /***
     * 输入： 1->2->3->4->5 和 k = 2
     * 输出： 4
     */
    public int kthToLast(ListNode head, int k) {
        ListNode p = head;
        int total = 0;
        while(p!=null){
            total++;
            p = p.next;
        }
        p = head;
        for(int i=0;i<total-k;i++){
            p = p.next;
        }

        return p.val;
    }
}
