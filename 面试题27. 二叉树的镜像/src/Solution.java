/**
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * 例如输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 镜像输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 */
public class Solution {

    /***
     *示例 1：
     *
     * 输入：root = [4,2,7,1,3,6,9]
     * 输出：[4,7,2,9,6,3,1]
     * @param root
     * @return
     */
    public TreeNode mirrorTree(TreeNode root) {
        //递归交换左右子树
        if(root == null){
            return null;
        }
        if(root.left==null&&root.right==null){
            return root;
        }

        TreeNode p = root.right;
        root.right = mirrorTree(root.left);
        root.left = mirrorTree(p);

        return root;
    }
}
