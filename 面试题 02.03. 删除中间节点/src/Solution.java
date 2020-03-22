/**
 * 实现一种算法，删除单向链表中间的某个节点（除了第一个和最后一个节点，不一定是中间节点），假定你只能访问该节点。
 */
public class Solution {

    /***
     * 示例：
     *
     * 输入：单向链表a->b->c->d->e->f中的节点c
     * 结果：不返回任何数据，但该链表变为a->b->d->e->f
     * @param node
     */
    public void deleteNode(ListNode node) {
        //System.out.println(node.val);
        ListNode p = node;
        ListNode last = p;
        while(p.next != null){
            p.val = p.next.val;
            last = p;
            p = p.next;
        }
        last.next = null;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */