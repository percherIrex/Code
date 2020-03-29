import java.util.Stack;

/**
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 */
public class Solution {

    /***
     * 示例 1:
     *
     * 输入: root = [3,1,4,null,2], k = 1
     *    3
     *   / \
     *  1   4
     *   \
     *    2
     * 输出: 4
     * 示例 2:
     *
     * 输入: root = [5,3,6,2,4,null,null,1], k = 3
     *        5
     *       / \
     *      3   6
     *     / \
     *    2   4
     *   /
     *  1
     * 输出: 4
     *
     * @param root
     * @param k
     * @return
     */
    public int kthLargest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }

        //栈
        Stack<TreeNode> stack = new Stack<>();
        search(root, stack);
        
        return stack.get(k - 1).val;


    }

    //中序遍历
    public void search(TreeNode root, Stack<TreeNode> stack) {

        if (root != null) {
            search(root.right, stack);
            stack.push(root);
            search(root.left, stack);
        }

    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}