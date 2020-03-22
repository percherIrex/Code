/**
 * 给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。
 */
public class Solution {

    /***
     * 示例:
     * 给定有序数组: [-10,-3,0,5,9],
     *
     * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
     *
     *           0
     *          / \
     *        -3   9
     *        /   /
     *      -10  5
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return null;
        }

        //int left = 0, right = nums.length, mid = (left+right)/2;
        int mid = len/2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = sortedArrayToBST
                (Arrays.copyOfRange(nums,0,mid));
        treeNode.right = sortedArrayToBST
                (Arrays.copyOfRange(nums,mid+1,len));

        return treeNode;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */